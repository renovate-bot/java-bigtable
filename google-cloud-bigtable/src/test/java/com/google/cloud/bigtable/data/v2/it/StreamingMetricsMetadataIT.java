/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.data.v2.it;

import static com.google.cloud.bigtable.data.v2.it.MetricsITUtils.METRIC_DATA_NAME_CONTAINS;
import static com.google.cloud.bigtable.data.v2.it.MetricsITUtils.POINT_DATA_CLUSTER_ID_CONTAINS;
import static com.google.cloud.bigtable.data.v2.it.MetricsITUtils.POINT_DATA_ZONE_ID_CONTAINS;
import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.TruthJUnit.assume;

import com.google.api.core.ApiFuture;
import com.google.api.gax.rpc.NotFoundException;
import com.google.cloud.bigtable.admin.v2.models.Cluster;
import com.google.cloud.bigtable.data.v2.BigtableDataClient;
import com.google.cloud.bigtable.data.v2.BigtableDataSettings;
import com.google.cloud.bigtable.data.v2.models.Query;
import com.google.cloud.bigtable.data.v2.models.Row;
import com.google.cloud.bigtable.data.v2.stub.metrics.BuiltinMetricsConstants;
import com.google.cloud.bigtable.data.v2.stub.metrics.CustomOpenTelemetryMetricsProvider;
import com.google.cloud.bigtable.test_helpers.env.EmulatorEnv;
import com.google.cloud.bigtable.test_helpers.env.TestEnvRule;
import com.google.common.collect.Lists;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.SdkMeterProviderBuilder;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.testing.exporter.InMemoryMetricReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

public class StreamingMetricsMetadataIT {
  @ClassRule public static TestEnvRule testEnvRule = new TestEnvRule();

  private BigtableDataClient client;
  private InMemoryMetricReader metricReader;

  @Before
  public void setup() throws IOException {
    assume()
        .withMessage("StreamingMetricsMetadataIT is not supported on Emulator")
        .that(testEnvRule.env())
        .isNotInstanceOf(EmulatorEnv.class);

    BigtableDataSettings.Builder settings = testEnvRule.env().getDataClientSettings().toBuilder();

    metricReader = InMemoryMetricReader.create();

    SdkMeterProviderBuilder meterProvider =
        SdkMeterProvider.builder().registerMetricReader(metricReader);
    CustomOpenTelemetryMetricsProvider.setupSdkMeterProvider(meterProvider);
    OpenTelemetry openTelemetry =
        OpenTelemetrySdk.builder().setMeterProvider(meterProvider.build()).build();

    settings.setMetricsProvider(CustomOpenTelemetryMetricsProvider.create(openTelemetry));
    client = BigtableDataClient.create(settings.build());
  }

  @After
  public void tearDown() throws IOException {
    if (client != null) {
      client.close();
    }
  }

  @Test
  public void testSuccess() throws Exception {
    String prefix = UUID.randomUUID().toString();
    String uniqueKey = prefix + "-read";

    Query query = Query.create(testEnvRule.env().getTableId()).rowKey(uniqueKey);
    ArrayList<Row> rows = Lists.newArrayList(client.readRows(query));

    ApiFuture<List<Cluster>> clustersFuture =
        testEnvRule
            .env()
            .getInstanceAdminClient()
            .listClustersAsync(testEnvRule.env().getInstanceId());

    List<Cluster> clusters = clustersFuture.get(1, TimeUnit.MINUTES);

    Collection<MetricData> allMetricData = metricReader.collectAllMetrics();
    List<MetricData> metrics =
        metricReader.collectAllMetrics().stream()
            .filter(m -> m.getName().contains(BuiltinMetricsConstants.OPERATION_LATENCIES_NAME))
            .collect(Collectors.toList());

    assertThat(allMetricData)
        .comparingElementsUsing(METRIC_DATA_NAME_CONTAINS)
        .contains(BuiltinMetricsConstants.OPERATION_LATENCIES_NAME);
    assertThat(metrics).hasSize(1);

    MetricData metricData = metrics.get(0);
    List<PointData> pointData = new ArrayList<>(metricData.getData().getPoints());
    List<String> clusterAttributes =
        pointData.stream()
            .map(pd -> pd.getAttributes().get(BuiltinMetricsConstants.CLUSTER_ID_KEY))
            .collect(Collectors.toList());
    List<String> zoneAttributes =
        pointData.stream()
            .map(pd -> pd.getAttributes().get(BuiltinMetricsConstants.ZONE_ID_KEY))
            .collect(Collectors.toList());

    assertThat(pointData)
        .comparingElementsUsing(POINT_DATA_CLUSTER_ID_CONTAINS)
        .contains(clusters.get(0).getId());
    assertThat(pointData)
        .comparingElementsUsing(POINT_DATA_ZONE_ID_CONTAINS)
        .contains(clusters.get(0).getZone());
    assertThat(clusterAttributes).contains(clusters.get(0).getId());
    assertThat(zoneAttributes).contains(clusters.get(0).getZone());
  }

  @Test
  public void testFailure() {
    Query query = Query.create("non-exist-table");
    try {
      @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
      ArrayList<Row> ignored = Lists.newArrayList(client.readRows(query));
    } catch (NotFoundException ignored) {
    }

    Collection<MetricData> allMetricData = metricReader.collectAllMetrics();
    List<MetricData> metrics =
        metricReader.collectAllMetrics().stream()
            .filter(m -> m.getName().contains(BuiltinMetricsConstants.OPERATION_LATENCIES_NAME))
            .collect(Collectors.toList());

    assertThat(allMetricData)
        .comparingElementsUsing(METRIC_DATA_NAME_CONTAINS)
        .contains(BuiltinMetricsConstants.OPERATION_LATENCIES_NAME);
    assertThat(metrics).hasSize(1);

    MetricData metricData = metrics.get(0);
    List<PointData> pointData = new ArrayList<>(metricData.getData().getPoints());
    List<String> clusterAttributes =
        pointData.stream()
            .map(pd -> pd.getAttributes().get(BuiltinMetricsConstants.CLUSTER_ID_KEY))
            .collect(Collectors.toList());
    List<String> zoneAttributes =
        pointData.stream()
            .map(pd -> pd.getAttributes().get(BuiltinMetricsConstants.ZONE_ID_KEY))
            .collect(Collectors.toList());

    assertThat(pointData)
        .comparingElementsUsing(POINT_DATA_CLUSTER_ID_CONTAINS)
        .contains("<unspecified>");
    assertThat(pointData).comparingElementsUsing(POINT_DATA_ZONE_ID_CONTAINS).contains("global");
    assertThat(clusterAttributes).contains("<unspecified>");
    assertThat(zoneAttributes).contains("global");
  }
}
