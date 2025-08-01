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

import com.google.api.core.ApiFunction;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
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
import com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** For internal use only. */
@Generated("by gapic-generator")
@InternalApi
public class BaseBigtableTableAdminSettings extends ClientSettings<BaseBigtableTableAdminSettings> {

  /** Returns the object with the settings used for calls to createTable. */
  public UnaryCallSettings<CreateTableRequest, Table> createTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).createTableSettings();
  }

  /** Returns the object with the settings used for calls to createTableFromSnapshot. */
  public UnaryCallSettings<CreateTableFromSnapshotRequest, Operation>
      createTableFromSnapshotSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).createTableFromSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to createTableFromSnapshot. */
  public OperationCallSettings<
          CreateTableFromSnapshotRequest, Table, CreateTableFromSnapshotMetadata>
      createTableFromSnapshotOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings())
        .createTableFromSnapshotOperationSettings();
  }

  /** Returns the object with the settings used for calls to listTables. */
  public PagedCallSettings<ListTablesRequest, ListTablesResponse, ListTablesPagedResponse>
      listTablesSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).listTablesSettings();
  }

  /** Returns the object with the settings used for calls to getTable. */
  public UnaryCallSettings<GetTableRequest, Table> getTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).getTableSettings();
  }

  /** Returns the object with the settings used for calls to updateTable. */
  public UnaryCallSettings<UpdateTableRequest, Operation> updateTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).updateTableSettings();
  }

  /** Returns the object with the settings used for calls to updateTable. */
  public OperationCallSettings<UpdateTableRequest, Table, UpdateTableMetadata>
      updateTableOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).updateTableOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteTable. */
  public UnaryCallSettings<DeleteTableRequest, Empty> deleteTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).deleteTableSettings();
  }

  /** Returns the object with the settings used for calls to undeleteTable. */
  public UnaryCallSettings<UndeleteTableRequest, Operation> undeleteTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).undeleteTableSettings();
  }

  /** Returns the object with the settings used for calls to undeleteTable. */
  public OperationCallSettings<UndeleteTableRequest, Table, UndeleteTableMetadata>
      undeleteTableOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).undeleteTableOperationSettings();
  }

  /** Returns the object with the settings used for calls to createAuthorizedView. */
  public UnaryCallSettings<CreateAuthorizedViewRequest, Operation> createAuthorizedViewSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).createAuthorizedViewSettings();
  }

  /** Returns the object with the settings used for calls to createAuthorizedView. */
  public OperationCallSettings<
          CreateAuthorizedViewRequest, AuthorizedView, CreateAuthorizedViewMetadata>
      createAuthorizedViewOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings())
        .createAuthorizedViewOperationSettings();
  }

  /** Returns the object with the settings used for calls to listAuthorizedViews. */
  public PagedCallSettings<
          ListAuthorizedViewsRequest, ListAuthorizedViewsResponse, ListAuthorizedViewsPagedResponse>
      listAuthorizedViewsSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).listAuthorizedViewsSettings();
  }

  /** Returns the object with the settings used for calls to getAuthorizedView. */
  public UnaryCallSettings<GetAuthorizedViewRequest, AuthorizedView> getAuthorizedViewSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).getAuthorizedViewSettings();
  }

  /** Returns the object with the settings used for calls to updateAuthorizedView. */
  public UnaryCallSettings<UpdateAuthorizedViewRequest, Operation> updateAuthorizedViewSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).updateAuthorizedViewSettings();
  }

  /** Returns the object with the settings used for calls to updateAuthorizedView. */
  public OperationCallSettings<
          UpdateAuthorizedViewRequest, AuthorizedView, UpdateAuthorizedViewMetadata>
      updateAuthorizedViewOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings())
        .updateAuthorizedViewOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteAuthorizedView. */
  public UnaryCallSettings<DeleteAuthorizedViewRequest, Empty> deleteAuthorizedViewSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).deleteAuthorizedViewSettings();
  }

  /** Returns the object with the settings used for calls to modifyColumnFamilies. */
  public UnaryCallSettings<ModifyColumnFamiliesRequest, Table> modifyColumnFamiliesSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).modifyColumnFamiliesSettings();
  }

  /** Returns the object with the settings used for calls to dropRowRange. */
  public UnaryCallSettings<DropRowRangeRequest, Empty> dropRowRangeSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).dropRowRangeSettings();
  }

  /** Returns the object with the settings used for calls to generateConsistencyToken. */
  public UnaryCallSettings<GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
      generateConsistencyTokenSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).generateConsistencyTokenSettings();
  }

  /** Returns the object with the settings used for calls to checkConsistency. */
  public UnaryCallSettings<CheckConsistencyRequest, CheckConsistencyResponse>
      checkConsistencySettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).checkConsistencySettings();
  }

  /** Returns the object with the settings used for calls to snapshotTable. */
  public UnaryCallSettings<SnapshotTableRequest, Operation> snapshotTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).snapshotTableSettings();
  }

  /** Returns the object with the settings used for calls to snapshotTable. */
  public OperationCallSettings<SnapshotTableRequest, Snapshot, SnapshotTableMetadata>
      snapshotTableOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).snapshotTableOperationSettings();
  }

  /** Returns the object with the settings used for calls to getSnapshot. */
  public UnaryCallSettings<GetSnapshotRequest, Snapshot> getSnapshotSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).getSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to listSnapshots. */
  public PagedCallSettings<ListSnapshotsRequest, ListSnapshotsResponse, ListSnapshotsPagedResponse>
      listSnapshotsSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).listSnapshotsSettings();
  }

  /** Returns the object with the settings used for calls to deleteSnapshot. */
  public UnaryCallSettings<DeleteSnapshotRequest, Empty> deleteSnapshotSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).deleteSnapshotSettings();
  }

  /** Returns the object with the settings used for calls to createBackup. */
  public UnaryCallSettings<CreateBackupRequest, Operation> createBackupSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).createBackupSettings();
  }

  /** Returns the object with the settings used for calls to createBackup. */
  public OperationCallSettings<CreateBackupRequest, Backup, CreateBackupMetadata>
      createBackupOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).createBackupOperationSettings();
  }

  /** Returns the object with the settings used for calls to getBackup. */
  public UnaryCallSettings<GetBackupRequest, Backup> getBackupSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).getBackupSettings();
  }

  /** Returns the object with the settings used for calls to updateBackup. */
  public UnaryCallSettings<UpdateBackupRequest, Backup> updateBackupSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).updateBackupSettings();
  }

  /** Returns the object with the settings used for calls to deleteBackup. */
  public UnaryCallSettings<DeleteBackupRequest, Empty> deleteBackupSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).deleteBackupSettings();
  }

  /** Returns the object with the settings used for calls to listBackups. */
  public PagedCallSettings<ListBackupsRequest, ListBackupsResponse, ListBackupsPagedResponse>
      listBackupsSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).listBackupsSettings();
  }

  /** Returns the object with the settings used for calls to restoreTable. */
  public UnaryCallSettings<RestoreTableRequest, Operation> restoreTableSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).restoreTableSettings();
  }

  /** Returns the object with the settings used for calls to restoreTable. */
  public OperationCallSettings<RestoreTableRequest, Table, RestoreTableMetadata>
      restoreTableOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).restoreTableOperationSettings();
  }

  /** Returns the object with the settings used for calls to copyBackup. */
  public UnaryCallSettings<CopyBackupRequest, Operation> copyBackupSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).copyBackupSettings();
  }

  /** Returns the object with the settings used for calls to copyBackup. */
  public OperationCallSettings<CopyBackupRequest, Backup, CopyBackupMetadata>
      copyBackupOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).copyBackupOperationSettings();
  }

  /** Returns the object with the settings used for calls to getIamPolicy. */
  public UnaryCallSettings<GetIamPolicyRequest, Policy> getIamPolicySettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).getIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to setIamPolicy. */
  public UnaryCallSettings<SetIamPolicyRequest, Policy> setIamPolicySettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).setIamPolicySettings();
  }

  /** Returns the object with the settings used for calls to testIamPermissions. */
  public UnaryCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).testIamPermissionsSettings();
  }

  /** Returns the object with the settings used for calls to createSchemaBundle. */
  public UnaryCallSettings<CreateSchemaBundleRequest, Operation> createSchemaBundleSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).createSchemaBundleSettings();
  }

  /** Returns the object with the settings used for calls to createSchemaBundle. */
  public OperationCallSettings<CreateSchemaBundleRequest, SchemaBundle, CreateSchemaBundleMetadata>
      createSchemaBundleOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings())
        .createSchemaBundleOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateSchemaBundle. */
  public UnaryCallSettings<UpdateSchemaBundleRequest, Operation> updateSchemaBundleSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).updateSchemaBundleSettings();
  }

  /** Returns the object with the settings used for calls to updateSchemaBundle. */
  public OperationCallSettings<UpdateSchemaBundleRequest, SchemaBundle, UpdateSchemaBundleMetadata>
      updateSchemaBundleOperationSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings())
        .updateSchemaBundleOperationSettings();
  }

  /** Returns the object with the settings used for calls to getSchemaBundle. */
  public UnaryCallSettings<GetSchemaBundleRequest, SchemaBundle> getSchemaBundleSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).getSchemaBundleSettings();
  }

  /** Returns the object with the settings used for calls to listSchemaBundles. */
  public PagedCallSettings<
          ListSchemaBundlesRequest, ListSchemaBundlesResponse, ListSchemaBundlesPagedResponse>
      listSchemaBundlesSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).listSchemaBundlesSettings();
  }

  /** Returns the object with the settings used for calls to deleteSchemaBundle. */
  public UnaryCallSettings<DeleteSchemaBundleRequest, Empty> deleteSchemaBundleSettings() {
    return ((BigtableTableAdminStubSettings) getStubSettings()).deleteSchemaBundleSettings();
  }

  public static final BaseBigtableTableAdminSettings create(BigtableTableAdminStubSettings stub)
      throws IOException {
    return new BaseBigtableTableAdminSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return BigtableTableAdminStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return BigtableTableAdminStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return BigtableTableAdminStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return BigtableTableAdminStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return BigtableTableAdminStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return BigtableTableAdminStubSettings.defaultTransportChannelProvider();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return BigtableTableAdminStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected BaseBigtableTableAdminSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for BaseBigtableTableAdminSettings. */
  public static class Builder
      extends ClientSettings.Builder<BaseBigtableTableAdminSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(BigtableTableAdminStubSettings.newBuilder(clientContext));
    }

    protected Builder(BaseBigtableTableAdminSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(BigtableTableAdminStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(BigtableTableAdminStubSettings.newBuilder());
    }

    public BigtableTableAdminStubSettings.Builder getStubSettingsBuilder() {
      return ((BigtableTableAdminStubSettings.Builder) getStubSettings());
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createTable. */
    public UnaryCallSettings.Builder<CreateTableRequest, Table> createTableSettings() {
      return getStubSettingsBuilder().createTableSettings();
    }

    /** Returns the builder for the settings used for calls to createTableFromSnapshot. */
    public UnaryCallSettings.Builder<CreateTableFromSnapshotRequest, Operation>
        createTableFromSnapshotSettings() {
      return getStubSettingsBuilder().createTableFromSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to createTableFromSnapshot. */
    public OperationCallSettings.Builder<
            CreateTableFromSnapshotRequest, Table, CreateTableFromSnapshotMetadata>
        createTableFromSnapshotOperationSettings() {
      return getStubSettingsBuilder().createTableFromSnapshotOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listTables. */
    public PagedCallSettings.Builder<ListTablesRequest, ListTablesResponse, ListTablesPagedResponse>
        listTablesSettings() {
      return getStubSettingsBuilder().listTablesSettings();
    }

    /** Returns the builder for the settings used for calls to getTable. */
    public UnaryCallSettings.Builder<GetTableRequest, Table> getTableSettings() {
      return getStubSettingsBuilder().getTableSettings();
    }

    /** Returns the builder for the settings used for calls to updateTable. */
    public UnaryCallSettings.Builder<UpdateTableRequest, Operation> updateTableSettings() {
      return getStubSettingsBuilder().updateTableSettings();
    }

    /** Returns the builder for the settings used for calls to updateTable. */
    public OperationCallSettings.Builder<UpdateTableRequest, Table, UpdateTableMetadata>
        updateTableOperationSettings() {
      return getStubSettingsBuilder().updateTableOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteTable. */
    public UnaryCallSettings.Builder<DeleteTableRequest, Empty> deleteTableSettings() {
      return getStubSettingsBuilder().deleteTableSettings();
    }

    /** Returns the builder for the settings used for calls to undeleteTable. */
    public UnaryCallSettings.Builder<UndeleteTableRequest, Operation> undeleteTableSettings() {
      return getStubSettingsBuilder().undeleteTableSettings();
    }

    /** Returns the builder for the settings used for calls to undeleteTable. */
    public OperationCallSettings.Builder<UndeleteTableRequest, Table, UndeleteTableMetadata>
        undeleteTableOperationSettings() {
      return getStubSettingsBuilder().undeleteTableOperationSettings();
    }

    /** Returns the builder for the settings used for calls to createAuthorizedView. */
    public UnaryCallSettings.Builder<CreateAuthorizedViewRequest, Operation>
        createAuthorizedViewSettings() {
      return getStubSettingsBuilder().createAuthorizedViewSettings();
    }

    /** Returns the builder for the settings used for calls to createAuthorizedView. */
    public OperationCallSettings.Builder<
            CreateAuthorizedViewRequest, AuthorizedView, CreateAuthorizedViewMetadata>
        createAuthorizedViewOperationSettings() {
      return getStubSettingsBuilder().createAuthorizedViewOperationSettings();
    }

    /** Returns the builder for the settings used for calls to listAuthorizedViews. */
    public PagedCallSettings.Builder<
            ListAuthorizedViewsRequest,
            ListAuthorizedViewsResponse,
            ListAuthorizedViewsPagedResponse>
        listAuthorizedViewsSettings() {
      return getStubSettingsBuilder().listAuthorizedViewsSettings();
    }

    /** Returns the builder for the settings used for calls to getAuthorizedView. */
    public UnaryCallSettings.Builder<GetAuthorizedViewRequest, AuthorizedView>
        getAuthorizedViewSettings() {
      return getStubSettingsBuilder().getAuthorizedViewSettings();
    }

    /** Returns the builder for the settings used for calls to updateAuthorizedView. */
    public UnaryCallSettings.Builder<UpdateAuthorizedViewRequest, Operation>
        updateAuthorizedViewSettings() {
      return getStubSettingsBuilder().updateAuthorizedViewSettings();
    }

    /** Returns the builder for the settings used for calls to updateAuthorizedView. */
    public OperationCallSettings.Builder<
            UpdateAuthorizedViewRequest, AuthorizedView, UpdateAuthorizedViewMetadata>
        updateAuthorizedViewOperationSettings() {
      return getStubSettingsBuilder().updateAuthorizedViewOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteAuthorizedView. */
    public UnaryCallSettings.Builder<DeleteAuthorizedViewRequest, Empty>
        deleteAuthorizedViewSettings() {
      return getStubSettingsBuilder().deleteAuthorizedViewSettings();
    }

    /** Returns the builder for the settings used for calls to modifyColumnFamilies. */
    public UnaryCallSettings.Builder<ModifyColumnFamiliesRequest, Table>
        modifyColumnFamiliesSettings() {
      return getStubSettingsBuilder().modifyColumnFamiliesSettings();
    }

    /** Returns the builder for the settings used for calls to dropRowRange. */
    public UnaryCallSettings.Builder<DropRowRangeRequest, Empty> dropRowRangeSettings() {
      return getStubSettingsBuilder().dropRowRangeSettings();
    }

    /** Returns the builder for the settings used for calls to generateConsistencyToken. */
    public UnaryCallSettings.Builder<
            GenerateConsistencyTokenRequest, GenerateConsistencyTokenResponse>
        generateConsistencyTokenSettings() {
      return getStubSettingsBuilder().generateConsistencyTokenSettings();
    }

    /** Returns the builder for the settings used for calls to checkConsistency. */
    public UnaryCallSettings.Builder<CheckConsistencyRequest, CheckConsistencyResponse>
        checkConsistencySettings() {
      return getStubSettingsBuilder().checkConsistencySettings();
    }

    /** Returns the builder for the settings used for calls to snapshotTable. */
    public UnaryCallSettings.Builder<SnapshotTableRequest, Operation> snapshotTableSettings() {
      return getStubSettingsBuilder().snapshotTableSettings();
    }

    /** Returns the builder for the settings used for calls to snapshotTable. */
    public OperationCallSettings.Builder<SnapshotTableRequest, Snapshot, SnapshotTableMetadata>
        snapshotTableOperationSettings() {
      return getStubSettingsBuilder().snapshotTableOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getSnapshot. */
    public UnaryCallSettings.Builder<GetSnapshotRequest, Snapshot> getSnapshotSettings() {
      return getStubSettingsBuilder().getSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to listSnapshots. */
    public PagedCallSettings.Builder<
            ListSnapshotsRequest, ListSnapshotsResponse, ListSnapshotsPagedResponse>
        listSnapshotsSettings() {
      return getStubSettingsBuilder().listSnapshotsSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSnapshot. */
    public UnaryCallSettings.Builder<DeleteSnapshotRequest, Empty> deleteSnapshotSettings() {
      return getStubSettingsBuilder().deleteSnapshotSettings();
    }

    /** Returns the builder for the settings used for calls to createBackup. */
    public UnaryCallSettings.Builder<CreateBackupRequest, Operation> createBackupSettings() {
      return getStubSettingsBuilder().createBackupSettings();
    }

    /** Returns the builder for the settings used for calls to createBackup. */
    public OperationCallSettings.Builder<CreateBackupRequest, Backup, CreateBackupMetadata>
        createBackupOperationSettings() {
      return getStubSettingsBuilder().createBackupOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getBackup. */
    public UnaryCallSettings.Builder<GetBackupRequest, Backup> getBackupSettings() {
      return getStubSettingsBuilder().getBackupSettings();
    }

    /** Returns the builder for the settings used for calls to updateBackup. */
    public UnaryCallSettings.Builder<UpdateBackupRequest, Backup> updateBackupSettings() {
      return getStubSettingsBuilder().updateBackupSettings();
    }

    /** Returns the builder for the settings used for calls to deleteBackup. */
    public UnaryCallSettings.Builder<DeleteBackupRequest, Empty> deleteBackupSettings() {
      return getStubSettingsBuilder().deleteBackupSettings();
    }

    /** Returns the builder for the settings used for calls to listBackups. */
    public PagedCallSettings.Builder<
            ListBackupsRequest, ListBackupsResponse, ListBackupsPagedResponse>
        listBackupsSettings() {
      return getStubSettingsBuilder().listBackupsSettings();
    }

    /** Returns the builder for the settings used for calls to restoreTable. */
    public UnaryCallSettings.Builder<RestoreTableRequest, Operation> restoreTableSettings() {
      return getStubSettingsBuilder().restoreTableSettings();
    }

    /** Returns the builder for the settings used for calls to restoreTable. */
    public OperationCallSettings.Builder<RestoreTableRequest, Table, RestoreTableMetadata>
        restoreTableOperationSettings() {
      return getStubSettingsBuilder().restoreTableOperationSettings();
    }

    /** Returns the builder for the settings used for calls to copyBackup. */
    public UnaryCallSettings.Builder<CopyBackupRequest, Operation> copyBackupSettings() {
      return getStubSettingsBuilder().copyBackupSettings();
    }

    /** Returns the builder for the settings used for calls to copyBackup. */
    public OperationCallSettings.Builder<CopyBackupRequest, Backup, CopyBackupMetadata>
        copyBackupOperationSettings() {
      return getStubSettingsBuilder().copyBackupOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getIamPolicy. */
    public UnaryCallSettings.Builder<GetIamPolicyRequest, Policy> getIamPolicySettings() {
      return getStubSettingsBuilder().getIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to setIamPolicy. */
    public UnaryCallSettings.Builder<SetIamPolicyRequest, Policy> setIamPolicySettings() {
      return getStubSettingsBuilder().setIamPolicySettings();
    }

    /** Returns the builder for the settings used for calls to testIamPermissions. */
    public UnaryCallSettings.Builder<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsSettings() {
      return getStubSettingsBuilder().testIamPermissionsSettings();
    }

    /** Returns the builder for the settings used for calls to createSchemaBundle. */
    public UnaryCallSettings.Builder<CreateSchemaBundleRequest, Operation>
        createSchemaBundleSettings() {
      return getStubSettingsBuilder().createSchemaBundleSettings();
    }

    /** Returns the builder for the settings used for calls to createSchemaBundle. */
    public OperationCallSettings.Builder<
            CreateSchemaBundleRequest, SchemaBundle, CreateSchemaBundleMetadata>
        createSchemaBundleOperationSettings() {
      return getStubSettingsBuilder().createSchemaBundleOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateSchemaBundle. */
    public UnaryCallSettings.Builder<UpdateSchemaBundleRequest, Operation>
        updateSchemaBundleSettings() {
      return getStubSettingsBuilder().updateSchemaBundleSettings();
    }

    /** Returns the builder for the settings used for calls to updateSchemaBundle. */
    public OperationCallSettings.Builder<
            UpdateSchemaBundleRequest, SchemaBundle, UpdateSchemaBundleMetadata>
        updateSchemaBundleOperationSettings() {
      return getStubSettingsBuilder().updateSchemaBundleOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getSchemaBundle. */
    public UnaryCallSettings.Builder<GetSchemaBundleRequest, SchemaBundle>
        getSchemaBundleSettings() {
      return getStubSettingsBuilder().getSchemaBundleSettings();
    }

    /** Returns the builder for the settings used for calls to listSchemaBundles. */
    public PagedCallSettings.Builder<
            ListSchemaBundlesRequest, ListSchemaBundlesResponse, ListSchemaBundlesPagedResponse>
        listSchemaBundlesSettings() {
      return getStubSettingsBuilder().listSchemaBundlesSettings();
    }

    /** Returns the builder for the settings used for calls to deleteSchemaBundle. */
    public UnaryCallSettings.Builder<DeleteSchemaBundleRequest, Empty>
        deleteSchemaBundleSettings() {
      return getStubSettingsBuilder().deleteSchemaBundleSettings();
    }

    @Override
    public BaseBigtableTableAdminSettings build() throws IOException {
      return new BaseBigtableTableAdminSettings(this);
    }
  }
}
