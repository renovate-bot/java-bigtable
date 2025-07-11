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

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.bigtable.admin.v2.AuthorizedView;
import com.google.bigtable.admin.v2.AuthorizedViewName;
import com.google.bigtable.admin.v2.Backup;
import com.google.bigtable.admin.v2.BackupName;
import com.google.bigtable.admin.v2.CheckConsistencyRequest;
import com.google.bigtable.admin.v2.CheckConsistencyResponse;
import com.google.bigtable.admin.v2.ClusterName;
import com.google.bigtable.admin.v2.CopyBackupMetadata;
import com.google.bigtable.admin.v2.CopyBackupRequest;
import com.google.bigtable.admin.v2.CreateAuthorizedViewMetadata;
import com.google.bigtable.admin.v2.CreateAuthorizedViewRequest;
import com.google.bigtable.admin.v2.CreateBackupMetadata;
import com.google.bigtable.admin.v2.CreateBackupRequest;
import com.google.bigtable.admin.v2.CreateSchemaBundleMetadata;
import com.google.bigtable.admin.v2.CreateSchemaBundleRequest;
import com.google.bigtable.admin.v2.CreateTableFromSnapshotMetadata;
import com.google.bigtable.admin.v2.CreateTableFromSnapshotRequest;
import com.google.bigtable.admin.v2.CreateTableRequest;
import com.google.bigtable.admin.v2.DeleteAuthorizedViewRequest;
import com.google.bigtable.admin.v2.DeleteBackupRequest;
import com.google.bigtable.admin.v2.DeleteSchemaBundleRequest;
import com.google.bigtable.admin.v2.DeleteSnapshotRequest;
import com.google.bigtable.admin.v2.DeleteTableRequest;
import com.google.bigtable.admin.v2.DropRowRangeRequest;
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
import com.google.bigtable.admin.v2.RestoreTableMetadata;
import com.google.bigtable.admin.v2.RestoreTableRequest;
import com.google.bigtable.admin.v2.SchemaBundle;
import com.google.bigtable.admin.v2.SchemaBundleName;
import com.google.bigtable.admin.v2.Snapshot;
import com.google.bigtable.admin.v2.SnapshotName;
import com.google.bigtable.admin.v2.SnapshotTableMetadata;
import com.google.bigtable.admin.v2.SnapshotTableRequest;
import com.google.bigtable.admin.v2.Table;
import com.google.bigtable.admin.v2.TableName;
import com.google.bigtable.admin.v2.UndeleteTableMetadata;
import com.google.bigtable.admin.v2.UndeleteTableRequest;
import com.google.bigtable.admin.v2.UpdateAuthorizedViewMetadata;
import com.google.bigtable.admin.v2.UpdateAuthorizedViewRequest;
import com.google.bigtable.admin.v2.UpdateBackupRequest;
import com.google.bigtable.admin.v2.UpdateSchemaBundleMetadata;
import com.google.bigtable.admin.v2.UpdateSchemaBundleRequest;
import com.google.bigtable.admin.v2.UpdateTableMetadata;
import com.google.bigtable.admin.v2.UpdateTableRequest;
import com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStub;
import com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** For internal use only. */
@Generated("by gapic-generator")
@InternalApi
public class BaseBigtableTableAdminClient implements BackgroundResource {
  private final BaseBigtableTableAdminSettings settings;
  private final BigtableTableAdminStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of BaseBigtableTableAdminClient with default settings. */
  public static final BaseBigtableTableAdminClient create() throws IOException {
    return create(BaseBigtableTableAdminSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BaseBigtableTableAdminClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BaseBigtableTableAdminClient create(BaseBigtableTableAdminSettings settings)
      throws IOException {
    return new BaseBigtableTableAdminClient(settings);
  }

  /**
   * Constructs an instance of BaseBigtableTableAdminClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(BaseBigtableTableAdminSettings).
   */
  public static final BaseBigtableTableAdminClient create(BigtableTableAdminStub stub) {
    return new BaseBigtableTableAdminClient(stub);
  }

  /**
   * Constructs an instance of BaseBigtableTableAdminClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected BaseBigtableTableAdminClient(BaseBigtableTableAdminSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((BigtableTableAdminStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  protected BaseBigtableTableAdminClient(BigtableTableAdminStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final BaseBigtableTableAdminSettings getSettings() {
    return settings;
  }

  public BigtableTableAdminStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table in the specified instance. The table can be created with a full set of
   * initial column families, specified in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
   *   String tableId = "tableId-1552905847";
   *   Table table = Table.newBuilder().build();
   *   Table response = baseBigtableTableAdminClient.createTable(parent, tableId, table);
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance in which to create the table. Values
   *     are of the form `projects/{project}/instances/{instance}`.
   * @param tableId Required. The name by which the new table should be referred to within the
   *     parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`. Maximum 50
   *     characters.
   * @param table Required. The Table to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table createTable(InstanceName parent, String tableId, Table table) {
    CreateTableRequest request =
        CreateTableRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTableId(tableId)
            .setTable(table)
            .build();
    return createTable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table in the specified instance. The table can be created with a full set of
   * initial column families, specified in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = InstanceName.of("[PROJECT]", "[INSTANCE]").toString();
   *   String tableId = "tableId-1552905847";
   *   Table table = Table.newBuilder().build();
   *   Table response = baseBigtableTableAdminClient.createTable(parent, tableId, table);
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance in which to create the table. Values
   *     are of the form `projects/{project}/instances/{instance}`.
   * @param tableId Required. The name by which the new table should be referred to within the
   *     parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`. Maximum 50
   *     characters.
   * @param table Required. The Table to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table createTable(String parent, String tableId, Table table) {
    CreateTableRequest request =
        CreateTableRequest.newBuilder()
            .setParent(parent)
            .setTableId(tableId)
            .setTable(table)
            .build();
    return createTable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table in the specified instance. The table can be created with a full set of
   * initial column families, specified in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateTableRequest request =
   *       CreateTableRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .setTable(Table.newBuilder().build())
   *           .addAllInitialSplits(new ArrayList<CreateTableRequest.Split>())
   *           .build();
   *   Table response = baseBigtableTableAdminClient.createTable(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table createTable(CreateTableRequest request) {
    return createTableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table in the specified instance. The table can be created with a full set of
   * initial column families, specified in the request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateTableRequest request =
   *       CreateTableRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .setTable(Table.newBuilder().build())
   *           .addAllInitialSplits(new ArrayList<CreateTableRequest.Split>())
   *           .build();
   *   ApiFuture<Table> future =
   *       baseBigtableTableAdminClient.createTableCallable().futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateTableRequest, Table> createTableCallable() {
    return stub.createTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
   *   String tableId = "tableId-1552905847";
   *   SnapshotName sourceSnapshot =
   *       SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
   *   Table response =
   *       baseBigtableTableAdminClient
   *           .createTableFromSnapshotAsync(parent, tableId, sourceSnapshot)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance in which to create the table. Values
   *     are of the form `projects/{project}/instances/{instance}`.
   * @param tableId Required. The name by which the new table should be referred to within the
   *     parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`.
   * @param sourceSnapshot Required. The unique name of the snapshot from which to restore the
   *     table. The snapshot and the table must be in the same instance. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, CreateTableFromSnapshotMetadata> createTableFromSnapshotAsync(
      InstanceName parent, String tableId, SnapshotName sourceSnapshot) {
    CreateTableFromSnapshotRequest request =
        CreateTableFromSnapshotRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTableId(tableId)
            .setSourceSnapshot(sourceSnapshot == null ? null : sourceSnapshot.toString())
            .build();
    return createTableFromSnapshotAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
   *   String tableId = "tableId-1552905847";
   *   String sourceSnapshot =
   *       SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString();
   *   Table response =
   *       baseBigtableTableAdminClient
   *           .createTableFromSnapshotAsync(parent, tableId, sourceSnapshot)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance in which to create the table. Values
   *     are of the form `projects/{project}/instances/{instance}`.
   * @param tableId Required. The name by which the new table should be referred to within the
   *     parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`.
   * @param sourceSnapshot Required. The unique name of the snapshot from which to restore the
   *     table. The snapshot and the table must be in the same instance. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, CreateTableFromSnapshotMetadata> createTableFromSnapshotAsync(
      InstanceName parent, String tableId, String sourceSnapshot) {
    CreateTableFromSnapshotRequest request =
        CreateTableFromSnapshotRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTableId(tableId)
            .setSourceSnapshot(sourceSnapshot)
            .build();
    return createTableFromSnapshotAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = InstanceName.of("[PROJECT]", "[INSTANCE]").toString();
   *   String tableId = "tableId-1552905847";
   *   SnapshotName sourceSnapshot =
   *       SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
   *   Table response =
   *       baseBigtableTableAdminClient
   *           .createTableFromSnapshotAsync(parent, tableId, sourceSnapshot)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance in which to create the table. Values
   *     are of the form `projects/{project}/instances/{instance}`.
   * @param tableId Required. The name by which the new table should be referred to within the
   *     parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`.
   * @param sourceSnapshot Required. The unique name of the snapshot from which to restore the
   *     table. The snapshot and the table must be in the same instance. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, CreateTableFromSnapshotMetadata> createTableFromSnapshotAsync(
      String parent, String tableId, SnapshotName sourceSnapshot) {
    CreateTableFromSnapshotRequest request =
        CreateTableFromSnapshotRequest.newBuilder()
            .setParent(parent)
            .setTableId(tableId)
            .setSourceSnapshot(sourceSnapshot == null ? null : sourceSnapshot.toString())
            .build();
    return createTableFromSnapshotAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = InstanceName.of("[PROJECT]", "[INSTANCE]").toString();
   *   String tableId = "tableId-1552905847";
   *   String sourceSnapshot =
   *       SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString();
   *   Table response =
   *       baseBigtableTableAdminClient
   *           .createTableFromSnapshotAsync(parent, tableId, sourceSnapshot)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance in which to create the table. Values
   *     are of the form `projects/{project}/instances/{instance}`.
   * @param tableId Required. The name by which the new table should be referred to within the
   *     parent instance, e.g., `foobar` rather than `{parent}/tables/foobar`.
   * @param sourceSnapshot Required. The unique name of the snapshot from which to restore the
   *     table. The snapshot and the table must be in the same instance. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, CreateTableFromSnapshotMetadata> createTableFromSnapshotAsync(
      String parent, String tableId, String sourceSnapshot) {
    CreateTableFromSnapshotRequest request =
        CreateTableFromSnapshotRequest.newBuilder()
            .setParent(parent)
            .setTableId(tableId)
            .setSourceSnapshot(sourceSnapshot)
            .build();
    return createTableFromSnapshotAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateTableFromSnapshotRequest request =
   *       CreateTableFromSnapshotRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .setSourceSnapshot(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   Table response = baseBigtableTableAdminClient.createTableFromSnapshotAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, CreateTableFromSnapshotMetadata> createTableFromSnapshotAsync(
      CreateTableFromSnapshotRequest request) {
    return createTableFromSnapshotOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateTableFromSnapshotRequest request =
   *       CreateTableFromSnapshotRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .setSourceSnapshot(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   OperationFuture<Table, CreateTableFromSnapshotMetadata> future =
   *       baseBigtableTableAdminClient
   *           .createTableFromSnapshotOperationCallable()
   *           .futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateTableFromSnapshotRequest, Table, CreateTableFromSnapshotMetadata>
      createTableFromSnapshotOperationCallable() {
    return stub.createTableFromSnapshotOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new table from the specified snapshot. The target table must not exist. The snapshot
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateTableFromSnapshotRequest request =
   *       CreateTableFromSnapshotRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .setSourceSnapshot(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.createTableFromSnapshotCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateTableFromSnapshotRequest, Operation>
      createTableFromSnapshotCallable() {
    return stub.createTableFromSnapshotCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all tables served from a specified instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   InstanceName parent = InstanceName.of("[PROJECT]", "[INSTANCE]");
   *   for (Table element : baseBigtableTableAdminClient.listTables(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance for which tables should be listed.
   *     Values are of the form `projects/{project}/instances/{instance}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTablesPagedResponse listTables(InstanceName parent) {
    ListTablesRequest request =
        ListTablesRequest.newBuilder().setParent(parent == null ? null : parent.toString()).build();
    return listTables(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all tables served from a specified instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = InstanceName.of("[PROJECT]", "[INSTANCE]").toString();
   *   for (Table element : baseBigtableTableAdminClient.listTables(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the instance for which tables should be listed.
   *     Values are of the form `projects/{project}/instances/{instance}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTablesPagedResponse listTables(String parent) {
    ListTablesRequest request = ListTablesRequest.newBuilder().setParent(parent).build();
    return listTables(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all tables served from a specified instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListTablesRequest request =
   *       ListTablesRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Table element : baseBigtableTableAdminClient.listTables(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTablesPagedResponse listTables(ListTablesRequest request) {
    return listTablesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all tables served from a specified instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListTablesRequest request =
   *       ListTablesRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Table> future =
   *       baseBigtableTableAdminClient.listTablesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Table element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListTablesRequest, ListTablesPagedResponse> listTablesPagedCallable() {
    return stub.listTablesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all tables served from a specified instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListTablesRequest request =
   *       ListTablesRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListTablesResponse response =
   *         baseBigtableTableAdminClient.listTablesCallable().call(request);
   *     for (Table element : response.getTablesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListTablesRequest, ListTablesResponse> listTablesCallable() {
    return stub.listTablesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   Table response = baseBigtableTableAdminClient.getTable(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the requested table. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table getTable(TableName name) {
    GetTableRequest request =
        GetTableRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getTable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   Table response = baseBigtableTableAdminClient.getTable(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the requested table. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table getTable(String name) {
    GetTableRequest request = GetTableRequest.newBuilder().setName(name).build();
    return getTable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetTableRequest request =
   *       GetTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   Table response = baseBigtableTableAdminClient.getTable(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table getTable(GetTableRequest request) {
    return getTableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetTableRequest request =
   *       GetTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   ApiFuture<Table> future = baseBigtableTableAdminClient.getTableCallable().futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetTableRequest, Table> getTableCallable() {
    return stub.getTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   Table table = Table.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Table response = baseBigtableTableAdminClient.updateTableAsync(table, updateMask).get();
   * }
   * }</pre>
   *
   * @param table Required. The table to update. The table's `name` field is used to identify the
   *     table to update.
   * @param updateMask Required. The list of fields to update. A mask specifying which fields (e.g.
   *     `change_stream_config`) in the `table` field should be updated. This mask is relative to
   *     the `table` field, not to the request message. The wildcard (&#42;) path is currently not
   *     supported. Currently UpdateTable is only supported for the following fields:
   *     <ul>
   *       <li>`change_stream_config`
   *       <li>`change_stream_config.retention_period`
   *       <li>`deletion_protection`
   *       <li>`row_key_schema`
   *     </ul>
   *     <p>If `column_families` is set in `update_mask`, it will return an UNIMPLEMENTED error.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, UpdateTableMetadata> updateTableAsync(
      Table table, FieldMask updateMask) {
    UpdateTableRequest request =
        UpdateTableRequest.newBuilder().setTable(table).setUpdateMask(updateMask).build();
    return updateTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateTableRequest request =
   *       UpdateTableRequest.newBuilder()
   *           .setTable(Table.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   Table response = baseBigtableTableAdminClient.updateTableAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, UpdateTableMetadata> updateTableAsync(
      UpdateTableRequest request) {
    return updateTableOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateTableRequest request =
   *       UpdateTableRequest.newBuilder()
   *           .setTable(Table.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   OperationFuture<Table, UpdateTableMetadata> future =
   *       baseBigtableTableAdminClient.updateTableOperationCallable().futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateTableRequest, Table, UpdateTableMetadata>
      updateTableOperationCallable() {
    return stub.updateTableOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateTableRequest request =
   *       UpdateTableRequest.newBuilder()
   *           .setTable(Table.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.updateTableCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateTableRequest, Operation> updateTableCallable() {
    return stub.updateTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified table and all of its data.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   baseBigtableTableAdminClient.deleteTable(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to be deleted. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTable(TableName name) {
    DeleteTableRequest request =
        DeleteTableRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteTable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified table and all of its data.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   baseBigtableTableAdminClient.deleteTable(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to be deleted. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTable(String name) {
    DeleteTableRequest request = DeleteTableRequest.newBuilder().setName(name).build();
    deleteTable(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified table and all of its data.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteTableRequest request =
   *       DeleteTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   baseBigtableTableAdminClient.deleteTable(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteTable(DeleteTableRequest request) {
    deleteTableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified table and all of its data.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteTableRequest request =
   *       DeleteTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigtableTableAdminClient.deleteTableCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteTableRequest, Empty> deleteTableCallable() {
    return stub.deleteTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restores a specified table which was accidentally deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   Table response = baseBigtableTableAdminClient.undeleteTableAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to be restored. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, UndeleteTableMetadata> undeleteTableAsync(TableName name) {
    UndeleteTableRequest request =
        UndeleteTableRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return undeleteTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restores a specified table which was accidentally deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   Table response = baseBigtableTableAdminClient.undeleteTableAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to be restored. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, UndeleteTableMetadata> undeleteTableAsync(String name) {
    UndeleteTableRequest request = UndeleteTableRequest.newBuilder().setName(name).build();
    return undeleteTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restores a specified table which was accidentally deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UndeleteTableRequest request =
   *       UndeleteTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   Table response = baseBigtableTableAdminClient.undeleteTableAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, UndeleteTableMetadata> undeleteTableAsync(
      UndeleteTableRequest request) {
    return undeleteTableOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restores a specified table which was accidentally deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UndeleteTableRequest request =
   *       UndeleteTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   OperationFuture<Table, UndeleteTableMetadata> future =
   *       baseBigtableTableAdminClient.undeleteTableOperationCallable().futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UndeleteTableRequest, Table, UndeleteTableMetadata>
      undeleteTableOperationCallable() {
    return stub.undeleteTableOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Restores a specified table which was accidentally deleted.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UndeleteTableRequest request =
   *       UndeleteTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.undeleteTableCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UndeleteTableRequest, Operation> undeleteTableCallable() {
    return stub.undeleteTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
   *   String authorizedViewId = "authorizedViewId-2074136549";
   *   AuthorizedView response =
   *       baseBigtableTableAdminClient
   *           .createAuthorizedViewAsync(parent, authorizedView, authorizedViewId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. This is the name of the table the AuthorizedView belongs to. Values are
   *     of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param authorizedView Required. The AuthorizedView to create.
   * @param authorizedViewId Required. The id of the AuthorizedView to create. This AuthorizedView
   *     must not already exist. The `authorized_view_id` appended to `parent` forms the full
   *     AuthorizedView name of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedView/{authorized_view}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AuthorizedView, CreateAuthorizedViewMetadata>
      createAuthorizedViewAsync(
          TableName parent, AuthorizedView authorizedView, String authorizedViewId) {
    CreateAuthorizedViewRequest request =
        CreateAuthorizedViewRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setAuthorizedView(authorizedView)
            .setAuthorizedViewId(authorizedViewId)
            .build();
    return createAuthorizedViewAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
   *   String authorizedViewId = "authorizedViewId-2074136549";
   *   AuthorizedView response =
   *       baseBigtableTableAdminClient
   *           .createAuthorizedViewAsync(parent, authorizedView, authorizedViewId)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. This is the name of the table the AuthorizedView belongs to. Values are
   *     of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param authorizedView Required. The AuthorizedView to create.
   * @param authorizedViewId Required. The id of the AuthorizedView to create. This AuthorizedView
   *     must not already exist. The `authorized_view_id` appended to `parent` forms the full
   *     AuthorizedView name of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedView/{authorized_view}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AuthorizedView, CreateAuthorizedViewMetadata>
      createAuthorizedViewAsync(
          String parent, AuthorizedView authorizedView, String authorizedViewId) {
    CreateAuthorizedViewRequest request =
        CreateAuthorizedViewRequest.newBuilder()
            .setParent(parent)
            .setAuthorizedView(authorizedView)
            .setAuthorizedViewId(authorizedViewId)
            .build();
    return createAuthorizedViewAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateAuthorizedViewRequest request =
   *       CreateAuthorizedViewRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setAuthorizedViewId("authorizedViewId-2074136549")
   *           .setAuthorizedView(AuthorizedView.newBuilder().build())
   *           .build();
   *   AuthorizedView response =
   *       baseBigtableTableAdminClient.createAuthorizedViewAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AuthorizedView, CreateAuthorizedViewMetadata>
      createAuthorizedViewAsync(CreateAuthorizedViewRequest request) {
    return createAuthorizedViewOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateAuthorizedViewRequest request =
   *       CreateAuthorizedViewRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setAuthorizedViewId("authorizedViewId-2074136549")
   *           .setAuthorizedView(AuthorizedView.newBuilder().build())
   *           .build();
   *   OperationFuture<AuthorizedView, CreateAuthorizedViewMetadata> future =
   *       baseBigtableTableAdminClient.createAuthorizedViewOperationCallable().futureCall(request);
   *   // Do something.
   *   AuthorizedView response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateAuthorizedViewRequest, AuthorizedView, CreateAuthorizedViewMetadata>
      createAuthorizedViewOperationCallable() {
    return stub.createAuthorizedViewOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateAuthorizedViewRequest request =
   *       CreateAuthorizedViewRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setAuthorizedViewId("authorizedViewId-2074136549")
   *           .setAuthorizedView(AuthorizedView.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.createAuthorizedViewCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateAuthorizedViewRequest, Operation>
      createAuthorizedViewCallable() {
    return stub.createAuthorizedViewCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all AuthorizedViews from a specific table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   for (AuthorizedView element :
   *       baseBigtableTableAdminClient.listAuthorizedViews(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the table for which AuthorizedViews should be
   *     listed. Values are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAuthorizedViewsPagedResponse listAuthorizedViews(TableName parent) {
    ListAuthorizedViewsRequest request =
        ListAuthorizedViewsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listAuthorizedViews(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all AuthorizedViews from a specific table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   for (AuthorizedView element :
   *       baseBigtableTableAdminClient.listAuthorizedViews(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the table for which AuthorizedViews should be
   *     listed. Values are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAuthorizedViewsPagedResponse listAuthorizedViews(String parent) {
    ListAuthorizedViewsRequest request =
        ListAuthorizedViewsRequest.newBuilder().setParent(parent).build();
    return listAuthorizedViews(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all AuthorizedViews from a specific table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListAuthorizedViewsRequest request =
   *       ListAuthorizedViewsRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (AuthorizedView element :
   *       baseBigtableTableAdminClient.listAuthorizedViews(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListAuthorizedViewsPagedResponse listAuthorizedViews(
      ListAuthorizedViewsRequest request) {
    return listAuthorizedViewsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all AuthorizedViews from a specific table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListAuthorizedViewsRequest request =
   *       ListAuthorizedViewsRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<AuthorizedView> future =
   *       baseBigtableTableAdminClient.listAuthorizedViewsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (AuthorizedView element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAuthorizedViewsRequest, ListAuthorizedViewsPagedResponse>
      listAuthorizedViewsPagedCallable() {
    return stub.listAuthorizedViewsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all AuthorizedViews from a specific table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListAuthorizedViewsRequest request =
   *       ListAuthorizedViewsRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListAuthorizedViewsResponse response =
   *         baseBigtableTableAdminClient.listAuthorizedViewsCallable().call(request);
   *     for (AuthorizedView element : response.getAuthorizedViewsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListAuthorizedViewsRequest, ListAuthorizedViewsResponse>
      listAuthorizedViewsCallable() {
    return stub.listAuthorizedViewsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information from a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   AuthorizedViewName name =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
   *   AuthorizedView response = baseBigtableTableAdminClient.getAuthorizedView(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the requested AuthorizedView. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AuthorizedView getAuthorizedView(AuthorizedViewName name) {
    GetAuthorizedViewRequest request =
        GetAuthorizedViewRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getAuthorizedView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information from a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *           .toString();
   *   AuthorizedView response = baseBigtableTableAdminClient.getAuthorizedView(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the requested AuthorizedView. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AuthorizedView getAuthorizedView(String name) {
    GetAuthorizedViewRequest request = GetAuthorizedViewRequest.newBuilder().setName(name).build();
    return getAuthorizedView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information from a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetAuthorizedViewRequest request =
   *       GetAuthorizedViewRequest.newBuilder()
   *           .setName(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .build();
   *   AuthorizedView response = baseBigtableTableAdminClient.getAuthorizedView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final AuthorizedView getAuthorizedView(GetAuthorizedViewRequest request) {
    return getAuthorizedViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information from a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetAuthorizedViewRequest request =
   *       GetAuthorizedViewRequest.newBuilder()
   *           .setName(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .build();
   *   ApiFuture<AuthorizedView> future =
   *       baseBigtableTableAdminClient.getAuthorizedViewCallable().futureCall(request);
   *   // Do something.
   *   AuthorizedView response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetAuthorizedViewRequest, AuthorizedView> getAuthorizedViewCallable() {
    return stub.getAuthorizedViewCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   AuthorizedView authorizedView = AuthorizedView.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   AuthorizedView response =
   *       baseBigtableTableAdminClient.updateAuthorizedViewAsync(authorizedView, updateMask).get();
   * }
   * }</pre>
   *
   * @param authorizedView Required. The AuthorizedView to update. The `name` in `authorized_view`
   *     is used to identify the AuthorizedView. AuthorizedView name must in this format:
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * @param updateMask Optional. The list of fields to update. A mask specifying which fields in the
   *     AuthorizedView resource should be updated. This mask is relative to the AuthorizedView
   *     resource, not to the request message. A field will be overwritten if it is in the mask. If
   *     empty, all fields set in the request will be overwritten. A special value `&#42;` means to
   *     overwrite all fields (including fields not set in the request).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AuthorizedView, UpdateAuthorizedViewMetadata>
      updateAuthorizedViewAsync(AuthorizedView authorizedView, FieldMask updateMask) {
    UpdateAuthorizedViewRequest request =
        UpdateAuthorizedViewRequest.newBuilder()
            .setAuthorizedView(authorizedView)
            .setUpdateMask(updateMask)
            .build();
    return updateAuthorizedViewAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateAuthorizedViewRequest request =
   *       UpdateAuthorizedViewRequest.newBuilder()
   *           .setAuthorizedView(AuthorizedView.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   AuthorizedView response =
   *       baseBigtableTableAdminClient.updateAuthorizedViewAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<AuthorizedView, UpdateAuthorizedViewMetadata>
      updateAuthorizedViewAsync(UpdateAuthorizedViewRequest request) {
    return updateAuthorizedViewOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateAuthorizedViewRequest request =
   *       UpdateAuthorizedViewRequest.newBuilder()
   *           .setAuthorizedView(AuthorizedView.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   OperationFuture<AuthorizedView, UpdateAuthorizedViewMetadata> future =
   *       baseBigtableTableAdminClient.updateAuthorizedViewOperationCallable().futureCall(request);
   *   // Do something.
   *   AuthorizedView response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateAuthorizedViewRequest, AuthorizedView, UpdateAuthorizedViewMetadata>
      updateAuthorizedViewOperationCallable() {
    return stub.updateAuthorizedViewOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an AuthorizedView in a table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateAuthorizedViewRequest request =
   *       UpdateAuthorizedViewRequest.newBuilder()
   *           .setAuthorizedView(AuthorizedView.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.updateAuthorizedViewCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateAuthorizedViewRequest, Operation>
      updateAuthorizedViewCallable() {
    return stub.updateAuthorizedViewCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   AuthorizedViewName name =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
   *   baseBigtableTableAdminClient.deleteAuthorizedView(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the AuthorizedView to be deleted. Values are of the
   *     form
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteAuthorizedView(AuthorizedViewName name) {
    DeleteAuthorizedViewRequest request =
        DeleteAuthorizedViewRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteAuthorizedView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *           .toString();
   *   baseBigtableTableAdminClient.deleteAuthorizedView(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the AuthorizedView to be deleted. Values are of the
   *     form
   *     `projects/{project}/instances/{instance}/tables/{table}/authorizedViews/{authorized_view}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteAuthorizedView(String name) {
    DeleteAuthorizedViewRequest request =
        DeleteAuthorizedViewRequest.newBuilder().setName(name).build();
    deleteAuthorizedView(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteAuthorizedViewRequest request =
   *       DeleteAuthorizedViewRequest.newBuilder()
   *           .setName(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   baseBigtableTableAdminClient.deleteAuthorizedView(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteAuthorizedView(DeleteAuthorizedViewRequest request) {
    deleteAuthorizedViewCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes a specified AuthorizedView.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteAuthorizedViewRequest request =
   *       DeleteAuthorizedViewRequest.newBuilder()
   *           .setName(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigtableTableAdminClient.deleteAuthorizedViewCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteAuthorizedViewRequest, Empty> deleteAuthorizedViewCallable() {
    return stub.deleteAuthorizedViewCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Performs a series of column family modifications on the specified table. Either all or none of
   * the modifications will occur before this method returns, but data requests received prior to
   * that point may see a table where only some modifications have taken effect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   List<ModifyColumnFamiliesRequest.Modification> modifications = new ArrayList<>();
   *   Table response = baseBigtableTableAdminClient.modifyColumnFamilies(name, modifications);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table whose families should be modified. Values
   *     are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param modifications Required. Modifications to be atomically applied to the specified table's
   *     families. Entries are applied in order, meaning that earlier modifications can be masked by
   *     later ones (in the case of repeated updates to the same family, for example).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table modifyColumnFamilies(
      TableName name, List<ModifyColumnFamiliesRequest.Modification> modifications) {
    ModifyColumnFamiliesRequest request =
        ModifyColumnFamiliesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .addAllModifications(modifications)
            .build();
    return modifyColumnFamilies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Performs a series of column family modifications on the specified table. Either all or none of
   * the modifications will occur before this method returns, but data requests received prior to
   * that point may see a table where only some modifications have taken effect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   List<ModifyColumnFamiliesRequest.Modification> modifications = new ArrayList<>();
   *   Table response = baseBigtableTableAdminClient.modifyColumnFamilies(name, modifications);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table whose families should be modified. Values
   *     are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param modifications Required. Modifications to be atomically applied to the specified table's
   *     families. Entries are applied in order, meaning that earlier modifications can be masked by
   *     later ones (in the case of repeated updates to the same family, for example).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table modifyColumnFamilies(
      String name, List<ModifyColumnFamiliesRequest.Modification> modifications) {
    ModifyColumnFamiliesRequest request =
        ModifyColumnFamiliesRequest.newBuilder()
            .setName(name)
            .addAllModifications(modifications)
            .build();
    return modifyColumnFamilies(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Performs a series of column family modifications on the specified table. Either all or none of
   * the modifications will occur before this method returns, but data requests received prior to
   * that point may see a table where only some modifications have taken effect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ModifyColumnFamiliesRequest request =
   *       ModifyColumnFamiliesRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .addAllModifications(new ArrayList<ModifyColumnFamiliesRequest.Modification>())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   Table response = baseBigtableTableAdminClient.modifyColumnFamilies(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Table modifyColumnFamilies(ModifyColumnFamiliesRequest request) {
    return modifyColumnFamiliesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Performs a series of column family modifications on the specified table. Either all or none of
   * the modifications will occur before this method returns, but data requests received prior to
   * that point may see a table where only some modifications have taken effect.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ModifyColumnFamiliesRequest request =
   *       ModifyColumnFamiliesRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .addAllModifications(new ArrayList<ModifyColumnFamiliesRequest.Modification>())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   ApiFuture<Table> future =
   *       baseBigtableTableAdminClient.modifyColumnFamiliesCallable().futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ModifyColumnFamiliesRequest, Table> modifyColumnFamiliesCallable() {
    return stub.modifyColumnFamiliesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently drop/delete a row range from a specified table. The request can specify whether to
   * delete all rows in a table, or only those that match a particular prefix.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DropRowRangeRequest request =
   *       DropRowRangeRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   baseBigtableTableAdminClient.dropRowRange(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void dropRowRange(DropRowRangeRequest request) {
    dropRowRangeCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently drop/delete a row range from a specified table. The request can specify whether to
   * delete all rows in a table, or only those that match a particular prefix.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DropRowRangeRequest request =
   *       DropRowRangeRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigtableTableAdminClient.dropRowRangeCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DropRowRangeRequest, Empty> dropRowRangeCallable() {
    return stub.dropRowRangeCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a consistency token for a Table, which can be used in CheckConsistency to check
   * whether mutations to the table that finished before this call started have been replicated. The
   * tokens will be available for 90 days.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   GenerateConsistencyTokenResponse response =
   *       baseBigtableTableAdminClient.generateConsistencyToken(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the Table for which to create a consistency token.
   *     Values are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateConsistencyTokenResponse generateConsistencyToken(TableName name) {
    GenerateConsistencyTokenRequest request =
        GenerateConsistencyTokenRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return generateConsistencyToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a consistency token for a Table, which can be used in CheckConsistency to check
   * whether mutations to the table that finished before this call started have been replicated. The
   * tokens will be available for 90 days.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   GenerateConsistencyTokenResponse response =
   *       baseBigtableTableAdminClient.generateConsistencyToken(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the Table for which to create a consistency token.
   *     Values are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateConsistencyTokenResponse generateConsistencyToken(String name) {
    GenerateConsistencyTokenRequest request =
        GenerateConsistencyTokenRequest.newBuilder().setName(name).build();
    return generateConsistencyToken(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a consistency token for a Table, which can be used in CheckConsistency to check
   * whether mutations to the table that finished before this call started have been replicated. The
   * tokens will be available for 90 days.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GenerateConsistencyTokenRequest request =
   *       GenerateConsistencyTokenRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   GenerateConsistencyTokenResponse response =
   *       baseBigtableTableAdminClient.generateConsistencyToken(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final GenerateConsistencyTokenResponse generateConsistencyToken(
      GenerateConsistencyTokenRequest request) {
    return generateConsistencyTokenCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Generates a consistency token for a Table, which can be used in CheckConsistency to check
   * whether mutations to the table that finished before this call started have been replicated. The
   * tokens will be available for 90 days.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GenerateConsistencyTokenRequest request =
   *       GenerateConsistencyTokenRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .build();
   *   ApiFuture<GenerateConsistencyTokenResponse> future =
   *       baseBigtableTableAdminClient.generateConsistencyTokenCallable().futureCall(request);
   *   // Do something.
   *   GenerateConsistencyTokenResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
      generateConsistencyTokenCallable() {
    return stub.generateConsistencyTokenCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Checks replication consistency based on a consistency token, that is, if replication has caught
   * up based on the conditions specified in the token and the check request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   String consistencyToken = "consistencyToken-1985152319";
   *   CheckConsistencyResponse response =
   *       baseBigtableTableAdminClient.checkConsistency(name, consistencyToken);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the Table for which to check replication consistency.
   *     Values are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param consistencyToken Required. The token created using GenerateConsistencyToken for the
   *     Table.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckConsistencyResponse checkConsistency(TableName name, String consistencyToken) {
    CheckConsistencyRequest request =
        CheckConsistencyRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setConsistencyToken(consistencyToken)
            .build();
    return checkConsistency(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Checks replication consistency based on a consistency token, that is, if replication has caught
   * up based on the conditions specified in the token and the check request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   String consistencyToken = "consistencyToken-1985152319";
   *   CheckConsistencyResponse response =
   *       baseBigtableTableAdminClient.checkConsistency(name, consistencyToken);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the Table for which to check replication consistency.
   *     Values are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param consistencyToken Required. The token created using GenerateConsistencyToken for the
   *     Table.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckConsistencyResponse checkConsistency(String name, String consistencyToken) {
    CheckConsistencyRequest request =
        CheckConsistencyRequest.newBuilder()
            .setName(name)
            .setConsistencyToken(consistencyToken)
            .build();
    return checkConsistency(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Checks replication consistency based on a consistency token, that is, if replication has caught
   * up based on the conditions specified in the token and the check request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CheckConsistencyRequest request =
   *       CheckConsistencyRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setConsistencyToken("consistencyToken-1985152319")
   *           .build();
   *   CheckConsistencyResponse response = baseBigtableTableAdminClient.checkConsistency(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final CheckConsistencyResponse checkConsistency(CheckConsistencyRequest request) {
    return checkConsistencyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Checks replication consistency based on a consistency token, that is, if replication has caught
   * up based on the conditions specified in the token and the check request.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CheckConsistencyRequest request =
   *       CheckConsistencyRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setConsistencyToken("consistencyToken-1985152319")
   *           .build();
   *   ApiFuture<CheckConsistencyResponse> future =
   *       baseBigtableTableAdminClient.checkConsistencyCallable().futureCall(request);
   *   // Do something.
   *   CheckConsistencyResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CheckConsistencyRequest, CheckConsistencyResponse>
      checkConsistencyCallable() {
    return stub.checkConsistencyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   ClusterName cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   String snapshotId = "snapshotId-1113817601";
   *   String description = "description-1724546052";
   *   Snapshot response =
   *       baseBigtableTableAdminClient
   *           .snapshotTableAsync(name, cluster, snapshotId, description)
   *           .get();
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to have the snapshot taken. Values are of
   *     the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param cluster Required. The name of the cluster where the snapshot will be created in. Values
   *     are of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param snapshotId Required. The ID by which the new snapshot should be referred to within the
   *     parent cluster, e.g., `mysnapshot` of the form: `[_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;` rather
   *     than `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/mysnapshot`.
   * @param description Description of the snapshot.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Snapshot, SnapshotTableMetadata> snapshotTableAsync(
      TableName name, ClusterName cluster, String snapshotId, String description) {
    SnapshotTableRequest request =
        SnapshotTableRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setCluster(cluster == null ? null : cluster.toString())
            .setSnapshotId(snapshotId)
            .setDescription(description)
            .build();
    return snapshotTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   String cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   String snapshotId = "snapshotId-1113817601";
   *   String description = "description-1724546052";
   *   Snapshot response =
   *       baseBigtableTableAdminClient
   *           .snapshotTableAsync(name, cluster, snapshotId, description)
   *           .get();
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to have the snapshot taken. Values are of
   *     the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param cluster Required. The name of the cluster where the snapshot will be created in. Values
   *     are of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param snapshotId Required. The ID by which the new snapshot should be referred to within the
   *     parent cluster, e.g., `mysnapshot` of the form: `[_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;` rather
   *     than `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/mysnapshot`.
   * @param description Description of the snapshot.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Snapshot, SnapshotTableMetadata> snapshotTableAsync(
      TableName name, String cluster, String snapshotId, String description) {
    SnapshotTableRequest request =
        SnapshotTableRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setCluster(cluster)
            .setSnapshotId(snapshotId)
            .setDescription(description)
            .build();
    return snapshotTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   ClusterName cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   String snapshotId = "snapshotId-1113817601";
   *   String description = "description-1724546052";
   *   Snapshot response =
   *       baseBigtableTableAdminClient
   *           .snapshotTableAsync(name, cluster, snapshotId, description)
   *           .get();
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to have the snapshot taken. Values are of
   *     the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param cluster Required. The name of the cluster where the snapshot will be created in. Values
   *     are of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param snapshotId Required. The ID by which the new snapshot should be referred to within the
   *     parent cluster, e.g., `mysnapshot` of the form: `[_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;` rather
   *     than `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/mysnapshot`.
   * @param description Description of the snapshot.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Snapshot, SnapshotTableMetadata> snapshotTableAsync(
      String name, ClusterName cluster, String snapshotId, String description) {
    SnapshotTableRequest request =
        SnapshotTableRequest.newBuilder()
            .setName(name)
            .setCluster(cluster == null ? null : cluster.toString())
            .setSnapshotId(snapshotId)
            .setDescription(description)
            .build();
    return snapshotTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   String cluster = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   String snapshotId = "snapshotId-1113817601";
   *   String description = "description-1724546052";
   *   Snapshot response =
   *       baseBigtableTableAdminClient
   *           .snapshotTableAsync(name, cluster, snapshotId, description)
   *           .get();
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the table to have the snapshot taken. Values are of
   *     the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param cluster Required. The name of the cluster where the snapshot will be created in. Values
   *     are of the form `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param snapshotId Required. The ID by which the new snapshot should be referred to within the
   *     parent cluster, e.g., `mysnapshot` of the form: `[_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;` rather
   *     than `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/mysnapshot`.
   * @param description Description of the snapshot.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Snapshot, SnapshotTableMetadata> snapshotTableAsync(
      String name, String cluster, String snapshotId, String description) {
    SnapshotTableRequest request =
        SnapshotTableRequest.newBuilder()
            .setName(name)
            .setCluster(cluster)
            .setSnapshotId(snapshotId)
            .setDescription(description)
            .build();
    return snapshotTableAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SnapshotTableRequest request =
   *       SnapshotTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setCluster(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setSnapshotId("snapshotId-1113817601")
   *           .setTtl(Duration.newBuilder().build())
   *           .setDescription("description-1724546052")
   *           .build();
   *   Snapshot response = baseBigtableTableAdminClient.snapshotTableAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Snapshot, SnapshotTableMetadata> snapshotTableAsync(
      SnapshotTableRequest request) {
    return snapshotTableOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SnapshotTableRequest request =
   *       SnapshotTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setCluster(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setSnapshotId("snapshotId-1113817601")
   *           .setTtl(Duration.newBuilder().build())
   *           .setDescription("description-1724546052")
   *           .build();
   *   OperationFuture<Snapshot, SnapshotTableMetadata> future =
   *       baseBigtableTableAdminClient.snapshotTableOperationCallable().futureCall(request);
   *   // Do something.
   *   Snapshot response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<SnapshotTableRequest, Snapshot, SnapshotTableMetadata>
      snapshotTableOperationCallable() {
    return stub.snapshotTableOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new snapshot in the specified cluster from the specified source table. The cluster
   * and the table must be in the same instance.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SnapshotTableRequest request =
   *       SnapshotTableRequest.newBuilder()
   *           .setName(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setCluster(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setSnapshotId("snapshotId-1113817601")
   *           .setTtl(Duration.newBuilder().build())
   *           .setDescription("description-1724546052")
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.snapshotTableCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SnapshotTableRequest, Operation> snapshotTableCallable() {
    return stub.snapshotTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SnapshotName name = SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
   *   Snapshot response = baseBigtableTableAdminClient.getSnapshot(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the requested snapshot. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Snapshot getSnapshot(SnapshotName name) {
    GetSnapshotRequest request =
        GetSnapshotRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name =
   *       SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString();
   *   Snapshot response = baseBigtableTableAdminClient.getSnapshot(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the requested snapshot. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Snapshot getSnapshot(String name) {
    GetSnapshotRequest request = GetSnapshotRequest.newBuilder().setName(name).build();
    return getSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetSnapshotRequest request =
   *       GetSnapshotRequest.newBuilder()
   *           .setName(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   Snapshot response = baseBigtableTableAdminClient.getSnapshot(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Snapshot getSnapshot(GetSnapshotRequest request) {
    return getSnapshotCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetSnapshotRequest request =
   *       GetSnapshotRequest.newBuilder()
   *           .setName(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   ApiFuture<Snapshot> future =
   *       baseBigtableTableAdminClient.getSnapshotCallable().futureCall(request);
   *   // Do something.
   *   Snapshot response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSnapshotRequest, Snapshot> getSnapshotCallable() {
    return stub.getSnapshotCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all snapshots associated with the specified cluster.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   for (Snapshot element : baseBigtableTableAdminClient.listSnapshots(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the cluster for which snapshots should be listed.
   *     Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}`. Use
   *     `{cluster} = '-'` to list snapshots for all clusters in an instance, e.g.,
   *     `projects/{project}/instances/{instance}/clusters/-`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSnapshotsPagedResponse listSnapshots(ClusterName parent) {
    ListSnapshotsRequest request =
        ListSnapshotsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSnapshots(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all snapshots associated with the specified cluster.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   for (Snapshot element : baseBigtableTableAdminClient.listSnapshots(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The unique name of the cluster for which snapshots should be listed.
   *     Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}`. Use
   *     `{cluster} = '-'` to list snapshots for all clusters in an instance, e.g.,
   *     `projects/{project}/instances/{instance}/clusters/-`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSnapshotsPagedResponse listSnapshots(String parent) {
    ListSnapshotsRequest request = ListSnapshotsRequest.newBuilder().setParent(parent).build();
    return listSnapshots(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all snapshots associated with the specified cluster.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListSnapshotsRequest request =
   *       ListSnapshotsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Snapshot element : baseBigtableTableAdminClient.listSnapshots(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSnapshotsPagedResponse listSnapshots(ListSnapshotsRequest request) {
    return listSnapshotsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all snapshots associated with the specified cluster.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListSnapshotsRequest request =
   *       ListSnapshotsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Snapshot> future =
   *       baseBigtableTableAdminClient.listSnapshotsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Snapshot element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSnapshotsRequest, ListSnapshotsPagedResponse>
      listSnapshotsPagedCallable() {
    return stub.listSnapshotsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all snapshots associated with the specified cluster.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListSnapshotsRequest request =
   *       ListSnapshotsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListSnapshotsResponse response =
   *         baseBigtableTableAdminClient.listSnapshotsCallable().call(request);
   *     for (Snapshot element : response.getSnapshotsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsCallable() {
    return stub.listSnapshotsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SnapshotName name = SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]");
   *   baseBigtableTableAdminClient.deleteSnapshot(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the snapshot to be deleted. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSnapshot(SnapshotName name) {
    DeleteSnapshotRequest request =
        DeleteSnapshotRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name =
   *       SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString();
   *   baseBigtableTableAdminClient.deleteSnapshot(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the snapshot to be deleted. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/snapshots/{snapshot}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSnapshot(String name) {
    DeleteSnapshotRequest request = DeleteSnapshotRequest.newBuilder().setName(name).build();
    deleteSnapshot(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteSnapshotRequest request =
   *       DeleteSnapshotRequest.newBuilder()
   *           .setName(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   baseBigtableTableAdminClient.deleteSnapshot(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSnapshot(DeleteSnapshotRequest request) {
    deleteSnapshotCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Permanently deletes the specified snapshot.
   *
   * <p>Note: This is a private alpha release of Cloud Bigtable snapshots. This feature is not
   * currently available to most Cloud Bigtable customers. This feature might be changed in
   * backward-incompatible ways and is not recommended for production use. It is not subject to any
   * SLA or deprecation policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteSnapshotRequest request =
   *       DeleteSnapshotRequest.newBuilder()
   *           .setName(
   *               SnapshotName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[SNAPSHOT]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigtableTableAdminClient.deleteSnapshotCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteSnapshotRequest, Empty> deleteSnapshotCallable() {
    return stub.deleteSnapshotCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts creating a new Cloud Bigtable Backup. The returned backup [long-running
   * operation][google.longrunning.Operation] can be used to track creation of the backup. The
   * [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateBackupMetadata][google.bigtable.admin.v2.CreateBackupMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Backup][google.bigtable.admin.v2.Backup], if successful. Cancelling the returned operation
   * will stop the creation and delete the backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   String backupId = "backupId2121930365";
   *   Backup backup = Backup.newBuilder().build();
   *   Backup response =
   *       baseBigtableTableAdminClient.createBackupAsync(parent, backupId, backup).get();
   * }
   * }</pre>
   *
   * @param parent Required. This must be one of the clusters in the instance in which this table is
   *     located. The backup will be stored in this cluster. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param backupId Required. The id of the backup to be created. The `backup_id` along with the
   *     parent `parent` are combined as {parent}/backups/{backup_id} to create the full backup
   *     name, of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup_id}`. This
   *     string must be between 1 and 50 characters in length and match the regex
   *     [_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;.
   * @param backup Required. The backup to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CreateBackupMetadata> createBackupAsync(
      ClusterName parent, String backupId, Backup backup) {
    CreateBackupRequest request =
        CreateBackupRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setBackupId(backupId)
            .setBackup(backup)
            .build();
    return createBackupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts creating a new Cloud Bigtable Backup. The returned backup [long-running
   * operation][google.longrunning.Operation] can be used to track creation of the backup. The
   * [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateBackupMetadata][google.bigtable.admin.v2.CreateBackupMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Backup][google.bigtable.admin.v2.Backup], if successful. Cancelling the returned operation
   * will stop the creation and delete the backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   String backupId = "backupId2121930365";
   *   Backup backup = Backup.newBuilder().build();
   *   Backup response =
   *       baseBigtableTableAdminClient.createBackupAsync(parent, backupId, backup).get();
   * }
   * }</pre>
   *
   * @param parent Required. This must be one of the clusters in the instance in which this table is
   *     located. The backup will be stored in this cluster. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param backupId Required. The id of the backup to be created. The `backup_id` along with the
   *     parent `parent` are combined as {parent}/backups/{backup_id} to create the full backup
   *     name, of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup_id}`. This
   *     string must be between 1 and 50 characters in length and match the regex
   *     [_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;.
   * @param backup Required. The backup to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CreateBackupMetadata> createBackupAsync(
      String parent, String backupId, Backup backup) {
    CreateBackupRequest request =
        CreateBackupRequest.newBuilder()
            .setParent(parent)
            .setBackupId(backupId)
            .setBackup(backup)
            .build();
    return createBackupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts creating a new Cloud Bigtable Backup. The returned backup [long-running
   * operation][google.longrunning.Operation] can be used to track creation of the backup. The
   * [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateBackupMetadata][google.bigtable.admin.v2.CreateBackupMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Backup][google.bigtable.admin.v2.Backup], if successful. Cancelling the returned operation
   * will stop the creation and delete the backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateBackupRequest request =
   *       CreateBackupRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setBackupId("backupId2121930365")
   *           .setBackup(Backup.newBuilder().build())
   *           .build();
   *   Backup response = baseBigtableTableAdminClient.createBackupAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CreateBackupMetadata> createBackupAsync(
      CreateBackupRequest request) {
    return createBackupOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts creating a new Cloud Bigtable Backup. The returned backup [long-running
   * operation][google.longrunning.Operation] can be used to track creation of the backup. The
   * [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateBackupMetadata][google.bigtable.admin.v2.CreateBackupMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Backup][google.bigtable.admin.v2.Backup], if successful. Cancelling the returned operation
   * will stop the creation and delete the backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateBackupRequest request =
   *       CreateBackupRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setBackupId("backupId2121930365")
   *           .setBackup(Backup.newBuilder().build())
   *           .build();
   *   OperationFuture<Backup, CreateBackupMetadata> future =
   *       baseBigtableTableAdminClient.createBackupOperationCallable().futureCall(request);
   *   // Do something.
   *   Backup response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateBackupRequest, Backup, CreateBackupMetadata>
      createBackupOperationCallable() {
    return stub.createBackupOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Starts creating a new Cloud Bigtable Backup. The returned backup [long-running
   * operation][google.longrunning.Operation] can be used to track creation of the backup. The
   * [metadata][google.longrunning.Operation.metadata] field type is
   * [CreateBackupMetadata][google.bigtable.admin.v2.CreateBackupMetadata]. The
   * [response][google.longrunning.Operation.response] field type is
   * [Backup][google.bigtable.admin.v2.Backup], if successful. Cancelling the returned operation
   * will stop the creation and delete the backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateBackupRequest request =
   *       CreateBackupRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setBackupId("backupId2121930365")
   *           .setBackup(Backup.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.createBackupCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateBackupRequest, Operation> createBackupCallable() {
    return stub.createBackupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata on a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   BackupName name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
   *   Backup response = baseBigtableTableAdminClient.getBackup(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the backup. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Backup getBackup(BackupName name) {
    GetBackupRequest request =
        GetBackupRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getBackup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata on a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString();
   *   Backup response = baseBigtableTableAdminClient.getBackup(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the backup. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Backup getBackup(String name) {
    GetBackupRequest request = GetBackupRequest.newBuilder().setName(name).build();
    return getBackup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata on a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetBackupRequest request =
   *       GetBackupRequest.newBuilder()
   *           .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .build();
   *   Backup response = baseBigtableTableAdminClient.getBackup(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Backup getBackup(GetBackupRequest request) {
    return getBackupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata on a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetBackupRequest request =
   *       GetBackupRequest.newBuilder()
   *           .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .build();
   *   ApiFuture<Backup> future =
   *       baseBigtableTableAdminClient.getBackupCallable().futureCall(request);
   *   // Do something.
   *   Backup response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetBackupRequest, Backup> getBackupCallable() {
    return stub.getBackupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   Backup backup = Backup.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Backup response = baseBigtableTableAdminClient.updateBackup(backup, updateMask);
   * }
   * }</pre>
   *
   * @param backup Required. The backup to update. `backup.name`, and the fields to be updated as
   *     specified by `update_mask` are required. Other fields are ignored. Update is only supported
   *     for the following fields:
   *     <p>&#42; `backup.expire_time`.
   * @param updateMask Required. A mask specifying which fields (e.g. `expire_time`) in the Backup
   *     resource should be updated. This mask is relative to the Backup resource, not to the
   *     request message. The field mask must always be specified; this prevents any future fields
   *     from being erased accidentally by clients that do not know about them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Backup updateBackup(Backup backup, FieldMask updateMask) {
    UpdateBackupRequest request =
        UpdateBackupRequest.newBuilder().setBackup(backup).setUpdateMask(updateMask).build();
    return updateBackup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateBackupRequest request =
   *       UpdateBackupRequest.newBuilder()
   *           .setBackup(Backup.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Backup response = baseBigtableTableAdminClient.updateBackup(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Backup updateBackup(UpdateBackupRequest request) {
    return updateBackupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a pending or completed Cloud Bigtable Backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateBackupRequest request =
   *       UpdateBackupRequest.newBuilder()
   *           .setBackup(Backup.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Backup> future =
   *       baseBigtableTableAdminClient.updateBackupCallable().futureCall(request);
   *   // Do something.
   *   Backup response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateBackupRequest, Backup> updateBackupCallable() {
    return stub.updateBackupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a pending or completed Cloud Bigtable backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   BackupName name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
   *   baseBigtableTableAdminClient.deleteBackup(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the backup to delete. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteBackup(BackupName name) {
    DeleteBackupRequest request =
        DeleteBackupRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteBackup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a pending or completed Cloud Bigtable backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString();
   *   baseBigtableTableAdminClient.deleteBackup(name);
   * }
   * }</pre>
   *
   * @param name Required. Name of the backup to delete. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteBackup(String name) {
    DeleteBackupRequest request = DeleteBackupRequest.newBuilder().setName(name).build();
    deleteBackup(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a pending or completed Cloud Bigtable backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteBackupRequest request =
   *       DeleteBackupRequest.newBuilder()
   *           .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .build();
   *   baseBigtableTableAdminClient.deleteBackup(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteBackup(DeleteBackupRequest request) {
    deleteBackupCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a pending or completed Cloud Bigtable backup.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteBackupRequest request =
   *       DeleteBackupRequest.newBuilder()
   *           .setName(BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigtableTableAdminClient.deleteBackupCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteBackupRequest, Empty> deleteBackupCallable() {
    return stub.deleteBackupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Cloud Bigtable backups. Returns both completed and pending backups.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   for (Backup element : baseBigtableTableAdminClient.listBackups(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The cluster to list backups from. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`. Use `{cluster} = '-'` to list
   *     backups for all clusters in an instance, e.g.,
   *     `projects/{project}/instances/{instance}/clusters/-`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBackupsPagedResponse listBackups(ClusterName parent) {
    ListBackupsRequest request =
        ListBackupsRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listBackups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Cloud Bigtable backups. Returns both completed and pending backups.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   for (Backup element : baseBigtableTableAdminClient.listBackups(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The cluster to list backups from. Values are of the form
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`. Use `{cluster} = '-'` to list
   *     backups for all clusters in an instance, e.g.,
   *     `projects/{project}/instances/{instance}/clusters/-`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBackupsPagedResponse listBackups(String parent) {
    ListBackupsRequest request = ListBackupsRequest.newBuilder().setParent(parent).build();
    return listBackups(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Cloud Bigtable backups. Returns both completed and pending backups.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListBackupsRequest request =
   *       ListBackupsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Backup element : baseBigtableTableAdminClient.listBackups(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListBackupsPagedResponse listBackups(ListBackupsRequest request) {
    return listBackupsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Cloud Bigtable backups. Returns both completed and pending backups.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListBackupsRequest request =
   *       ListBackupsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Backup> future =
   *       baseBigtableTableAdminClient.listBackupsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Backup element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBackupsRequest, ListBackupsPagedResponse>
      listBackupsPagedCallable() {
    return stub.listBackupsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Cloud Bigtable backups. Returns both completed and pending backups.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListBackupsRequest request =
   *       ListBackupsRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListBackupsResponse response =
   *         baseBigtableTableAdminClient.listBackupsCallable().call(request);
   *     for (Backup element : response.getBackupsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListBackupsRequest, ListBackupsResponse> listBackupsCallable() {
    return stub.listBackupsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a new table by restoring from a completed backup. The returned table [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of the operation,
   * and to cancel it. The [metadata][google.longrunning.Operation.metadata] field type is
   * [RestoreTableMetadata][google.bigtable.admin.v2.RestoreTableMetadata]. The
   * [response][google.longrunning.Operation.response] type is
   * [Table][google.bigtable.admin.v2.Table], if successful.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   RestoreTableRequest request =
   *       RestoreTableRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .build();
   *   Table response = baseBigtableTableAdminClient.restoreTableAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Table, RestoreTableMetadata> restoreTableAsync(
      RestoreTableRequest request) {
    return restoreTableOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a new table by restoring from a completed backup. The returned table [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of the operation,
   * and to cancel it. The [metadata][google.longrunning.Operation.metadata] field type is
   * [RestoreTableMetadata][google.bigtable.admin.v2.RestoreTableMetadata]. The
   * [response][google.longrunning.Operation.response] type is
   * [Table][google.bigtable.admin.v2.Table], if successful.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   RestoreTableRequest request =
   *       RestoreTableRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .build();
   *   OperationFuture<Table, RestoreTableMetadata> future =
   *       baseBigtableTableAdminClient.restoreTableOperationCallable().futureCall(request);
   *   // Do something.
   *   Table response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<RestoreTableRequest, Table, RestoreTableMetadata>
      restoreTableOperationCallable() {
    return stub.restoreTableOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Create a new table by restoring from a completed backup. The returned table [long-running
   * operation][google.longrunning.Operation] can be used to track the progress of the operation,
   * and to cancel it. The [metadata][google.longrunning.Operation.metadata] field type is
   * [RestoreTableMetadata][google.bigtable.admin.v2.RestoreTableMetadata]. The
   * [response][google.longrunning.Operation.response] type is
   * [Table][google.bigtable.admin.v2.Table], if successful.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   RestoreTableRequest request =
   *       RestoreTableRequest.newBuilder()
   *           .setParent(InstanceName.of("[PROJECT]", "[INSTANCE]").toString())
   *           .setTableId("tableId-1552905847")
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.restoreTableCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<RestoreTableRequest, Operation> restoreTableCallable() {
    return stub.restoreTableCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   String backupId = "backupId2121930365";
   *   BackupName sourceBackup = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
   *   Timestamp expireTime = Timestamp.newBuilder().build();
   *   Backup response =
   *       baseBigtableTableAdminClient
   *           .copyBackupAsync(parent, backupId, sourceBackup, expireTime)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the destination cluster that will contain the backup copy.
   *     The cluster must already exist. Values are of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param backupId Required. The id of the new backup. The `backup_id` along with `parent` are
   *     combined as {parent}/backups/{backup_id} to create the full backup name, of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup_id}`. This
   *     string must be between 1 and 50 characters in length and match the regex
   *     [_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;.
   * @param sourceBackup Required. The source backup to be copied from. The source backup needs to
   *     be in READY state for it to be copied. Copying a copied backup is not allowed. Once
   *     CopyBackup is in progress, the source backup cannot be deleted or cleaned up on expiration
   *     until CopyBackup is finished. Values are of the form:
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/backups/&lt;backup&gt;`.
   * @param expireTime Required. Required. The expiration time of the copied backup with microsecond
   *     granularity that must be at least 6 hours and at most 30 days from the time the request is
   *     received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free
   *     the resources used by the backup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CopyBackupMetadata> copyBackupAsync(
      ClusterName parent, String backupId, BackupName sourceBackup, Timestamp expireTime) {
    CopyBackupRequest request =
        CopyBackupRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setBackupId(backupId)
            .setSourceBackup(sourceBackup == null ? null : sourceBackup.toString())
            .setExpireTime(expireTime)
            .build();
    return copyBackupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ClusterName parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]");
   *   String backupId = "backupId2121930365";
   *   String sourceBackup =
   *       BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString();
   *   Timestamp expireTime = Timestamp.newBuilder().build();
   *   Backup response =
   *       baseBigtableTableAdminClient
   *           .copyBackupAsync(parent, backupId, sourceBackup, expireTime)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the destination cluster that will contain the backup copy.
   *     The cluster must already exist. Values are of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param backupId Required. The id of the new backup. The `backup_id` along with `parent` are
   *     combined as {parent}/backups/{backup_id} to create the full backup name, of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup_id}`. This
   *     string must be between 1 and 50 characters in length and match the regex
   *     [_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;.
   * @param sourceBackup Required. The source backup to be copied from. The source backup needs to
   *     be in READY state for it to be copied. Copying a copied backup is not allowed. Once
   *     CopyBackup is in progress, the source backup cannot be deleted or cleaned up on expiration
   *     until CopyBackup is finished. Values are of the form:
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/backups/&lt;backup&gt;`.
   * @param expireTime Required. Required. The expiration time of the copied backup with microsecond
   *     granularity that must be at least 6 hours and at most 30 days from the time the request is
   *     received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free
   *     the resources used by the backup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CopyBackupMetadata> copyBackupAsync(
      ClusterName parent, String backupId, String sourceBackup, Timestamp expireTime) {
    CopyBackupRequest request =
        CopyBackupRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setBackupId(backupId)
            .setSourceBackup(sourceBackup)
            .setExpireTime(expireTime)
            .build();
    return copyBackupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   String backupId = "backupId2121930365";
   *   BackupName sourceBackup = BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]");
   *   Timestamp expireTime = Timestamp.newBuilder().build();
   *   Backup response =
   *       baseBigtableTableAdminClient
   *           .copyBackupAsync(parent, backupId, sourceBackup, expireTime)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the destination cluster that will contain the backup copy.
   *     The cluster must already exist. Values are of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param backupId Required. The id of the new backup. The `backup_id` along with `parent` are
   *     combined as {parent}/backups/{backup_id} to create the full backup name, of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup_id}`. This
   *     string must be between 1 and 50 characters in length and match the regex
   *     [_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;.
   * @param sourceBackup Required. The source backup to be copied from. The source backup needs to
   *     be in READY state for it to be copied. Copying a copied backup is not allowed. Once
   *     CopyBackup is in progress, the source backup cannot be deleted or cleaned up on expiration
   *     until CopyBackup is finished. Values are of the form:
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/backups/&lt;backup&gt;`.
   * @param expireTime Required. Required. The expiration time of the copied backup with microsecond
   *     granularity that must be at least 6 hours and at most 30 days from the time the request is
   *     received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free
   *     the resources used by the backup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CopyBackupMetadata> copyBackupAsync(
      String parent, String backupId, BackupName sourceBackup, Timestamp expireTime) {
    CopyBackupRequest request =
        CopyBackupRequest.newBuilder()
            .setParent(parent)
            .setBackupId(backupId)
            .setSourceBackup(sourceBackup == null ? null : sourceBackup.toString())
            .setExpireTime(expireTime)
            .build();
    return copyBackupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString();
   *   String backupId = "backupId2121930365";
   *   String sourceBackup =
   *       BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString();
   *   Timestamp expireTime = Timestamp.newBuilder().build();
   *   Backup response =
   *       baseBigtableTableAdminClient
   *           .copyBackupAsync(parent, backupId, sourceBackup, expireTime)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The name of the destination cluster that will contain the backup copy.
   *     The cluster must already exist. Values are of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param backupId Required. The id of the new backup. The `backup_id` along with `parent` are
   *     combined as {parent}/backups/{backup_id} to create the full backup name, of the form:
   *     `projects/{project}/instances/{instance}/clusters/{cluster}/backups/{backup_id}`. This
   *     string must be between 1 and 50 characters in length and match the regex
   *     [_a-zA-Z0-9][-_.a-zA-Z0-9]&#42;.
   * @param sourceBackup Required. The source backup to be copied from. The source backup needs to
   *     be in READY state for it to be copied. Copying a copied backup is not allowed. Once
   *     CopyBackup is in progress, the source backup cannot be deleted or cleaned up on expiration
   *     until CopyBackup is finished. Values are of the form:
   *     `projects/&lt;project&gt;/instances/&lt;instance&gt;/clusters/&lt;cluster&gt;/backups/&lt;backup&gt;`.
   * @param expireTime Required. Required. The expiration time of the copied backup with microsecond
   *     granularity that must be at least 6 hours and at most 30 days from the time the request is
   *     received. Once the `expire_time` has passed, Cloud Bigtable will delete the backup and free
   *     the resources used by the backup.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CopyBackupMetadata> copyBackupAsync(
      String parent, String backupId, String sourceBackup, Timestamp expireTime) {
    CopyBackupRequest request =
        CopyBackupRequest.newBuilder()
            .setParent(parent)
            .setBackupId(backupId)
            .setSourceBackup(sourceBackup)
            .setExpireTime(expireTime)
            .build();
    return copyBackupAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CopyBackupRequest request =
   *       CopyBackupRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setBackupId("backupId2121930365")
   *           .setSourceBackup(
   *               BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .setExpireTime(Timestamp.newBuilder().build())
   *           .build();
   *   Backup response = baseBigtableTableAdminClient.copyBackupAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Backup, CopyBackupMetadata> copyBackupAsync(
      CopyBackupRequest request) {
    return copyBackupOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CopyBackupRequest request =
   *       CopyBackupRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setBackupId("backupId2121930365")
   *           .setSourceBackup(
   *               BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .setExpireTime(Timestamp.newBuilder().build())
   *           .build();
   *   OperationFuture<Backup, CopyBackupMetadata> future =
   *       baseBigtableTableAdminClient.copyBackupOperationCallable().futureCall(request);
   *   // Do something.
   *   Backup response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CopyBackupRequest, Backup, CopyBackupMetadata>
      copyBackupOperationCallable() {
    return stub.copyBackupOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Copy a Cloud Bigtable backup to a new backup in the destination cluster located in the
   * destination instance and project.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CopyBackupRequest request =
   *       CopyBackupRequest.newBuilder()
   *           .setParent(ClusterName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]").toString())
   *           .setBackupId("backupId2121930365")
   *           .setSourceBackup(
   *               BackupName.of("[PROJECT]", "[INSTANCE]", "[CLUSTER]", "[BACKUP]").toString())
   *           .setExpireTime(Timestamp.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.copyBackupCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CopyBackupRequest, Operation> copyBackupCallable() {
    return stub.copyBackupCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a Bigtable resource. Returns an empty policy if the resource
   * exists but does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ResourceName resource =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
   *   Policy response = baseBigtableTableAdminClient.getIamPolicy(resource);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(ResourceName resource) {
    GetIamPolicyRequest request =
        GetIamPolicyRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a Bigtable resource. Returns an empty policy if the resource
   * exists but does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String resource = AppProfileName.of("[PROJECT]", "[INSTANCE]", "[APP_PROFILE]").toString();
   *   Policy response = baseBigtableTableAdminClient.getIamPolicy(resource);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(String resource) {
    GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder().setResource(resource).build();
    return getIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a Bigtable resource. Returns an empty policy if the resource
   * exists but does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   Policy response = baseBigtableTableAdminClient.getIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy getIamPolicy(GetIamPolicyRequest request) {
    return getIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets the access control policy for a Bigtable resource. Returns an empty policy if the resource
   * exists but does not have a policy set.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetIamPolicyRequest request =
   *       GetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .setOptions(GetPolicyOptions.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       baseBigtableTableAdminClient.getIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return stub.getIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on a Bigtable resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ResourceName resource =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
   *   Policy policy = Policy.newBuilder().build();
   *   Policy response = baseBigtableTableAdminClient.setIamPolicy(resource, policy);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. See the
   *     operation documentation for the appropriate value for this field.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(ResourceName resource, Policy policy) {
    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .setPolicy(policy)
            .build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on a Bigtable resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String resource = AppProfileName.of("[PROJECT]", "[INSTANCE]", "[APP_PROFILE]").toString();
   *   Policy policy = Policy.newBuilder().build();
   *   Policy response = baseBigtableTableAdminClient.setIamPolicy(resource, policy);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy is being specified. See the
   *     operation documentation for the appropriate value for this field.
   * @param policy REQUIRED: The complete policy to be applied to the `resource`. The size of the
   *     policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud
   *     Platform services (such as Projects) might reject them.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(String resource, Policy policy) {
    SetIamPolicyRequest request =
        SetIamPolicyRequest.newBuilder().setResource(resource).setPolicy(policy).build();
    return setIamPolicy(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on a Bigtable resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   Policy response = baseBigtableTableAdminClient.setIamPolicy(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Policy setIamPolicy(SetIamPolicyRequest request) {
    return setIamPolicyCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Sets the access control policy on a Bigtable resource. Replaces any existing policy.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SetIamPolicyRequest request =
   *       SetIamPolicyRequest.newBuilder()
   *           .setResource(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .setPolicy(Policy.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<Policy> future =
   *       baseBigtableTableAdminClient.setIamPolicyCallable().futureCall(request);
   *   // Do something.
   *   Policy response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return stub.setIamPolicyCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that the caller has on the specified Bigtable resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ResourceName resource =
   *       AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]");
   *   List<String> permissions = new ArrayList<>();
   *   TestIamPermissionsResponse response =
   *       baseBigtableTableAdminClient.testIamPermissions(resource, permissions);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      ResourceName resource, List<String> permissions) {
    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource == null ? null : resource.toString())
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that the caller has on the specified Bigtable resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String resource = AppProfileName.of("[PROJECT]", "[INSTANCE]", "[APP_PROFILE]").toString();
   *   List<String> permissions = new ArrayList<>();
   *   TestIamPermissionsResponse response =
   *       baseBigtableTableAdminClient.testIamPermissions(resource, permissions);
   * }
   * }</pre>
   *
   * @param resource REQUIRED: The resource for which the policy detail is being requested. See the
   *     operation documentation for the appropriate value for this field.
   * @param permissions The set of permissions to check for the `resource`. Permissions with
   *     wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more information see
   *     [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(
      String resource, List<String> permissions) {
    TestIamPermissionsRequest request =
        TestIamPermissionsRequest.newBuilder()
            .setResource(resource)
            .addAllPermissions(permissions)
            .build();
    return testIamPermissions(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that the caller has on the specified Bigtable resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   TestIamPermissionsResponse response =
   *       baseBigtableTableAdminClient.testIamPermissions(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TestIamPermissionsResponse testIamPermissions(TestIamPermissionsRequest request) {
    return testIamPermissionsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Returns permissions that the caller has on the specified Bigtable resource.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TestIamPermissionsRequest request =
   *       TestIamPermissionsRequest.newBuilder()
   *           .setResource(
   *               AuthorizedViewName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[AUTHORIZED_VIEW]")
   *                   .toString())
   *           .addAllPermissions(new ArrayList<String>())
   *           .build();
   *   ApiFuture<TestIamPermissionsResponse> future =
   *       baseBigtableTableAdminClient.testIamPermissionsCallable().futureCall(request);
   *   // Do something.
   *   TestIamPermissionsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return stub.testIamPermissionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   String schemaBundleId = "schemaBundleId2039843326";
   *   SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
   *   SchemaBundle response =
   *       baseBigtableTableAdminClient
   *           .createSchemaBundleAsync(parent, schemaBundleId, schemaBundle)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource where this schema bundle will be created. Values
   *     are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param schemaBundleId Required. The unique ID to use for the schema bundle, which will become
   *     the final component of the schema bundle's resource name.
   * @param schemaBundle Required. The schema bundle to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SchemaBundle, CreateSchemaBundleMetadata> createSchemaBundleAsync(
      TableName parent, String schemaBundleId, SchemaBundle schemaBundle) {
    CreateSchemaBundleRequest request =
        CreateSchemaBundleRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setSchemaBundleId(schemaBundleId)
            .setSchemaBundle(schemaBundle)
            .build();
    return createSchemaBundleAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   String schemaBundleId = "schemaBundleId2039843326";
   *   SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
   *   SchemaBundle response =
   *       baseBigtableTableAdminClient
   *           .createSchemaBundleAsync(parent, schemaBundleId, schemaBundle)
   *           .get();
   * }
   * }</pre>
   *
   * @param parent Required. The parent resource where this schema bundle will be created. Values
   *     are of the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @param schemaBundleId Required. The unique ID to use for the schema bundle, which will become
   *     the final component of the schema bundle's resource name.
   * @param schemaBundle Required. The schema bundle to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SchemaBundle, CreateSchemaBundleMetadata> createSchemaBundleAsync(
      String parent, String schemaBundleId, SchemaBundle schemaBundle) {
    CreateSchemaBundleRequest request =
        CreateSchemaBundleRequest.newBuilder()
            .setParent(parent)
            .setSchemaBundleId(schemaBundleId)
            .setSchemaBundle(schemaBundle)
            .build();
    return createSchemaBundleAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateSchemaBundleRequest request =
   *       CreateSchemaBundleRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setSchemaBundleId("schemaBundleId2039843326")
   *           .setSchemaBundle(SchemaBundle.newBuilder().build())
   *           .build();
   *   SchemaBundle response = baseBigtableTableAdminClient.createSchemaBundleAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SchemaBundle, CreateSchemaBundleMetadata> createSchemaBundleAsync(
      CreateSchemaBundleRequest request) {
    return createSchemaBundleOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateSchemaBundleRequest request =
   *       CreateSchemaBundleRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setSchemaBundleId("schemaBundleId2039843326")
   *           .setSchemaBundle(SchemaBundle.newBuilder().build())
   *           .build();
   *   OperationFuture<SchemaBundle, CreateSchemaBundleMetadata> future =
   *       baseBigtableTableAdminClient.createSchemaBundleOperationCallable().futureCall(request);
   *   // Do something.
   *   SchemaBundle response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          CreateSchemaBundleRequest, SchemaBundle, CreateSchemaBundleMetadata>
      createSchemaBundleOperationCallable() {
    return stub.createSchemaBundleOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   CreateSchemaBundleRequest request =
   *       CreateSchemaBundleRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setSchemaBundleId("schemaBundleId2039843326")
   *           .setSchemaBundle(SchemaBundle.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.createSchemaBundleCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateSchemaBundleRequest, Operation> createSchemaBundleCallable() {
    return stub.createSchemaBundleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SchemaBundle schemaBundle = SchemaBundle.newBuilder().build();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   SchemaBundle response =
   *       baseBigtableTableAdminClient.updateSchemaBundleAsync(schemaBundle, updateMask).get();
   * }
   * }</pre>
   *
   * @param schemaBundle Required. The schema bundle to update.
   *     <p>The schema bundle's `name` field is used to identify the schema bundle to update. Values
   *     are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/schemaBundles/{schema_bundle}`
   * @param updateMask Optional. The list of fields to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SchemaBundle, UpdateSchemaBundleMetadata> updateSchemaBundleAsync(
      SchemaBundle schemaBundle, FieldMask updateMask) {
    UpdateSchemaBundleRequest request =
        UpdateSchemaBundleRequest.newBuilder()
            .setSchemaBundle(schemaBundle)
            .setUpdateMask(updateMask)
            .build();
    return updateSchemaBundleAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateSchemaBundleRequest request =
   *       UpdateSchemaBundleRequest.newBuilder()
   *           .setSchemaBundle(SchemaBundle.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   SchemaBundle response = baseBigtableTableAdminClient.updateSchemaBundleAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<SchemaBundle, UpdateSchemaBundleMetadata> updateSchemaBundleAsync(
      UpdateSchemaBundleRequest request) {
    return updateSchemaBundleOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateSchemaBundleRequest request =
   *       UpdateSchemaBundleRequest.newBuilder()
   *           .setSchemaBundle(SchemaBundle.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   OperationFuture<SchemaBundle, UpdateSchemaBundleMetadata> future =
   *       baseBigtableTableAdminClient.updateSchemaBundleOperationCallable().futureCall(request);
   *   // Do something.
   *   SchemaBundle response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<
          UpdateSchemaBundleRequest, SchemaBundle, UpdateSchemaBundleMetadata>
      updateSchemaBundleOperationCallable() {
    return stub.updateSchemaBundleOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   UpdateSchemaBundleRequest request =
   *       UpdateSchemaBundleRequest.newBuilder()
   *           .setSchemaBundle(SchemaBundle.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setIgnoreWarnings(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       baseBigtableTableAdminClient.updateSchemaBundleCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateSchemaBundleRequest, Operation> updateSchemaBundleCallable() {
    return stub.updateSchemaBundleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified schema bundle.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SchemaBundleName name =
   *       SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]");
   *   SchemaBundle response = baseBigtableTableAdminClient.getSchemaBundle(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the schema bundle to retrieve. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/schemaBundles/{schema_bundle}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SchemaBundle getSchemaBundle(SchemaBundleName name) {
    GetSchemaBundleRequest request =
        GetSchemaBundleRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getSchemaBundle(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified schema bundle.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name =
   *       SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]").toString();
   *   SchemaBundle response = baseBigtableTableAdminClient.getSchemaBundle(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the schema bundle to retrieve. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/schemaBundles/{schema_bundle}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SchemaBundle getSchemaBundle(String name) {
    GetSchemaBundleRequest request = GetSchemaBundleRequest.newBuilder().setName(name).build();
    return getSchemaBundle(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified schema bundle.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetSchemaBundleRequest request =
   *       GetSchemaBundleRequest.newBuilder()
   *           .setName(
   *               SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
   *                   .toString())
   *           .build();
   *   SchemaBundle response = baseBigtableTableAdminClient.getSchemaBundle(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final SchemaBundle getSchemaBundle(GetSchemaBundleRequest request) {
    return getSchemaBundleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets metadata information about the specified schema bundle.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   GetSchemaBundleRequest request =
   *       GetSchemaBundleRequest.newBuilder()
   *           .setName(
   *               SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
   *                   .toString())
   *           .build();
   *   ApiFuture<SchemaBundle> future =
   *       baseBigtableTableAdminClient.getSchemaBundleCallable().futureCall(request);
   *   // Do something.
   *   SchemaBundle response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetSchemaBundleRequest, SchemaBundle> getSchemaBundleCallable() {
    return stub.getSchemaBundleCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all schema bundles associated with the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   TableName parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]");
   *   for (SchemaBundle element :
   *       baseBigtableTableAdminClient.listSchemaBundles(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of schema bundles. Values are of
   *     the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSchemaBundlesPagedResponse listSchemaBundles(TableName parent) {
    ListSchemaBundlesRequest request =
        ListSchemaBundlesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listSchemaBundles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all schema bundles associated with the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String parent = TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString();
   *   for (SchemaBundle element :
   *       baseBigtableTableAdminClient.listSchemaBundles(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The parent, which owns this collection of schema bundles. Values are of
   *     the form `projects/{project}/instances/{instance}/tables/{table}`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSchemaBundlesPagedResponse listSchemaBundles(String parent) {
    ListSchemaBundlesRequest request =
        ListSchemaBundlesRequest.newBuilder().setParent(parent).build();
    return listSchemaBundles(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all schema bundles associated with the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListSchemaBundlesRequest request =
   *       ListSchemaBundlesRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (SchemaBundle element :
   *       baseBigtableTableAdminClient.listSchemaBundles(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListSchemaBundlesPagedResponse listSchemaBundles(ListSchemaBundlesRequest request) {
    return listSchemaBundlesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all schema bundles associated with the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListSchemaBundlesRequest request =
   *       ListSchemaBundlesRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<SchemaBundle> future =
   *       baseBigtableTableAdminClient.listSchemaBundlesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (SchemaBundle element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSchemaBundlesRequest, ListSchemaBundlesPagedResponse>
      listSchemaBundlesPagedCallable() {
    return stub.listSchemaBundlesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists all schema bundles associated with the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   ListSchemaBundlesRequest request =
   *       ListSchemaBundlesRequest.newBuilder()
   *           .setParent(TableName.of("[PROJECT]", "[INSTANCE]", "[TABLE]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListSchemaBundlesResponse response =
   *         baseBigtableTableAdminClient.listSchemaBundlesCallable().call(request);
   *     for (SchemaBundle element : response.getSchemaBundlesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListSchemaBundlesRequest, ListSchemaBundlesResponse>
      listSchemaBundlesCallable() {
    return stub.listSchemaBundlesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   SchemaBundleName name =
   *       SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]");
   *   baseBigtableTableAdminClient.deleteSchemaBundle(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the schema bundle to delete. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/schemaBundles/{schema_bundle}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSchemaBundle(SchemaBundleName name) {
    DeleteSchemaBundleRequest request =
        DeleteSchemaBundleRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteSchemaBundle(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   String name =
   *       SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]").toString();
   *   baseBigtableTableAdminClient.deleteSchemaBundle(name);
   * }
   * }</pre>
   *
   * @param name Required. The unique name of the schema bundle to delete. Values are of the form
   *     `projects/{project}/instances/{instance}/tables/{table}/schemaBundles/{schema_bundle}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSchemaBundle(String name) {
    DeleteSchemaBundleRequest request =
        DeleteSchemaBundleRequest.newBuilder().setName(name).build();
    deleteSchemaBundle(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteSchemaBundleRequest request =
   *       DeleteSchemaBundleRequest.newBuilder()
   *           .setName(
   *               SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   baseBigtableTableAdminClient.deleteSchemaBundle(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteSchemaBundle(DeleteSchemaBundleRequest request) {
    deleteSchemaBundleCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a schema bundle in the specified table.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigtableTableAdminClient baseBigtableTableAdminClient =
   *     BaseBigtableTableAdminClient.create()) {
   *   DeleteSchemaBundleRequest request =
   *       DeleteSchemaBundleRequest.newBuilder()
   *           .setName(
   *               SchemaBundleName.of("[PROJECT]", "[INSTANCE]", "[TABLE]", "[SCHEMA_BUNDLE]")
   *                   .toString())
   *           .setEtag("etag3123477")
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigtableTableAdminClient.deleteSchemaBundleCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteSchemaBundleRequest, Empty> deleteSchemaBundleCallable() {
    return stub.deleteSchemaBundleCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListTablesPagedResponse
      extends AbstractPagedListResponse<
          ListTablesRequest,
          ListTablesResponse,
          Table,
          ListTablesPage,
          ListTablesFixedSizeCollection> {

    public static ApiFuture<ListTablesPagedResponse> createAsync(
        PageContext<ListTablesRequest, ListTablesResponse, Table> context,
        ApiFuture<ListTablesResponse> futureResponse) {
      ApiFuture<ListTablesPage> futurePage =
          ListTablesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListTablesPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListTablesPagedResponse(ListTablesPage page) {
      super(page, ListTablesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTablesPage
      extends AbstractPage<ListTablesRequest, ListTablesResponse, Table, ListTablesPage> {

    private ListTablesPage(
        PageContext<ListTablesRequest, ListTablesResponse, Table> context,
        ListTablesResponse response) {
      super(context, response);
    }

    private static ListTablesPage createEmptyPage() {
      return new ListTablesPage(null, null);
    }

    @Override
    protected ListTablesPage createPage(
        PageContext<ListTablesRequest, ListTablesResponse, Table> context,
        ListTablesResponse response) {
      return new ListTablesPage(context, response);
    }

    @Override
    public ApiFuture<ListTablesPage> createPageAsync(
        PageContext<ListTablesRequest, ListTablesResponse, Table> context,
        ApiFuture<ListTablesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTablesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTablesRequest,
          ListTablesResponse,
          Table,
          ListTablesPage,
          ListTablesFixedSizeCollection> {

    private ListTablesFixedSizeCollection(List<ListTablesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTablesFixedSizeCollection createEmptyCollection() {
      return new ListTablesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTablesFixedSizeCollection createCollection(
        List<ListTablesPage> pages, int collectionSize) {
      return new ListTablesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListAuthorizedViewsPagedResponse
      extends AbstractPagedListResponse<
          ListAuthorizedViewsRequest,
          ListAuthorizedViewsResponse,
          AuthorizedView,
          ListAuthorizedViewsPage,
          ListAuthorizedViewsFixedSizeCollection> {

    public static ApiFuture<ListAuthorizedViewsPagedResponse> createAsync(
        PageContext<ListAuthorizedViewsRequest, ListAuthorizedViewsResponse, AuthorizedView>
            context,
        ApiFuture<ListAuthorizedViewsResponse> futureResponse) {
      ApiFuture<ListAuthorizedViewsPage> futurePage =
          ListAuthorizedViewsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListAuthorizedViewsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListAuthorizedViewsPagedResponse(ListAuthorizedViewsPage page) {
      super(page, ListAuthorizedViewsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListAuthorizedViewsPage
      extends AbstractPage<
          ListAuthorizedViewsRequest,
          ListAuthorizedViewsResponse,
          AuthorizedView,
          ListAuthorizedViewsPage> {

    private ListAuthorizedViewsPage(
        PageContext<ListAuthorizedViewsRequest, ListAuthorizedViewsResponse, AuthorizedView>
            context,
        ListAuthorizedViewsResponse response) {
      super(context, response);
    }

    private static ListAuthorizedViewsPage createEmptyPage() {
      return new ListAuthorizedViewsPage(null, null);
    }

    @Override
    protected ListAuthorizedViewsPage createPage(
        PageContext<ListAuthorizedViewsRequest, ListAuthorizedViewsResponse, AuthorizedView>
            context,
        ListAuthorizedViewsResponse response) {
      return new ListAuthorizedViewsPage(context, response);
    }

    @Override
    public ApiFuture<ListAuthorizedViewsPage> createPageAsync(
        PageContext<ListAuthorizedViewsRequest, ListAuthorizedViewsResponse, AuthorizedView>
            context,
        ApiFuture<ListAuthorizedViewsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListAuthorizedViewsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListAuthorizedViewsRequest,
          ListAuthorizedViewsResponse,
          AuthorizedView,
          ListAuthorizedViewsPage,
          ListAuthorizedViewsFixedSizeCollection> {

    private ListAuthorizedViewsFixedSizeCollection(
        List<ListAuthorizedViewsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListAuthorizedViewsFixedSizeCollection createEmptyCollection() {
      return new ListAuthorizedViewsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListAuthorizedViewsFixedSizeCollection createCollection(
        List<ListAuthorizedViewsPage> pages, int collectionSize) {
      return new ListAuthorizedViewsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListSnapshotsPagedResponse
      extends AbstractPagedListResponse<
          ListSnapshotsRequest,
          ListSnapshotsResponse,
          Snapshot,
          ListSnapshotsPage,
          ListSnapshotsFixedSizeCollection> {

    public static ApiFuture<ListSnapshotsPagedResponse> createAsync(
        PageContext<ListSnapshotsRequest, ListSnapshotsResponse, Snapshot> context,
        ApiFuture<ListSnapshotsResponse> futureResponse) {
      ApiFuture<ListSnapshotsPage> futurePage =
          ListSnapshotsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListSnapshotsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListSnapshotsPagedResponse(ListSnapshotsPage page) {
      super(page, ListSnapshotsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSnapshotsPage
      extends AbstractPage<
          ListSnapshotsRequest, ListSnapshotsResponse, Snapshot, ListSnapshotsPage> {

    private ListSnapshotsPage(
        PageContext<ListSnapshotsRequest, ListSnapshotsResponse, Snapshot> context,
        ListSnapshotsResponse response) {
      super(context, response);
    }

    private static ListSnapshotsPage createEmptyPage() {
      return new ListSnapshotsPage(null, null);
    }

    @Override
    protected ListSnapshotsPage createPage(
        PageContext<ListSnapshotsRequest, ListSnapshotsResponse, Snapshot> context,
        ListSnapshotsResponse response) {
      return new ListSnapshotsPage(context, response);
    }

    @Override
    public ApiFuture<ListSnapshotsPage> createPageAsync(
        PageContext<ListSnapshotsRequest, ListSnapshotsResponse, Snapshot> context,
        ApiFuture<ListSnapshotsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSnapshotsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSnapshotsRequest,
          ListSnapshotsResponse,
          Snapshot,
          ListSnapshotsPage,
          ListSnapshotsFixedSizeCollection> {

    private ListSnapshotsFixedSizeCollection(List<ListSnapshotsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSnapshotsFixedSizeCollection createEmptyCollection() {
      return new ListSnapshotsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSnapshotsFixedSizeCollection createCollection(
        List<ListSnapshotsPage> pages, int collectionSize) {
      return new ListSnapshotsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListBackupsPagedResponse
      extends AbstractPagedListResponse<
          ListBackupsRequest,
          ListBackupsResponse,
          Backup,
          ListBackupsPage,
          ListBackupsFixedSizeCollection> {

    public static ApiFuture<ListBackupsPagedResponse> createAsync(
        PageContext<ListBackupsRequest, ListBackupsResponse, Backup> context,
        ApiFuture<ListBackupsResponse> futureResponse) {
      ApiFuture<ListBackupsPage> futurePage =
          ListBackupsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage, input -> new ListBackupsPagedResponse(input), MoreExecutors.directExecutor());
    }

    private ListBackupsPagedResponse(ListBackupsPage page) {
      super(page, ListBackupsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListBackupsPage
      extends AbstractPage<ListBackupsRequest, ListBackupsResponse, Backup, ListBackupsPage> {

    private ListBackupsPage(
        PageContext<ListBackupsRequest, ListBackupsResponse, Backup> context,
        ListBackupsResponse response) {
      super(context, response);
    }

    private static ListBackupsPage createEmptyPage() {
      return new ListBackupsPage(null, null);
    }

    @Override
    protected ListBackupsPage createPage(
        PageContext<ListBackupsRequest, ListBackupsResponse, Backup> context,
        ListBackupsResponse response) {
      return new ListBackupsPage(context, response);
    }

    @Override
    public ApiFuture<ListBackupsPage> createPageAsync(
        PageContext<ListBackupsRequest, ListBackupsResponse, Backup> context,
        ApiFuture<ListBackupsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListBackupsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListBackupsRequest,
          ListBackupsResponse,
          Backup,
          ListBackupsPage,
          ListBackupsFixedSizeCollection> {

    private ListBackupsFixedSizeCollection(List<ListBackupsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListBackupsFixedSizeCollection createEmptyCollection() {
      return new ListBackupsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListBackupsFixedSizeCollection createCollection(
        List<ListBackupsPage> pages, int collectionSize) {
      return new ListBackupsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListSchemaBundlesPagedResponse
      extends AbstractPagedListResponse<
          ListSchemaBundlesRequest,
          ListSchemaBundlesResponse,
          SchemaBundle,
          ListSchemaBundlesPage,
          ListSchemaBundlesFixedSizeCollection> {

    public static ApiFuture<ListSchemaBundlesPagedResponse> createAsync(
        PageContext<ListSchemaBundlesRequest, ListSchemaBundlesResponse, SchemaBundle> context,
        ApiFuture<ListSchemaBundlesResponse> futureResponse) {
      ApiFuture<ListSchemaBundlesPage> futurePage =
          ListSchemaBundlesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListSchemaBundlesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListSchemaBundlesPagedResponse(ListSchemaBundlesPage page) {
      super(page, ListSchemaBundlesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListSchemaBundlesPage
      extends AbstractPage<
          ListSchemaBundlesRequest,
          ListSchemaBundlesResponse,
          SchemaBundle,
          ListSchemaBundlesPage> {

    private ListSchemaBundlesPage(
        PageContext<ListSchemaBundlesRequest, ListSchemaBundlesResponse, SchemaBundle> context,
        ListSchemaBundlesResponse response) {
      super(context, response);
    }

    private static ListSchemaBundlesPage createEmptyPage() {
      return new ListSchemaBundlesPage(null, null);
    }

    @Override
    protected ListSchemaBundlesPage createPage(
        PageContext<ListSchemaBundlesRequest, ListSchemaBundlesResponse, SchemaBundle> context,
        ListSchemaBundlesResponse response) {
      return new ListSchemaBundlesPage(context, response);
    }

    @Override
    public ApiFuture<ListSchemaBundlesPage> createPageAsync(
        PageContext<ListSchemaBundlesRequest, ListSchemaBundlesResponse, SchemaBundle> context,
        ApiFuture<ListSchemaBundlesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListSchemaBundlesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListSchemaBundlesRequest,
          ListSchemaBundlesResponse,
          SchemaBundle,
          ListSchemaBundlesPage,
          ListSchemaBundlesFixedSizeCollection> {

    private ListSchemaBundlesFixedSizeCollection(
        List<ListSchemaBundlesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListSchemaBundlesFixedSizeCollection createEmptyCollection() {
      return new ListSchemaBundlesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListSchemaBundlesFixedSizeCollection createCollection(
        List<ListSchemaBundlesPage> pages, int collectionSize) {
      return new ListSchemaBundlesFixedSizeCollection(pages, collectionSize);
    }
  }
}
