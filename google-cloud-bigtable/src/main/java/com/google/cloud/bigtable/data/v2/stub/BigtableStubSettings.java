/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigtable.data.v2.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.InternalApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ServerStreamingCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.bigtable.v2.CheckAndMutateRowRequest;
import com.google.bigtable.v2.CheckAndMutateRowResponse;
import com.google.bigtable.v2.ExecuteQueryRequest;
import com.google.bigtable.v2.ExecuteQueryResponse;
import com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsRequest;
import com.google.bigtable.v2.GenerateInitialChangeStreamPartitionsResponse;
import com.google.bigtable.v2.MutateRowRequest;
import com.google.bigtable.v2.MutateRowResponse;
import com.google.bigtable.v2.MutateRowsRequest;
import com.google.bigtable.v2.MutateRowsResponse;
import com.google.bigtable.v2.PingAndWarmRequest;
import com.google.bigtable.v2.PingAndWarmResponse;
import com.google.bigtable.v2.PrepareQueryRequest;
import com.google.bigtable.v2.PrepareQueryResponse;
import com.google.bigtable.v2.ReadChangeStreamRequest;
import com.google.bigtable.v2.ReadChangeStreamResponse;
import com.google.bigtable.v2.ReadModifyWriteRowRequest;
import com.google.bigtable.v2.ReadModifyWriteRowResponse;
import com.google.bigtable.v2.ReadRowsRequest;
import com.google.bigtable.v2.ReadRowsResponse;
import com.google.bigtable.v2.SampleRowKeysRequest;
import com.google.bigtable.v2.SampleRowKeysResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** For internal use only. */
@Generated("by gapic-generator")
@InternalApi
public class BigtableStubSettings extends StubSettings<BigtableStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/bigtable.data")
          .add("https://www.googleapis.com/auth/bigtable.data.readonly")
          .add("https://www.googleapis.com/auth/cloud-bigtable.data")
          .add("https://www.googleapis.com/auth/cloud-bigtable.data.readonly")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/cloud-platform.read-only")
          .build();

  private final ServerStreamingCallSettings<ReadRowsRequest, ReadRowsResponse> readRowsSettings;
  private final ServerStreamingCallSettings<SampleRowKeysRequest, SampleRowKeysResponse>
      sampleRowKeysSettings;
  private final UnaryCallSettings<MutateRowRequest, MutateRowResponse> mutateRowSettings;
  private final ServerStreamingCallSettings<MutateRowsRequest, MutateRowsResponse>
      mutateRowsSettings;
  private final UnaryCallSettings<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
      checkAndMutateRowSettings;
  private final UnaryCallSettings<PingAndWarmRequest, PingAndWarmResponse> pingAndWarmSettings;
  private final UnaryCallSettings<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
      readModifyWriteRowSettings;
  private final ServerStreamingCallSettings<
          GenerateInitialChangeStreamPartitionsRequest,
          GenerateInitialChangeStreamPartitionsResponse>
      generateInitialChangeStreamPartitionsSettings;
  private final ServerStreamingCallSettings<ReadChangeStreamRequest, ReadChangeStreamResponse>
      readChangeStreamSettings;
  private final UnaryCallSettings<PrepareQueryRequest, PrepareQueryResponse> prepareQuerySettings;
  private final ServerStreamingCallSettings<ExecuteQueryRequest, ExecuteQueryResponse>
      executeQuerySettings;

  /** Returns the object with the settings used for calls to readRows. */
  public ServerStreamingCallSettings<ReadRowsRequest, ReadRowsResponse> readRowsSettings() {
    return readRowsSettings;
  }

  /** Returns the object with the settings used for calls to sampleRowKeys. */
  public ServerStreamingCallSettings<SampleRowKeysRequest, SampleRowKeysResponse>
      sampleRowKeysSettings() {
    return sampleRowKeysSettings;
  }

  /** Returns the object with the settings used for calls to mutateRow. */
  public UnaryCallSettings<MutateRowRequest, MutateRowResponse> mutateRowSettings() {
    return mutateRowSettings;
  }

  /** Returns the object with the settings used for calls to mutateRows. */
  public ServerStreamingCallSettings<MutateRowsRequest, MutateRowsResponse> mutateRowsSettings() {
    return mutateRowsSettings;
  }

  /** Returns the object with the settings used for calls to checkAndMutateRow. */
  public UnaryCallSettings<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
      checkAndMutateRowSettings() {
    return checkAndMutateRowSettings;
  }

  /** Returns the object with the settings used for calls to pingAndWarm. */
  public UnaryCallSettings<PingAndWarmRequest, PingAndWarmResponse> pingAndWarmSettings() {
    return pingAndWarmSettings;
  }

  /** Returns the object with the settings used for calls to readModifyWriteRow. */
  public UnaryCallSettings<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
      readModifyWriteRowSettings() {
    return readModifyWriteRowSettings;
  }

  /**
   * Returns the object with the settings used for calls to generateInitialChangeStreamPartitions.
   */
  public ServerStreamingCallSettings<
          GenerateInitialChangeStreamPartitionsRequest,
          GenerateInitialChangeStreamPartitionsResponse>
      generateInitialChangeStreamPartitionsSettings() {
    return generateInitialChangeStreamPartitionsSettings;
  }

  /** Returns the object with the settings used for calls to readChangeStream. */
  public ServerStreamingCallSettings<ReadChangeStreamRequest, ReadChangeStreamResponse>
      readChangeStreamSettings() {
    return readChangeStreamSettings;
  }

  /** Returns the object with the settings used for calls to prepareQuery. */
  public UnaryCallSettings<PrepareQueryRequest, PrepareQueryResponse> prepareQuerySettings() {
    return prepareQuerySettings;
  }

  /** Returns the object with the settings used for calls to executeQuery. */
  public ServerStreamingCallSettings<ExecuteQueryRequest, ExecuteQueryResponse>
      executeQuerySettings() {
    return executeQuerySettings;
  }

  public BigtableStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcBigtableStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "bigtable";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "bigtable.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "bigtable.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(BigtableStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected BigtableStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    readRowsSettings = settingsBuilder.readRowsSettings().build();
    sampleRowKeysSettings = settingsBuilder.sampleRowKeysSettings().build();
    mutateRowSettings = settingsBuilder.mutateRowSettings().build();
    mutateRowsSettings = settingsBuilder.mutateRowsSettings().build();
    checkAndMutateRowSettings = settingsBuilder.checkAndMutateRowSettings().build();
    pingAndWarmSettings = settingsBuilder.pingAndWarmSettings().build();
    readModifyWriteRowSettings = settingsBuilder.readModifyWriteRowSettings().build();
    generateInitialChangeStreamPartitionsSettings =
        settingsBuilder.generateInitialChangeStreamPartitionsSettings().build();
    readChangeStreamSettings = settingsBuilder.readChangeStreamSettings().build();
    prepareQuerySettings = settingsBuilder.prepareQuerySettings().build();
    executeQuerySettings = settingsBuilder.executeQuerySettings().build();
  }

  /** Builder for BigtableStubSettings. */
  public static class Builder extends StubSettings.Builder<BigtableStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final ServerStreamingCallSettings.Builder<ReadRowsRequest, ReadRowsResponse>
        readRowsSettings;
    private final ServerStreamingCallSettings.Builder<SampleRowKeysRequest, SampleRowKeysResponse>
        sampleRowKeysSettings;
    private final UnaryCallSettings.Builder<MutateRowRequest, MutateRowResponse> mutateRowSettings;
    private final ServerStreamingCallSettings.Builder<MutateRowsRequest, MutateRowsResponse>
        mutateRowsSettings;
    private final UnaryCallSettings.Builder<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
        checkAndMutateRowSettings;
    private final UnaryCallSettings.Builder<PingAndWarmRequest, PingAndWarmResponse>
        pingAndWarmSettings;
    private final UnaryCallSettings.Builder<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
        readModifyWriteRowSettings;
    private final ServerStreamingCallSettings.Builder<
            GenerateInitialChangeStreamPartitionsRequest,
            GenerateInitialChangeStreamPartitionsResponse>
        generateInitialChangeStreamPartitionsSettings;
    private final ServerStreamingCallSettings.Builder<
            ReadChangeStreamRequest, ReadChangeStreamResponse>
        readChangeStreamSettings;
    private final UnaryCallSettings.Builder<PrepareQueryRequest, PrepareQueryResponse>
        prepareQuerySettings;
    private final ServerStreamingCallSettings.Builder<ExecuteQueryRequest, ExecuteQueryResponse>
        executeQuerySettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_3_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_5_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      definitions.put(
          "no_retry_2_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_0_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_6_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "no_retry_7_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_4_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.DEADLINE_EXCEEDED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(43200000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(43200000L))
              .setTotalTimeoutDuration(Duration.ofMillis(43200000L))
              .build();
      definitions.put("no_retry_3_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(10L))
              .setRetryDelayMultiplier(2.0)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_5_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("no_retry_2_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(20000L))
              .setTotalTimeoutDuration(Duration.ofMillis(20000L))
              .build();
      definitions.put("no_retry_0_params", settings);
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(60000L))
              .setTotalTimeoutDuration(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_6_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeoutDuration(Duration.ofMillis(43200000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(43200000L))
              .setTotalTimeoutDuration(Duration.ofMillis(43200000L))
              .build();
      definitions.put("no_retry_7_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(10L))
              .setRetryDelayMultiplier(2.0)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(43200000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(43200000L))
              .setTotalTimeoutDuration(Duration.ofMillis(43200000L))
              .build();
      definitions.put("retry_policy_4_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      readRowsSettings = ServerStreamingCallSettings.newBuilder();
      sampleRowKeysSettings = ServerStreamingCallSettings.newBuilder();
      mutateRowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      mutateRowsSettings = ServerStreamingCallSettings.newBuilder();
      checkAndMutateRowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      pingAndWarmSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      readModifyWriteRowSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      generateInitialChangeStreamPartitionsSettings = ServerStreamingCallSettings.newBuilder();
      readChangeStreamSettings = ServerStreamingCallSettings.newBuilder();
      prepareQuerySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      executeQuerySettings = ServerStreamingCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateRowSettings,
              checkAndMutateRowSettings,
              pingAndWarmSettings,
              readModifyWriteRowSettings,
              prepareQuerySettings);
      initDefaults(this);
    }

    protected Builder(BigtableStubSettings settings) {
      super(settings);

      readRowsSettings = settings.readRowsSettings.toBuilder();
      sampleRowKeysSettings = settings.sampleRowKeysSettings.toBuilder();
      mutateRowSettings = settings.mutateRowSettings.toBuilder();
      mutateRowsSettings = settings.mutateRowsSettings.toBuilder();
      checkAndMutateRowSettings = settings.checkAndMutateRowSettings.toBuilder();
      pingAndWarmSettings = settings.pingAndWarmSettings.toBuilder();
      readModifyWriteRowSettings = settings.readModifyWriteRowSettings.toBuilder();
      generateInitialChangeStreamPartitionsSettings =
          settings.generateInitialChangeStreamPartitionsSettings.toBuilder();
      readChangeStreamSettings = settings.readChangeStreamSettings.toBuilder();
      prepareQuerySettings = settings.prepareQuerySettings.toBuilder();
      executeQuerySettings = settings.executeQuerySettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              mutateRowSettings,
              checkAndMutateRowSettings,
              pingAndWarmSettings,
              readModifyWriteRowSettings,
              prepareQuerySettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .readRowsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_3_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_3_params"));

      builder
          .sampleRowKeysSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .mutateRowSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_5_params"));

      builder
          .mutateRowsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_2_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_2_params"));

      builder
          .checkAndMutateRowSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .pingAndWarmSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .readModifyWriteRowSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_0_params"));

      builder
          .generateInitialChangeStreamPartitionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_6_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_6_params"));

      builder
          .readChangeStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_7_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_7_params"));

      builder
          .prepareQuerySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .executeQuerySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to readRows. */
    public ServerStreamingCallSettings.Builder<ReadRowsRequest, ReadRowsResponse>
        readRowsSettings() {
      return readRowsSettings;
    }

    /** Returns the builder for the settings used for calls to sampleRowKeys. */
    public ServerStreamingCallSettings.Builder<SampleRowKeysRequest, SampleRowKeysResponse>
        sampleRowKeysSettings() {
      return sampleRowKeysSettings;
    }

    /** Returns the builder for the settings used for calls to mutateRow. */
    public UnaryCallSettings.Builder<MutateRowRequest, MutateRowResponse> mutateRowSettings() {
      return mutateRowSettings;
    }

    /** Returns the builder for the settings used for calls to mutateRows. */
    public ServerStreamingCallSettings.Builder<MutateRowsRequest, MutateRowsResponse>
        mutateRowsSettings() {
      return mutateRowsSettings;
    }

    /** Returns the builder for the settings used for calls to checkAndMutateRow. */
    public UnaryCallSettings.Builder<CheckAndMutateRowRequest, CheckAndMutateRowResponse>
        checkAndMutateRowSettings() {
      return checkAndMutateRowSettings;
    }

    /** Returns the builder for the settings used for calls to pingAndWarm. */
    public UnaryCallSettings.Builder<PingAndWarmRequest, PingAndWarmResponse>
        pingAndWarmSettings() {
      return pingAndWarmSettings;
    }

    /** Returns the builder for the settings used for calls to readModifyWriteRow. */
    public UnaryCallSettings.Builder<ReadModifyWriteRowRequest, ReadModifyWriteRowResponse>
        readModifyWriteRowSettings() {
      return readModifyWriteRowSettings;
    }

    /**
     * Returns the builder for the settings used for calls to generateInitialChangeStreamPartitions.
     */
    public ServerStreamingCallSettings.Builder<
            GenerateInitialChangeStreamPartitionsRequest,
            GenerateInitialChangeStreamPartitionsResponse>
        generateInitialChangeStreamPartitionsSettings() {
      return generateInitialChangeStreamPartitionsSettings;
    }

    /** Returns the builder for the settings used for calls to readChangeStream. */
    public ServerStreamingCallSettings.Builder<ReadChangeStreamRequest, ReadChangeStreamResponse>
        readChangeStreamSettings() {
      return readChangeStreamSettings;
    }

    /** Returns the builder for the settings used for calls to prepareQuery. */
    public UnaryCallSettings.Builder<PrepareQueryRequest, PrepareQueryResponse>
        prepareQuerySettings() {
      return prepareQuerySettings;
    }

    /** Returns the builder for the settings used for calls to executeQuery. */
    public ServerStreamingCallSettings.Builder<ExecuteQueryRequest, ExecuteQueryResponse>
        executeQuerySettings() {
      return executeQuerySettings;
    }

    @Override
    public BigtableStubSettings build() throws IOException {
      return new BigtableStubSettings(this);
    }
  }
}
