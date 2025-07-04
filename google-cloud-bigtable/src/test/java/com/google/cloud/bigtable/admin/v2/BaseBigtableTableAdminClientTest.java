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

package com.google.cloud.bigtable.admin.v2;

import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListAuthorizedViewsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListBackupsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListSchemaBundlesPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListSnapshotsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListTablesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.resourcenames.ResourceName;
import com.google.bigtable.admin.v2.AuthorizedView;
import com.google.bigtable.admin.v2.AuthorizedViewName;
import com.google.bigtable.admin.v2.Backup;
import com.google.bigtable.admin.v2.BackupName;
import com.google.bigtable.admin.v2.ChangeStreamConfig;
import com.google.bigtable.admin.v2.CheckConsistencyRequest;
import com.google.bigtable.admin.v2.CheckConsistencyResponse;
import com.google.bigtable.admin.v2.ClusterName;
import com.google.bigtable.admin.v2.ColumnFamily;
import com.google.bigtable.admin.v2.CopyBackupRequest;
import com.google.bigtable.admin.v2.CreateAuthorizedViewRequest;
import com.google.bigtable.admin.v2.CreateBackupRequest;
import com.google.bigtable.admin.v2.CreateSchemaBundleRequest;
import com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest;
import com.google.bigtable.admin.v2.CreateTableRequest;
import com.google.bigtable.admin.v2.DeleteAuthorizedViewRequest;
import com.google.bigtable.admin.v2.DeleteBackupRequest;
import com.google.bigtable.admin.v2.DeleteSchemaBundleRequest;
import com.google.bigtable.admin.v2.DeleteSnapshotRequest;
import com.google.bigtable.admin.v2.DeleteTableRequest;
import com.google.bigtable.admin.v2.DropRowRangeRequest;
import com.google.bigtable.admin.v2.EncryptionInfo;
import com.google.bigtable.admin.v2.GenerateConsistencyTokenRequest;
import com.google.bigtable.admin.v2.GenerateConsistencyTokenResponse;
import com.google.bigtable.admin.v2.GetAuthorizedViewRequest;
import com.google.bigtable.admin.v2.GetBackupRequest;
import com.google.bigtable.admin.v2.GetSchemaBundleRequest;
import com.google.bigtable.admin.v2.GetSnapshotRequest;
import com.google.bigtable.admin.v2.GetTableRequest;
import com.google.bigtable.admin.v2.InstanceName;
import com.google.bigtable.admin.v2.ListAuthorizedViewsRequest;
import com.google.bigtable.admin.v2.ListAuthorizedViewsResponse;
import com.google.bigtable.admin.v2.ListBackupsRequest;
import com.google.bigtable.admin.v2.ListBackupsResponse;
import com.google.bigtable.admin.v2.ListSchemaBundlesRequest;
import com.google.bigtable.admin.v2.ListSchemaBundlesResponse;
import com.google.bigtable.admin.v2.ListSnapshotsRequest;
import com.google.bigtable.admin.v2.ListSnapshotsResponse;
import com.google.bigtable.admin.v2.ListTablesRequest;
import com.google.bigtable.admin.v2.ListTablesResponse;
import com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest;
import com.google.bigtable.admin.v2.RestoreInfo;
import com.google.bigtable.admin.v2.RestoreTableRequest;
import com.google.bigtable.admin.v2.SchemaBundle;
import com.google.bigtable.admin.v2.SchemaBundleName;
import com.google.bigtable.admin.v2.Snapshot;
import com.google.bigtable.admin.v2.SnapshotName;
import com.google.bigtable.admin.v2.SnapshotTableRequest;
import com.google.bigtable.admin.v2.Table;
import com.google.bigtable.admin.v2.TableName;
import com.google.bigtable.admin.v2.Type;
import com.google.bigtable.admin.v2.UndeleteTableRequest;
import com.google.bigtable.admin.v2.UpdateAuthorizedViewRequest;
import com.google.bigtable.admin.v2.UpdateBackupRequest;
import com.google.bigtable.admin.v2.UpdateSchemaBundleRequest;
import com.google.bigtable.admin.v2.UpdateTableRequest;
import com.google.common.collect.Lists;
import com.google.iam.v1.AuditConfig;
import com.google.iam.v1.Binding;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class BaseBigtableTableAdminClientTest {
  private static MockBigtableTableAdmin mockBigtableTableAdmin;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private BaseBigtableTableAdminClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockBigtableTableAdmin = new MockBigtableTableAdmin();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(), Arrays.<MockGrpcService>asList(mockBigtableTableAdmin));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    BaseBigtableTableAdminSettings settings =
        BaseBigtableTableAdminSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = BaseBigtableTableAdminClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void createTableTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
    String tableId = "tableId-1552905847";
    Table table = Table.newBuilder().build();

    Table actualResponse = client.createTable(parent, tableId, table);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTableRequest actualRequest = ((CreateTableRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(tableId, actualRequest.getTableId());
    Assert.assertEquals(table, actualRequest.getTable());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
      String tableId = "tableId-1552905847";
      Table table = Table.newBuilder().build();
      client.createTable(parent, tableId, table);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createTableTest2() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String parent = "parent-995424086";
    String tableId = "tableId-1552905847";
    Table table = Table.newBuilder().build();

    Table actualResponse = client.createTable(parent, tableId, table);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTableRequest actualRequest = ((CreateTableRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(tableId, actualRequest.getTableId());
    Assert.assertEquals(table, actualRequest.getTable());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTableExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String tableId = "tableId-1552905847";
      Table table = Table.newBuilder().build();
      client.createTable(parent, tableId, table);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createTableFromSnapshotTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createTableFromSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
    String tableId = "tableId-1552905847";
    SnapshotName sourceSnapshot =
        SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");

    Table actualResponse =
        client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTableFromSnapshotRequest actualRequest =
        ((CreateTableFromSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(tableId, actualRequest.getTableId());
    Assert.assertEquals(sourceSnapshot.toString(), actualRequest.getSourceSnapshot());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTableFromSnapshotExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
      String tableId = "tableId-1552905847";
      SnapshotName sourceSnapshot =
          SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
      client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createTableFromSnapshotTest2() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createTableFromSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
    String tableId = "tableId-1552905847";
    String sourceSnapshot = "sourceSnapshot-1078634753";

    Table actualResponse =
        client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTableFromSnapshotRequest actualRequest =
        ((CreateTableFromSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(tableId, actualRequest.getTableId());
    Assert.assertEquals(sourceSnapshot, actualRequest.getSourceSnapshot());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTableFromSnapshotExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
      String tableId = "tableId-1552905847";
      String sourceSnapshot = "sourceSnapshot-1078634753";
      client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createTableFromSnapshotTest3() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createTableFromSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    String tableId = "tableId-1552905847";
    SnapshotName sourceSnapshot =
        SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");

    Table actualResponse =
        client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTableFromSnapshotRequest actualRequest =
        ((CreateTableFromSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(tableId, actualRequest.getTableId());
    Assert.assertEquals(sourceSnapshot.toString(), actualRequest.getSourceSnapshot());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTableFromSnapshotExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String tableId = "tableId-1552905847";
      SnapshotName sourceSnapshot =
          SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
      client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createTableFromSnapshotTest4() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createTableFromSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    String tableId = "tableId-1552905847";
    String sourceSnapshot = "sourceSnapshot-1078634753";

    Table actualResponse =
        client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateTableFromSnapshotRequest actualRequest =
        ((CreateTableFromSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(tableId, actualRequest.getTableId());
    Assert.assertEquals(sourceSnapshot, actualRequest.getSourceSnapshot());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createTableFromSnapshotExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String tableId = "tableId-1552905847";
      String sourceSnapshot = "sourceSnapshot-1078634753";
      client.createTableFromSnapshotAsync(parent, tableId, sourceSnapshot).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listTablesTest() throws Exception {
    Table responsesElement = Table.newBuilder().build();
    ListTablesResponse expectedResponse =
        ListTablesResponse.newBuilder()
            .setNextPageToken("")
            .addAllTables(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");

    ListTablesPagedResponse pagedListResponse = client.listTables(parent);

    List<Table> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTablesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTablesRequest actualRequest = ((ListTablesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTablesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
      client.listTables(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listTablesTest2() throws Exception {
    Table responsesElement = Table.newBuilder().build();
    ListTablesResponse expectedResponse =
        ListTablesResponse.newBuilder()
            .setNextPageToken("")
            .addAllTables(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListTablesPagedResponse pagedListResponse = client.listTables(parent);

    List<Table> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getTablesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListTablesRequest actualRequest = ((ListTablesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listTablesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listTables(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTableTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");

    Table actualResponse = client.getTable(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTableRequest actualRequest = ((GetTableRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      client.getTable(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getTableTest2() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    Table actualResponse = client.getTable(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetTableRequest actualRequest = ((GetTableRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getTableExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.getTable(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateTableTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    Table table = Table.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Table actualResponse = client.updateTableAsync(table, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateTableRequest actualRequest = ((UpdateTableRequest) actualRequests.get(0));

    Assert.assertEquals(table, actualRequest.getTable());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      Table table = Table.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateTableAsync(table, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteTableTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");

    client.deleteTable(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTableRequest actualRequest = ((DeleteTableRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      client.deleteTable(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteTableTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteTable(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteTableRequest actualRequest = ((DeleteTableRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteTableExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.deleteTable(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void undeleteTableTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeleteTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");

    Table actualResponse = client.undeleteTableAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UndeleteTableRequest actualRequest = ((UndeleteTableRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void undeleteTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      client.undeleteTableAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void undeleteTableTest2() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("undeleteTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String name = "name3373707";

    Table actualResponse = client.undeleteTableAsync(name).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UndeleteTableRequest actualRequest = ((UndeleteTableRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void undeleteTableExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.undeleteTableAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createAuthorizedViewTest() throws Exception {
    AuthorizedView expectedResponse =
        AuthorizedView.newBuilder()
            .setName(
                AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
                    .toString())
            .setEtag("etag3123477")
            .setDeletionProtection(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createAuthorizedViewTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
    AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
    String authorizedViewId = "authorizedViewId-2074136549";

    AuthorizedView actualResponse =
        client.createAuthorizedViewAsync(parent, authorizedView, authorizedViewId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAuthorizedViewRequest actualRequest =
        ((CreateAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(authorizedView, actualRequest.getAuthorizedView());
    Assert.assertEquals(authorizedViewId, actualRequest.getAuthorizedViewId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAuthorizedViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
      String authorizedViewId = "authorizedViewId-2074136549";
      client.createAuthorizedViewAsync(parent, authorizedView, authorizedViewId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createAuthorizedViewTest2() throws Exception {
    AuthorizedView expectedResponse =
        AuthorizedView.newBuilder()
            .setName(
                AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
                    .toString())
            .setEtag("etag3123477")
            .setDeletionProtection(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createAuthorizedViewTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
    String authorizedViewId = "authorizedViewId-2074136549";

    AuthorizedView actualResponse =
        client.createAuthorizedViewAsync(parent, authorizedView, authorizedViewId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateAuthorizedViewRequest actualRequest =
        ((CreateAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(authorizedView, actualRequest.getAuthorizedView());
    Assert.assertEquals(authorizedViewId, actualRequest.getAuthorizedViewId());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createAuthorizedViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
      String authorizedViewId = "authorizedViewId-2074136549";
      client.createAuthorizedViewAsync(parent, authorizedView, authorizedViewId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void listAuthorizedViewsTest() throws Exception {
    AuthorizedView responsesElement = AuthorizedView.newBuilder().build();
    ListAuthorizedViewsResponse expectedResponse =
        ListAuthorizedViewsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAuthorizedViews(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");

    ListAuthorizedViewsPagedResponse pagedListResponse = client.listAuthorizedViews(parent);

    List<AuthorizedView> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAuthorizedViewsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAuthorizedViewsRequest actualRequest = ((ListAuthorizedViewsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAuthorizedViewsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      client.listAuthorizedViews(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listAuthorizedViewsTest2() throws Exception {
    AuthorizedView responsesElement = AuthorizedView.newBuilder().build();
    ListAuthorizedViewsResponse expectedResponse =
        ListAuthorizedViewsResponse.newBuilder()
            .setNextPageToken("")
            .addAllAuthorizedViews(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListAuthorizedViewsPagedResponse pagedListResponse = client.listAuthorizedViews(parent);

    List<AuthorizedView> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getAuthorizedViewsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListAuthorizedViewsRequest actualRequest = ((ListAuthorizedViewsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listAuthorizedViewsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listAuthorizedViews(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAuthorizedViewTest() throws Exception {
    AuthorizedView expectedResponse =
        AuthorizedView.newBuilder()
            .setName(
                AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
                    .toString())
            .setEtag("etag3123477")
            .setDeletionProtection(true)
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    AuthorizedViewName name =
        AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");

    AuthorizedView actualResponse = client.getAuthorizedView(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAuthorizedViewRequest actualRequest = ((GetAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAuthorizedViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      AuthorizedViewName name =
          AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
      client.getAuthorizedView(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getAuthorizedViewTest2() throws Exception {
    AuthorizedView expectedResponse =
        AuthorizedView.newBuilder()
            .setName(
                AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
                    .toString())
            .setEtag("etag3123477")
            .setDeletionProtection(true)
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    AuthorizedView actualResponse = client.getAuthorizedView(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetAuthorizedViewRequest actualRequest = ((GetAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getAuthorizedViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.getAuthorizedView(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateAuthorizedViewTest() throws Exception {
    AuthorizedView expectedResponse =
        AuthorizedView.newBuilder()
            .setName(
                AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
                    .toString())
            .setEtag("etag3123477")
            .setDeletionProtection(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateAuthorizedViewTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    AuthorizedView actualResponse =
        client.updateAuthorizedViewAsync(authorizedView, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateAuthorizedViewRequest actualRequest =
        ((UpdateAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(authorizedView, actualRequest.getAuthorizedView());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateAuthorizedViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateAuthorizedViewAsync(authorizedView, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void deleteAuthorizedViewTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    AuthorizedViewName name =
        AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");

    client.deleteAuthorizedView(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAuthorizedViewRequest actualRequest =
        ((DeleteAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAuthorizedViewExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      AuthorizedViewName name =
          AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
      client.deleteAuthorizedView(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteAuthorizedViewTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteAuthorizedView(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteAuthorizedViewRequest actualRequest =
        ((DeleteAuthorizedViewRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteAuthorizedViewExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.deleteAuthorizedView(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void modifyColumnFamiliesTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
    List<ModifyColumnFamiliesRequest.Modification> modifications = new ArrayList<>();

    Table actualResponse = client.modifyColumnFamilies(name, modifications);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ModifyColumnFamiliesRequest actualRequest =
        ((ModifyColumnFamiliesRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(modifications, actualRequest.getModificationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void modifyColumnFamiliesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      List<ModifyColumnFamiliesRequest.Modification> modifications = new ArrayList<>();
      client.modifyColumnFamilies(name, modifications);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void modifyColumnFamiliesTest2() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";
    List<ModifyColumnFamiliesRequest.Modification> modifications = new ArrayList<>();

    Table actualResponse = client.modifyColumnFamilies(name, modifications);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ModifyColumnFamiliesRequest actualRequest =
        ((ModifyColumnFamiliesRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(modifications, actualRequest.getModificationsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void modifyColumnFamiliesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      List<ModifyColumnFamiliesRequest.Modification> modifications = new ArrayList<>();
      client.modifyColumnFamilies(name, modifications);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void dropRowRangeTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    DropRowRangeRequest request =
        DropRowRangeRequest.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .build();

    client.dropRowRange(request);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DropRowRangeRequest actualRequest = ((DropRowRangeRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getRowKeyPrefix(), actualRequest.getRowKeyPrefix());
    Assert.assertEquals(
        request.getDeleteAllDataFromTable(), actualRequest.getDeleteAllDataFromTable());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void dropRowRangeExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      DropRowRangeRequest request =
          DropRowRangeRequest.newBuilder()
              .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
              .build();
      client.dropRowRange(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateConsistencyTokenTest() throws Exception {
    GenerateConsistencyTokenResponse expectedResponse =
        GenerateConsistencyTokenResponse.newBuilder()
            .setConsistencyToken("consistencyToken-1985152319")
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");

    GenerateConsistencyTokenResponse actualResponse = client.generateConsistencyToken(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateConsistencyTokenRequest actualRequest =
        ((GenerateConsistencyTokenRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateConsistencyTokenExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      client.generateConsistencyToken(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void generateConsistencyTokenTest2() throws Exception {
    GenerateConsistencyTokenResponse expectedResponse =
        GenerateConsistencyTokenResponse.newBuilder()
            .setConsistencyToken("consistencyToken-1985152319")
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    GenerateConsistencyTokenResponse actualResponse = client.generateConsistencyToken(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GenerateConsistencyTokenRequest actualRequest =
        ((GenerateConsistencyTokenRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void generateConsistencyTokenExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.generateConsistencyToken(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void checkConsistencyTest() throws Exception {
    CheckConsistencyResponse expectedResponse =
        CheckConsistencyResponse.newBuilder().setConsistent(true).build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
    String consistencyToken = "consistencyToken-1985152319";

    CheckConsistencyResponse actualResponse = client.checkConsistency(name, consistencyToken);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CheckConsistencyRequest actualRequest = ((CheckConsistencyRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(consistencyToken, actualRequest.getConsistencyToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void checkConsistencyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      String consistencyToken = "consistencyToken-1985152319";
      client.checkConsistency(name, consistencyToken);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void checkConsistencyTest2() throws Exception {
    CheckConsistencyResponse expectedResponse =
        CheckConsistencyResponse.newBuilder().setConsistent(true).build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";
    String consistencyToken = "consistencyToken-1985152319";

    CheckConsistencyResponse actualResponse = client.checkConsistency(name, consistencyToken);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CheckConsistencyRequest actualRequest = ((CheckConsistencyRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(consistencyToken, actualRequest.getConsistencyToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void checkConsistencyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      String consistencyToken = "consistencyToken-1985152319";
      client.checkConsistency(name, consistencyToken);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void snapshotTableTest() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
            .setSourceTable(Table.newBuilder().build())
            .setDataSizeBytes(-2110122398)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("snapshotTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
    ClusterName cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
    String snapshotId = "snapshotId-1113817601";
    String description = "description-1724546052";

    Snapshot actualResponse =
        client.snapshotTableAsync(name, cluster, snapshotId, description).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SnapshotTableRequest actualRequest = ((SnapshotTableRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(cluster.toString(), actualRequest.getCluster());
    Assert.assertEquals(snapshotId, actualRequest.getSnapshotId());
    Assert.assertEquals(description, actualRequest.getDescription());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void snapshotTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      ClusterName cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      String snapshotId = "snapshotId-1113817601";
      String description = "description-1724546052";
      client.snapshotTableAsync(name, cluster, snapshotId, description).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void snapshotTableTest2() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
            .setSourceTable(Table.newBuilder().build())
            .setDataSizeBytes(-2110122398)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("snapshotTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
    String cluster = "cluster872092154";
    String snapshotId = "snapshotId-1113817601";
    String description = "description-1724546052";

    Snapshot actualResponse =
        client.snapshotTableAsync(name, cluster, snapshotId, description).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SnapshotTableRequest actualRequest = ((SnapshotTableRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertEquals(cluster, actualRequest.getCluster());
    Assert.assertEquals(snapshotId, actualRequest.getSnapshotId());
    Assert.assertEquals(description, actualRequest.getDescription());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void snapshotTableExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      String cluster = "cluster872092154";
      String snapshotId = "snapshotId-1113817601";
      String description = "description-1724546052";
      client.snapshotTableAsync(name, cluster, snapshotId, description).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void snapshotTableTest3() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
            .setSourceTable(Table.newBuilder().build())
            .setDataSizeBytes(-2110122398)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("snapshotTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String name = "name3373707";
    ClusterName cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
    String snapshotId = "snapshotId-1113817601";
    String description = "description-1724546052";

    Snapshot actualResponse =
        client.snapshotTableAsync(name, cluster, snapshotId, description).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SnapshotTableRequest actualRequest = ((SnapshotTableRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(cluster.toString(), actualRequest.getCluster());
    Assert.assertEquals(snapshotId, actualRequest.getSnapshotId());
    Assert.assertEquals(description, actualRequest.getDescription());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void snapshotTableExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      ClusterName cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      String snapshotId = "snapshotId-1113817601";
      String description = "description-1724546052";
      client.snapshotTableAsync(name, cluster, snapshotId, description).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void snapshotTableTest4() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
            .setSourceTable(Table.newBuilder().build())
            .setDataSizeBytes(-2110122398)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("snapshotTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String name = "name3373707";
    String cluster = "cluster872092154";
    String snapshotId = "snapshotId-1113817601";
    String description = "description-1724546052";

    Snapshot actualResponse =
        client.snapshotTableAsync(name, cluster, snapshotId, description).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SnapshotTableRequest actualRequest = ((SnapshotTableRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertEquals(cluster, actualRequest.getCluster());
    Assert.assertEquals(snapshotId, actualRequest.getSnapshotId());
    Assert.assertEquals(description, actualRequest.getDescription());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void snapshotTableExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      String cluster = "cluster872092154";
      String snapshotId = "snapshotId-1113817601";
      String description = "description-1724546052";
      client.snapshotTableAsync(name, cluster, snapshotId, description).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getSnapshotTest() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
            .setSourceTable(Table.newBuilder().build())
            .setDataSizeBytes(-2110122398)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    SnapshotName name = SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");

    Snapshot actualResponse = client.getSnapshot(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSnapshotRequest actualRequest = ((GetSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSnapshotExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      SnapshotName name = SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
      client.getSnapshot(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSnapshotTest2() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
            .setSourceTable(Table.newBuilder().build())
            .setDataSizeBytes(-2110122398)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDeleteTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    Snapshot actualResponse = client.getSnapshot(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSnapshotRequest actualRequest = ((GetSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSnapshotExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.getSnapshot(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSnapshotsTest() throws Exception {
    Snapshot responsesElement = Snapshot.newBuilder().build();
    ListSnapshotsResponse expectedResponse =
        ListSnapshotsResponse.newBuilder()
            .setNextPageToken("")
            .addAllSnapshots(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");

    ListSnapshotsPagedResponse pagedListResponse = client.listSnapshots(parent);

    List<Snapshot> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSnapshotsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSnapshotsRequest actualRequest = ((ListSnapshotsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listSnapshotsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      client.listSnapshots(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSnapshotsTest2() throws Exception {
    Snapshot responsesElement = Snapshot.newBuilder().build();
    ListSnapshotsResponse expectedResponse =
        ListSnapshotsResponse.newBuilder()
            .setNextPageToken("")
            .addAllSnapshots(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListSnapshotsPagedResponse pagedListResponse = client.listSnapshots(parent);

    List<Snapshot> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSnapshotsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSnapshotsRequest actualRequest = ((ListSnapshotsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listSnapshotsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listSnapshots(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSnapshotTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    SnapshotName name = SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");

    client.deleteSnapshot(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSnapshotRequest actualRequest = ((DeleteSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteSnapshotExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      SnapshotName name = SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
      client.deleteSnapshot(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSnapshotTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteSnapshot(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSnapshotRequest actualRequest = ((DeleteSnapshotRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteSnapshotExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.deleteSnapshot(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
    String backupId = "backupId2121930365";
    Backup backup = Backup.newBuilder().build();

    Backup actualResponse = client.createBackupAsync(parent, backupId, backup).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateBackupRequest actualRequest = ((CreateBackupRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(backupId, actualRequest.getBackupId());
    Assert.assertEquals(backup, actualRequest.getBackup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createBackupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      String backupId = "backupId2121930365";
      Backup backup = Backup.newBuilder().build();
      client.createBackupAsync(parent, backupId, backup).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    String backupId = "backupId2121930365";
    Backup backup = Backup.newBuilder().build();

    Backup actualResponse = client.createBackupAsync(parent, backupId, backup).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateBackupRequest actualRequest = ((CreateBackupRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(backupId, actualRequest.getBackupId());
    Assert.assertEquals(backup, actualRequest.getBackup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createBackupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String backupId = "backupId2121930365";
      Backup backup = Backup.newBuilder().build();
      client.createBackupAsync(parent, backupId, backup).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    BackupName name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");

    Backup actualResponse = client.getBackup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBackupRequest actualRequest = ((GetBackupRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBackupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      BackupName name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
      client.getBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    Backup actualResponse = client.getBackup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetBackupRequest actualRequest = ((GetBackupRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getBackupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.getBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    Backup backup = Backup.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Backup actualResponse = client.updateBackup(backup, updateMask);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateBackupRequest actualRequest = ((UpdateBackupRequest) actualRequests.get(0));

    Assert.assertEquals(backup, actualRequest.getBackup());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateBackupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      Backup backup = Backup.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateBackup(backup, updateMask);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteBackupTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    BackupName name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");

    client.deleteBackup(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteBackupRequest actualRequest = ((DeleteBackupRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteBackupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      BackupName name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
      client.deleteBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteBackupTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteBackup(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteBackupRequest actualRequest = ((DeleteBackupRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteBackupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.deleteBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupsTest() throws Exception {
    Backup responsesElement = Backup.newBuilder().build();
    ListBackupsResponse expectedResponse =
        ListBackupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackups(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");

    ListBackupsPagedResponse pagedListResponse = client.listBackups(parent);

    List<Backup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBackupsRequest actualRequest = ((ListBackupsRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBackupsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      client.listBackups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupsTest2() throws Exception {
    Backup responsesElement = Backup.newBuilder().build();
    ListBackupsResponse expectedResponse =
        ListBackupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackups(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListBackupsPagedResponse pagedListResponse = client.listBackups(parent);

    List<Backup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListBackupsRequest actualRequest = ((ListBackupsRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listBackupsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listBackups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void restoreTableTest() throws Exception {
    Table expectedResponse =
        Table.newBuilder()
            .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
            .putAllClusterStates(new HashMap<String, Table.ClusterState>())
            .putAllColumnFamilies(new HashMap<String, ColumnFamily>())
            .setRestoreInfo(RestoreInfo.newBuilder().build())
            .setChangeStreamConfig(ChangeStreamConfig.newBuilder().build())
            .setDeletionProtection(true)
            .setRowKeySchema(Type.Struct.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("restoreTableTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    RestoreTableRequest request =
        RestoreTableRequest.newBuilder()
            .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
            .setTableId("tableId-1552905847")
            .build();

    Table actualResponse = client.restoreTableAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    RestoreTableRequest actualRequest = ((RestoreTableRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getTableId(), actualRequest.getTableId());
    Assert.assertEquals(request.getBackup(), actualRequest.getBackup());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void restoreTableExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      RestoreTableRequest request =
          RestoreTableRequest.newBuilder()
              .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
              .setTableId("tableId-1552905847")
              .build();
      client.restoreTableAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void copyBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("copyBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
    String backupId = "backupId2121930365";
    BackupName sourceBackup = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
    Timestamp expireTime = Timestamp.newBuilder().build();

    Backup actualResponse =
        client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CopyBackupRequest actualRequest = ((CopyBackupRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(backupId, actualRequest.getBackupId());
    Assert.assertEquals(sourceBackup.toString(), actualRequest.getSourceBackup());
    Assert.assertEquals(expireTime, actualRequest.getExpireTime());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void copyBackupExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      String backupId = "backupId2121930365";
      BackupName sourceBackup = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
      Timestamp expireTime = Timestamp.newBuilder().build();
      client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void copyBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("copyBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
    String backupId = "backupId2121930365";
    String sourceBackup = "sourceBackup823134653";
    Timestamp expireTime = Timestamp.newBuilder().build();

    Backup actualResponse =
        client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CopyBackupRequest actualRequest = ((CopyBackupRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(backupId, actualRequest.getBackupId());
    Assert.assertEquals(sourceBackup, actualRequest.getSourceBackup());
    Assert.assertEquals(expireTime, actualRequest.getExpireTime());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void copyBackupExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
      String backupId = "backupId2121930365";
      String sourceBackup = "sourceBackup823134653";
      Timestamp expireTime = Timestamp.newBuilder().build();
      client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void copyBackupTest3() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("copyBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    String backupId = "backupId2121930365";
    BackupName sourceBackup = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
    Timestamp expireTime = Timestamp.newBuilder().build();

    Backup actualResponse =
        client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CopyBackupRequest actualRequest = ((CopyBackupRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(backupId, actualRequest.getBackupId());
    Assert.assertEquals(sourceBackup.toString(), actualRequest.getSourceBackup());
    Assert.assertEquals(expireTime, actualRequest.getExpireTime());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void copyBackupExceptionTest3() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String backupId = "backupId2121930365";
      BackupName sourceBackup = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
      Timestamp expireTime = Timestamp.newBuilder().build();
      client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void copyBackupTest4() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
            .setSourceTable("sourceTable-95372173")
            .setSourceBackup("sourceBackup823134653")
            .setExpireTime(Timestamp.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setSizeBytes(-1796325715)
            .setEncryptionInfo(EncryptionInfo.newBuilder().build())
            .setHotToStandardTime(Timestamp.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("copyBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    String backupId = "backupId2121930365";
    String sourceBackup = "sourceBackup823134653";
    Timestamp expireTime = Timestamp.newBuilder().build();

    Backup actualResponse =
        client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CopyBackupRequest actualRequest = ((CopyBackupRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(backupId, actualRequest.getBackupId());
    Assert.assertEquals(sourceBackup, actualRequest.getSourceBackup());
    Assert.assertEquals(expireTime, actualRequest.getExpireTime());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void copyBackupExceptionTest4() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String backupId = "backupId2121930365";
      String sourceBackup = "sourceBackup823134653";
      Timestamp expireTime = Timestamp.newBuilder().build();
      client.copyBackupAsync(parent, backupId, sourceBackup, expireTime).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    ResourceName resource =
        AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");

    Policy actualResponse = client.getIamPolicy(resource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIamPolicyRequest actualRequest = ((GetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(resource.toString(), actualRequest.getResource());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ResourceName resource =
          AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
      client.getIamPolicy(resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getIamPolicyTest2() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String resource = "resource-341064690";

    Policy actualResponse = client.getIamPolicy(resource);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetIamPolicyRequest actualRequest = ((GetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(resource, actualRequest.getResource());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getIamPolicyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String resource = "resource-341064690";
      client.getIamPolicy(resource);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setIamPolicyTest() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    ResourceName resource =
        AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
    Policy policy = Policy.newBuilder().build();

    Policy actualResponse = client.setIamPolicy(resource, policy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetIamPolicyRequest actualRequest = ((SetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(resource.toString(), actualRequest.getResource());
    Assert.assertEquals(policy, actualRequest.getPolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void setIamPolicyExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ResourceName resource =
          AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
      Policy policy = Policy.newBuilder().build();
      client.setIamPolicy(resource, policy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void setIamPolicyTest2() throws Exception {
    Policy expectedResponse =
        Policy.newBuilder()
            .setVersion(351608024)
            .addAllBindings(new ArrayList<Binding>())
            .addAllAuditConfigs(new ArrayList<AuditConfig>())
            .setEtag(ByteString.EMPTY)
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String resource = "resource-341064690";
    Policy policy = Policy.newBuilder().build();

    Policy actualResponse = client.setIamPolicy(resource, policy);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    SetIamPolicyRequest actualRequest = ((SetIamPolicyRequest) actualRequests.get(0));

    Assert.assertEquals(resource, actualRequest.getResource());
    Assert.assertEquals(policy, actualRequest.getPolicy());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void setIamPolicyExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String resource = "resource-341064690";
      Policy policy = Policy.newBuilder().build();
      client.setIamPolicy(resource, policy);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void testIamPermissionsTest() throws Exception {
    TestIamPermissionsResponse expectedResponse =
        TestIamPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    ResourceName resource =
        AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
    List<String> permissions = new ArrayList<>();

    TestIamPermissionsResponse actualResponse = client.testIamPermissions(resource, permissions);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TestIamPermissionsRequest actualRequest = ((TestIamPermissionsRequest) actualRequests.get(0));

    Assert.assertEquals(resource.toString(), actualRequest.getResource());
    Assert.assertEquals(permissions, actualRequest.getPermissionsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void testIamPermissionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      ResourceName resource =
          AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
      List<String> permissions = new ArrayList<>();
      client.testIamPermissions(resource, permissions);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void testIamPermissionsTest2() throws Exception {
    TestIamPermissionsResponse expectedResponse =
        TestIamPermissionsResponse.newBuilder().addAllPermissions(new ArrayList<String>()).build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String resource = "resource-341064690";
    List<String> permissions = new ArrayList<>();

    TestIamPermissionsResponse actualResponse = client.testIamPermissions(resource, permissions);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    TestIamPermissionsRequest actualRequest = ((TestIamPermissionsRequest) actualRequests.get(0));

    Assert.assertEquals(resource, actualRequest.getResource());
    Assert.assertEquals(permissions, actualRequest.getPermissionsList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void testIamPermissionsExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String resource = "resource-341064690";
      List<String> permissions = new ArrayList<>();
      client.testIamPermissions(resource, permissions);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSchemaBundleTest() throws Exception {
    SchemaBundle expectedResponse =
        SchemaBundle.newBuilder()
            .setName(
                SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
                    .toString())
            .setEtag("etag3123477")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSchemaBundleTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
    String schemaBundleId = "schemaBundleId2039843326";
    SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();

    SchemaBundle actualResponse =
        client.createSchemaBundleAsync(parent, schemaBundleId, schemaBundle).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSchemaBundleRequest actualRequest = ((CreateSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertEquals(schemaBundleId, actualRequest.getSchemaBundleId());
    Assert.assertEquals(schemaBundle, actualRequest.getSchemaBundle());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createSchemaBundleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      String schemaBundleId = "schemaBundleId2039843326";
      SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
      client.createSchemaBundleAsync(parent, schemaBundleId, schemaBundle).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void createSchemaBundleTest2() throws Exception {
    SchemaBundle expectedResponse =
        SchemaBundle.newBuilder()
            .setName(
                SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
                    .toString())
            .setEtag("etag3123477")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSchemaBundleTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    String parent = "parent-995424086";
    String schemaBundleId = "schemaBundleId2039843326";
    SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();

    SchemaBundle actualResponse =
        client.createSchemaBundleAsync(parent, schemaBundleId, schemaBundle).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateSchemaBundleRequest actualRequest = ((CreateSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertEquals(schemaBundleId, actualRequest.getSchemaBundleId());
    Assert.assertEquals(schemaBundle, actualRequest.getSchemaBundle());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createSchemaBundleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      String schemaBundleId = "schemaBundleId2039843326";
      SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
      client.createSchemaBundleAsync(parent, schemaBundleId, schemaBundle).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void updateSchemaBundleTest() throws Exception {
    SchemaBundle expectedResponse =
        SchemaBundle.newBuilder()
            .setName(
                SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
                    .toString())
            .setEtag("etag3123477")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateSchemaBundleTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockBigtableTableAdmin.addResponse(resultOperation);

    SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    SchemaBundle actualResponse = client.updateSchemaBundleAsync(schemaBundle, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateSchemaBundleRequest actualRequest = ((UpdateSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(schemaBundle, actualRequest.getSchemaBundle());
    Assert.assertEquals(updateMask, actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateSchemaBundleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateSchemaBundleAsync(schemaBundle, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
      Assert.assertEquals(InvalidArgumentException.class, e.getCause().getClass());
      InvalidArgumentException apiException = ((InvalidArgumentException) e.getCause());
      Assert.assertEquals(StatusCode.Code.INVALID_ARGUMENT, apiException.getStatusCode().getCode());
    }
  }

  @Test
  public void getSchemaBundleTest() throws Exception {
    SchemaBundle expectedResponse =
        SchemaBundle.newBuilder()
            .setName(
                SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
                    .toString())
            .setEtag("etag3123477")
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    SchemaBundleName name =
        SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]");

    SchemaBundle actualResponse = client.getSchemaBundle(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSchemaBundleRequest actualRequest = ((GetSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSchemaBundleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      SchemaBundleName name =
          SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]");
      client.getSchemaBundle(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSchemaBundleTest2() throws Exception {
    SchemaBundle expectedResponse =
        SchemaBundle.newBuilder()
            .setName(
                SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
                    .toString())
            .setEtag("etag3123477")
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    SchemaBundle actualResponse = client.getSchemaBundle(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetSchemaBundleRequest actualRequest = ((GetSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getSchemaBundleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.getSchemaBundle(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSchemaBundlesTest() throws Exception {
    SchemaBundle responsesElement = SchemaBundle.newBuilder().build();
    ListSchemaBundlesResponse expectedResponse =
        ListSchemaBundlesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSchemaBundles(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");

    ListSchemaBundlesPagedResponse pagedListResponse = client.listSchemaBundles(parent);

    List<SchemaBundle> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSchemaBundlesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSchemaBundlesRequest actualRequest = ((ListSchemaBundlesRequest) actualRequests.get(0));

    Assert.assertEquals(parent.toString(), actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listSchemaBundlesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
      client.listSchemaBundles(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSchemaBundlesTest2() throws Exception {
    SchemaBundle responsesElement = SchemaBundle.newBuilder().build();
    ListSchemaBundlesResponse expectedResponse =
        ListSchemaBundlesResponse.newBuilder()
            .setNextPageToken("")
            .addAllSchemaBundles(Arrays.asList(responsesElement))
            .build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String parent = "parent-995424086";

    ListSchemaBundlesPagedResponse pagedListResponse = client.listSchemaBundles(parent);

    List<SchemaBundle> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSchemaBundlesList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListSchemaBundlesRequest actualRequest = ((ListSchemaBundlesRequest) actualRequests.get(0));

    Assert.assertEquals(parent, actualRequest.getParent());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listSchemaBundlesExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String parent = "parent-995424086";
      client.listSchemaBundles(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSchemaBundleTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    SchemaBundleName name =
        SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]");

    client.deleteSchemaBundle(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSchemaBundleRequest actualRequest = ((DeleteSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(name.toString(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteSchemaBundleExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      SchemaBundleName name =
          SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]");
      client.deleteSchemaBundle(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteSchemaBundleTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockBigtableTableAdmin.addResponse(expectedResponse);

    String name = "name3373707";

    client.deleteSchemaBundle(name);

    List<AbstractMessage> actualRequests = mockBigtableTableAdmin.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteSchemaBundleRequest actualRequest = ((DeleteSchemaBundleRequest) actualRequests.get(0));

    Assert.assertEquals(name, actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteSchemaBundleExceptionTest2() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockBigtableTableAdmin.addException(exception);

    try {
      String name = "name3373707";
      client.deleteSchemaBundle(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
