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

package com.google.cloud.bigtable.admin.v2.stub;

import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListAuthorizedViewsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListBackupsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListSchemaBundlesPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListSnapshotsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableTableAdminClient.ListTablesPagedResponse;

import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.bigtable.admin.v2.AuthorizedView;
import com.google.bigtable.admin.v2.Backup;
import com.google.bigtable.admin.v2.CheckConsistencyRequest;
import com.google.bigtable.admin.v2.CheckConsistencyResponse;
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
import com.google.bigtable.admin.v2.Snapshot;
import com.google.bigtable.admin.v2.SnapshotTableMetadata;
import com.google.bigtable.admin.v2.SnapshotTableRequest;
import com.google.bigtable.admin.v2.Table;
import com.google.bigtable.admin.v2.UndeleteTableMetadata;
import com.google.bigtable.admin.v2.UndeleteTableRequest;
import com.google.bigtable.admin.v2.UpdateAuthorizedViewMetadata;
import com.google.bigtable.admin.v2.UpdateAuthorizedViewRequest;
import com.google.bigtable.admin.v2.UpdateBackupRequest;
import com.google.bigtable.admin.v2.UpdateSchemaBundleMetadata;
import com.google.bigtable.admin.v2.UpdateSchemaBundleRequest;
import com.google.bigtable.admin.v2.UpdateTableMetadata;
import com.google.bigtable.admin.v2.UpdateTableRequest;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** For internal use only. */
@Generated("by gapic-generator")
@InternalApi
public abstract class BigtableTableAdminStub implements BackgroundResource {

  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateTableRequest, Table> createTableCallable() {
    throw new UnsupportedOperationException("Not implemented: createTableCallable()");
  }

  public OperationCallable<CreateTableFromSnapshotRequest, Table, CreateTableFromSnapshotMetadata>
      createTableFromSnapshotOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createTableFromSnapshotOperationCallable()");
  }

  public UnaryCallable<CreateTableFromSnapshotRequest, Operation>
      createTableFromSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: createTableFromSnapshotCallable()");
  }

  public UnaryCallable<ListTablesRequest, ListTablesPagedResponse> listTablesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listTablesPagedCallable()");
  }

  public UnaryCallable<ListTablesRequest, ListTablesResponse> listTablesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTablesCallable()");
  }

  public UnaryCallable<GetTableRequest, Table> getTableCallable() {
    throw new UnsupportedOperationException("Not implemented: getTableCallable()");
  }

  public OperationCallable<UpdateTableRequest, Table, UpdateTableMetadata>
      updateTableOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTableOperationCallable()");
  }

  public UnaryCallable<UpdateTableRequest, Operation> updateTableCallable() {
    throw new UnsupportedOperationException("Not implemented: updateTableCallable()");
  }

  public UnaryCallable<DeleteTableRequest, Empty> deleteTableCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTableCallable()");
  }

  public OperationCallable<UndeleteTableRequest, Table, UndeleteTableMetadata>
      undeleteTableOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: undeleteTableOperationCallable()");
  }

  public UnaryCallable<UndeleteTableRequest, Operation> undeleteTableCallable() {
    throw new UnsupportedOperationException("Not implemented: undeleteTableCallable()");
  }

  public OperationCallable<
          CreateAuthorizedViewRequest, AuthorizedView, CreateAuthorizedViewMetadata>
      createAuthorizedViewOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createAuthorizedViewOperationCallable()");
  }

  public UnaryCallable<CreateAuthorizedViewRequest, Operation> createAuthorizedViewCallable() {
    throw new UnsupportedOperationException("Not implemented: createAuthorizedViewCallable()");
  }

  public UnaryCallable<ListAuthorizedViewsRequest, ListAuthorizedViewsPagedResponse>
      listAuthorizedViewsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listAuthorizedViewsPagedCallable()");
  }

  public UnaryCallable<ListAuthorizedViewsRequest, ListAuthorizedViewsResponse>
      listAuthorizedViewsCallable() {
    throw new UnsupportedOperationException("Not implemented: listAuthorizedViewsCallable()");
  }

  public UnaryCallable<GetAuthorizedViewRequest, AuthorizedView> getAuthorizedViewCallable() {
    throw new UnsupportedOperationException("Not implemented: getAuthorizedViewCallable()");
  }

  public OperationCallable<
          UpdateAuthorizedViewRequest, AuthorizedView, UpdateAuthorizedViewMetadata>
      updateAuthorizedViewOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateAuthorizedViewOperationCallable()");
  }

  public UnaryCallable<UpdateAuthorizedViewRequest, Operation> updateAuthorizedViewCallable() {
    throw new UnsupportedOperationException("Not implemented: updateAuthorizedViewCallable()");
  }

  public UnaryCallable<DeleteAuthorizedViewRequest, Empty> deleteAuthorizedViewCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteAuthorizedViewCallable()");
  }

  public UnaryCallable<ModifyColumnFamiliesRequest, Table> modifyColumnFamiliesCallable() {
    throw new UnsupportedOperationException("Not implemented: modifyColumnFamiliesCallable()");
  }

  public UnaryCallable<DropRowRangeRequest, Empty> dropRowRangeCallable() {
    throw new UnsupportedOperationException("Not implemented: dropRowRangeCallable()");
  }

  public UnaryCallable<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
      generateConsistencyTokenCallable() {
    throw new UnsupportedOperationException("Not implemented: generateConsistencyTokenCallable()");
  }

  public UnaryCallable<CheckConsistencyRequest, CheckConsistencyResponse>
      checkConsistencyCallable() {
    throw new UnsupportedOperationException("Not implemented: checkConsistencyCallable()");
  }

  public OperationCallable<SnapshotTableRequest, Snapshot, SnapshotTableMetadata>
      snapshotTableOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: snapshotTableOperationCallable()");
  }

  public UnaryCallable<SnapshotTableRequest, Operation> snapshotTableCallable() {
    throw new UnsupportedOperationException("Not implemented: snapshotTableCallable()");
  }

  public UnaryCallable<GetSnapshotRequest, Snapshot> getSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: getSnapshotCallable()");
  }

  public UnaryCallable<ListSnapshotsRequest, ListSnapshotsPagedResponse>
      listSnapshotsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSnapshotsPagedCallable()");
  }

  public UnaryCallable<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsCallable() {
    throw new UnsupportedOperationException("Not implemented: listSnapshotsCallable()");
  }

  public UnaryCallable<DeleteSnapshotRequest, Empty> deleteSnapshotCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSnapshotCallable()");
  }

  public OperationCallable<CreateBackupRequest, Backup, CreateBackupMetadata>
      createBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: createBackupOperationCallable()");
  }

  public UnaryCallable<CreateBackupRequest, Operation> createBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: createBackupCallable()");
  }

  public UnaryCallable<GetBackupRequest, Backup> getBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: getBackupCallable()");
  }

  public UnaryCallable<UpdateBackupRequest, Backup> updateBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: updateBackupCallable()");
  }

  public UnaryCallable<DeleteBackupRequest, Empty> deleteBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteBackupCallable()");
  }

  public UnaryCallable<ListBackupsRequest, ListBackupsPagedResponse> listBackupsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackupsPagedCallable()");
  }

  public UnaryCallable<ListBackupsRequest, ListBackupsResponse> listBackupsCallable() {
    throw new UnsupportedOperationException("Not implemented: listBackupsCallable()");
  }

  public OperationCallable<RestoreTableRequest, Table, RestoreTableMetadata>
      restoreTableOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreTableOperationCallable()");
  }

  public UnaryCallable<RestoreTableRequest, Operation> restoreTableCallable() {
    throw new UnsupportedOperationException("Not implemented: restoreTableCallable()");
  }

  public OperationCallable<CopyBackupRequest, Backup, CopyBackupMetadata>
      copyBackupOperationCallable() {
    throw new UnsupportedOperationException("Not implemented: copyBackupOperationCallable()");
  }

  public UnaryCallable<CopyBackupRequest, Operation> copyBackupCallable() {
    throw new UnsupportedOperationException("Not implemented: copyBackupCallable()");
  }

  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: getIamPolicyCallable()");
  }

  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    throw new UnsupportedOperationException("Not implemented: setIamPolicyCallable()");
  }

  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    throw new UnsupportedOperationException("Not implemented: testIamPermissionsCallable()");
  }

  public OperationCallable<CreateSchemaBundleRequest, SchemaBundle, CreateSchemaBundleMetadata>
      createSchemaBundleOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createSchemaBundleOperationCallable()");
  }

  public UnaryCallable<CreateSchemaBundleRequest, Operation> createSchemaBundleCallable() {
    throw new UnsupportedOperationException("Not implemented: createSchemaBundleCallable()");
  }

  public OperationCallable<UpdateSchemaBundleRequest, SchemaBundle, UpdateSchemaBundleMetadata>
      updateSchemaBundleOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateSchemaBundleOperationCallable()");
  }

  public UnaryCallable<UpdateSchemaBundleRequest, Operation> updateSchemaBundleCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSchemaBundleCallable()");
  }

  public UnaryCallable<GetSchemaBundleRequest, SchemaBundle> getSchemaBundleCallable() {
    throw new UnsupportedOperationException("Not implemented: getSchemaBundleCallable()");
  }

  public UnaryCallable<ListSchemaBundlesRequest, ListSchemaBundlesPagedResponse>
      listSchemaBundlesPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSchemaBundlesPagedCallable()");
  }

  public UnaryCallable<ListSchemaBundlesRequest, ListSchemaBundlesResponse>
      listSchemaBundlesCallable() {
    throw new UnsupportedOperationException("Not implemented: listSchemaBundlesCallable()");
  }

  public UnaryCallable<DeleteSchemaBundleRequest, Empty> deleteSchemaBundleCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSchemaBundleCallable()");
  }

  @Override
  public abstract void close();
}
