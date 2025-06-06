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

import static com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient.ListAppProfilesPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient.ListHotTabletsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient.ListLogicalViewsPagedResponse;
import static com.google.cloud.bigtable.admin.v2.BaseBigtableInstanceAdminClient.ListMaterializedViewsPagedResponse;

import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.bigtable.admin.v2.AppProfile;
import com.google.bigtable.admin.v2.Cluster;
import com.google.bigtable.admin.v2.CreateAppProfileRequest;
import com.google.bigtable.admin.v2.CreateClusterMetadata;
import com.google.bigtable.admin.v2.CreateClusterRequest;
import com.google.bigtable.admin.v2.CreateInstanceMetadata;
import com.google.bigtable.admin.v2.CreateInstanceRequest;
import com.google.bigtable.admin.v2.CreateLogicalViewMetadata;
import com.google.bigtable.admin.v2.CreateLogicalViewRequest;
import com.google.bigtable.admin.v2.CreateMaterializedViewMetadata;
import com.google.bigtable.admin.v2.CreateMaterializedViewRequest;
import com.google.bigtable.admin.v2.DeleteAppProfileRequest;
import com.google.bigtable.admin.v2.DeleteClusterRequest;
import com.google.bigtable.admin.v2.DeleteInstanceRequest;
import com.google.bigtable.admin.v2.DeleteLogicalViewRequest;
import com.google.bigtable.admin.v2.DeleteMaterializedViewRequest;
import com.google.bigtable.admin.v2.GetAppProfileRequest;
import com.google.bigtable.admin.v2.GetClusterRequest;
import com.google.bigtable.admin.v2.GetInstanceRequest;
import com.google.bigtable.admin.v2.GetLogicalViewRequest;
import com.google.bigtable.admin.v2.GetMaterializedViewRequest;
import com.google.bigtable.admin.v2.Instance;
import com.google.bigtable.admin.v2.ListAppProfilesRequest;
import com.google.bigtable.admin.v2.ListAppProfilesResponse;
import com.google.bigtable.admin.v2.ListClustersRequest;
import com.google.bigtable.admin.v2.ListClustersResponse;
import com.google.bigtable.admin.v2.ListHotTabletsRequest;
import com.google.bigtable.admin.v2.ListHotTabletsResponse;
import com.google.bigtable.admin.v2.ListInstancesRequest;
import com.google.bigtable.admin.v2.ListInstancesResponse;
import com.google.bigtable.admin.v2.ListLogicalViewsRequest;
import com.google.bigtable.admin.v2.ListLogicalViewsResponse;
import com.google.bigtable.admin.v2.ListMaterializedViewsRequest;
import com.google.bigtable.admin.v2.ListMaterializedViewsResponse;
import com.google.bigtable.admin.v2.LogicalView;
import com.google.bigtable.admin.v2.MaterializedView;
import com.google.bigtable.admin.v2.PartialUpdateClusterMetadata;
import com.google.bigtable.admin.v2.PartialUpdateClusterRequest;
import com.google.bigtable.admin.v2.PartialUpdateInstanceRequest;
import com.google.bigtable.admin.v2.UpdateAppProfileMetadata;
import com.google.bigtable.admin.v2.UpdateAppProfileRequest;
import com.google.bigtable.admin.v2.UpdateClusterMetadata;
import com.google.bigtable.admin.v2.UpdateInstanceMetadata;
import com.google.bigtable.admin.v2.UpdateLogicalViewMetadata;
import com.google.bigtable.admin.v2.UpdateLogicalViewRequest;
import com.google.bigtable.admin.v2.UpdateMaterializedViewMetadata;
import com.google.bigtable.admin.v2.UpdateMaterializedViewRequest;
import com.google.iam.v1.GetIamPolicyRequest;
import com.google.iam.v1.Policy;
import com.google.iam.v1.SetIamPolicyRequest;
import com.google.iam.v1.TestIamPermissionsRequest;
import com.google.iam.v1.TestIamPermissionsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** For internal use only. */
@Generated("by gapic-generator")
@InternalApi
public class GrpcBigtableInstanceAdminStub extends BigtableInstanceAdminStub {
  private static final MethodDescriptor<CreateInstanceRequest, Operation>
      createInstanceMethodDescriptor =
          MethodDescriptor.<CreateInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/CreateInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetInstanceRequest, Instance> getInstanceMethodDescriptor =
      MethodDescriptor.<GetInstanceRequest, Instance>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/GetInstance")
          .setRequestMarshaller(ProtoUtils.marshaller(GetInstanceRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Instance.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListInstancesRequest, ListInstancesResponse>
      listInstancesMethodDescriptor =
          MethodDescriptor.<ListInstancesRequest, ListInstancesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/ListInstances")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListInstancesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListInstancesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<Instance, Instance> updateInstanceMethodDescriptor =
      MethodDescriptor.<Instance, Instance>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateInstance")
          .setRequestMarshaller(ProtoUtils.marshaller(Instance.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Instance.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<PartialUpdateInstanceRequest, Operation>
      partialUpdateInstanceMethodDescriptor =
          MethodDescriptor.<PartialUpdateInstanceRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/PartialUpdateInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(PartialUpdateInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteInstanceRequest, Empty>
      deleteInstanceMethodDescriptor =
          MethodDescriptor.<DeleteInstanceRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteInstance")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateClusterRequest, Operation>
      createClusterMethodDescriptor =
          MethodDescriptor.<CreateClusterRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/CreateCluster")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetClusterRequest, Cluster> getClusterMethodDescriptor =
      MethodDescriptor.<GetClusterRequest, Cluster>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/GetCluster")
          .setRequestMarshaller(ProtoUtils.marshaller(GetClusterRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Cluster.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListClustersRequest, ListClustersResponse>
      listClustersMethodDescriptor =
          MethodDescriptor.<ListClustersRequest, ListClustersResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/ListClusters")
              .setRequestMarshaller(ProtoUtils.marshaller(ListClustersRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListClustersResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<Cluster, Operation> updateClusterMethodDescriptor =
      MethodDescriptor.<Cluster, Operation>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateCluster")
          .setRequestMarshaller(ProtoUtils.marshaller(Cluster.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<PartialUpdateClusterRequest, Operation>
      partialUpdateClusterMethodDescriptor =
          MethodDescriptor.<PartialUpdateClusterRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/PartialUpdateCluster")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(PartialUpdateClusterRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteClusterRequest, Empty> deleteClusterMethodDescriptor =
      MethodDescriptor.<DeleteClusterRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteCluster")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteClusterRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateAppProfileRequest, AppProfile>
      createAppProfileMethodDescriptor =
          MethodDescriptor.<CreateAppProfileRequest, AppProfile>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/CreateAppProfile")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateAppProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AppProfile.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetAppProfileRequest, AppProfile>
      getAppProfileMethodDescriptor =
          MethodDescriptor.<GetAppProfileRequest, AppProfile>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/GetAppProfile")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAppProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(AppProfile.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListAppProfilesRequest, ListAppProfilesResponse>
      listAppProfilesMethodDescriptor =
          MethodDescriptor.<ListAppProfilesRequest, ListAppProfilesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/ListAppProfiles")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAppProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAppProfilesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateAppProfileRequest, Operation>
      updateAppProfileMethodDescriptor =
          MethodDescriptor.<UpdateAppProfileRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateAppProfile")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateAppProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteAppProfileRequest, Empty>
      deleteAppProfileMethodDescriptor =
          MethodDescriptor.<DeleteAppProfileRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteAppProfile")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteAppProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetIamPolicyRequest, Policy> getIamPolicyMethodDescriptor =
      MethodDescriptor.<GetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/GetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(GetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<SetIamPolicyRequest, Policy> setIamPolicyMethodDescriptor =
      MethodDescriptor.<SetIamPolicyRequest, Policy>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/SetIamPolicy")
          .setRequestMarshaller(ProtoUtils.marshaller(SetIamPolicyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Policy.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsMethodDescriptor =
          MethodDescriptor.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/TestIamPermissions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(TestIamPermissionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListHotTabletsRequest, ListHotTabletsResponse>
      listHotTabletsMethodDescriptor =
          MethodDescriptor.<ListHotTabletsRequest, ListHotTabletsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/ListHotTablets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListHotTabletsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListHotTabletsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateLogicalViewRequest, Operation>
      createLogicalViewMethodDescriptor =
          MethodDescriptor.<CreateLogicalViewRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/CreateLogicalView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateLogicalViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLogicalViewRequest, LogicalView>
      getLogicalViewMethodDescriptor =
          MethodDescriptor.<GetLogicalViewRequest, LogicalView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/GetLogicalView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetLogicalViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(LogicalView.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListLogicalViewsRequest, ListLogicalViewsResponse>
      listLogicalViewsMethodDescriptor =
          MethodDescriptor.<ListLogicalViewsRequest, ListLogicalViewsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/ListLogicalViews")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLogicalViewsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLogicalViewsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateLogicalViewRequest, Operation>
      updateLogicalViewMethodDescriptor =
          MethodDescriptor.<UpdateLogicalViewRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateLogicalView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateLogicalViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteLogicalViewRequest, Empty>
      deleteLogicalViewMethodDescriptor =
          MethodDescriptor.<DeleteLogicalViewRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteLogicalView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteLogicalViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateMaterializedViewRequest, Operation>
      createMaterializedViewMethodDescriptor =
          MethodDescriptor.<CreateMaterializedViewRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/CreateMaterializedView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateMaterializedViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetMaterializedViewRequest, MaterializedView>
      getMaterializedViewMethodDescriptor =
          MethodDescriptor.<GetMaterializedViewRequest, MaterializedView>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/GetMaterializedView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetMaterializedViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(MaterializedView.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListMaterializedViewsRequest, ListMaterializedViewsResponse>
      listMaterializedViewsMethodDescriptor =
          MethodDescriptor.<ListMaterializedViewsRequest, ListMaterializedViewsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/ListMaterializedViews")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListMaterializedViewsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListMaterializedViewsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateMaterializedViewRequest, Operation>
      updateMaterializedViewMethodDescriptor =
          MethodDescriptor.<UpdateMaterializedViewRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/UpdateMaterializedView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateMaterializedViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteMaterializedViewRequest, Empty>
      deleteMaterializedViewMethodDescriptor =
          MethodDescriptor.<DeleteMaterializedViewRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.bigtable.admin.v2.BigtableInstanceAdmin/DeleteMaterializedView")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteMaterializedViewRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable;
  private final OperationCallable<CreateInstanceRequest, Instance, CreateInstanceMetadata>
      createInstanceOperationCallable;
  private final UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable;
  private final UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable;
  private final UnaryCallable<Instance, Instance> updateInstanceCallable;
  private final UnaryCallable<PartialUpdateInstanceRequest, Operation>
      partialUpdateInstanceCallable;
  private final OperationCallable<PartialUpdateInstanceRequest, Instance, UpdateInstanceMetadata>
      partialUpdateInstanceOperationCallable;
  private final UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable;
  private final UnaryCallable<CreateClusterRequest, Operation> createClusterCallable;
  private final OperationCallable<CreateClusterRequest, Cluster, CreateClusterMetadata>
      createClusterOperationCallable;
  private final UnaryCallable<GetClusterRequest, Cluster> getClusterCallable;
  private final UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable;
  private final UnaryCallable<Cluster, Operation> updateClusterCallable;
  private final OperationCallable<Cluster, Cluster, UpdateClusterMetadata>
      updateClusterOperationCallable;
  private final UnaryCallable<PartialUpdateClusterRequest, Operation> partialUpdateClusterCallable;
  private final OperationCallable<
          PartialUpdateClusterRequest, Cluster, PartialUpdateClusterMetadata>
      partialUpdateClusterOperationCallable;
  private final UnaryCallable<DeleteClusterRequest, Empty> deleteClusterCallable;
  private final UnaryCallable<CreateAppProfileRequest, AppProfile> createAppProfileCallable;
  private final UnaryCallable<GetAppProfileRequest, AppProfile> getAppProfileCallable;
  private final UnaryCallable<ListAppProfilesRequest, ListAppProfilesResponse>
      listAppProfilesCallable;
  private final UnaryCallable<ListAppProfilesRequest, ListAppProfilesPagedResponse>
      listAppProfilesPagedCallable;
  private final UnaryCallable<UpdateAppProfileRequest, Operation> updateAppProfileCallable;
  private final OperationCallable<UpdateAppProfileRequest, AppProfile, UpdateAppProfileMetadata>
      updateAppProfileOperationCallable;
  private final UnaryCallable<DeleteAppProfileRequest, Empty> deleteAppProfileCallable;
  private final UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable;
  private final UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable;
  private final UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable;
  private final UnaryCallable<ListHotTabletsRequest, ListHotTabletsResponse> listHotTabletsCallable;
  private final UnaryCallable<ListHotTabletsRequest, ListHotTabletsPagedResponse>
      listHotTabletsPagedCallable;
  private final UnaryCallable<CreateLogicalViewRequest, Operation> createLogicalViewCallable;
  private final OperationCallable<CreateLogicalViewRequest, LogicalView, CreateLogicalViewMetadata>
      createLogicalViewOperationCallable;
  private final UnaryCallable<GetLogicalViewRequest, LogicalView> getLogicalViewCallable;
  private final UnaryCallable<ListLogicalViewsRequest, ListLogicalViewsResponse>
      listLogicalViewsCallable;
  private final UnaryCallable<ListLogicalViewsRequest, ListLogicalViewsPagedResponse>
      listLogicalViewsPagedCallable;
  private final UnaryCallable<UpdateLogicalViewRequest, Operation> updateLogicalViewCallable;
  private final OperationCallable<UpdateLogicalViewRequest, LogicalView, UpdateLogicalViewMetadata>
      updateLogicalViewOperationCallable;
  private final UnaryCallable<DeleteLogicalViewRequest, Empty> deleteLogicalViewCallable;
  private final UnaryCallable<CreateMaterializedViewRequest, Operation>
      createMaterializedViewCallable;
  private final OperationCallable<
          CreateMaterializedViewRequest, MaterializedView, CreateMaterializedViewMetadata>
      createMaterializedViewOperationCallable;
  private final UnaryCallable<GetMaterializedViewRequest, MaterializedView>
      getMaterializedViewCallable;
  private final UnaryCallable<ListMaterializedViewsRequest, ListMaterializedViewsResponse>
      listMaterializedViewsCallable;
  private final UnaryCallable<ListMaterializedViewsRequest, ListMaterializedViewsPagedResponse>
      listMaterializedViewsPagedCallable;
  private final UnaryCallable<UpdateMaterializedViewRequest, Operation>
      updateMaterializedViewCallable;
  private final OperationCallable<
          UpdateMaterializedViewRequest, MaterializedView, UpdateMaterializedViewMetadata>
      updateMaterializedViewOperationCallable;
  private final UnaryCallable<DeleteMaterializedViewRequest, Empty> deleteMaterializedViewCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcBigtableInstanceAdminStub create(
      BigtableInstanceAdminStubSettings settings) throws IOException {
    return new GrpcBigtableInstanceAdminStub(settings, ClientContext.create(settings));
  }

  public static final GrpcBigtableInstanceAdminStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcBigtableInstanceAdminStub(
        BigtableInstanceAdminStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcBigtableInstanceAdminStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcBigtableInstanceAdminStub(
        BigtableInstanceAdminStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcBigtableInstanceAdminStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBigtableInstanceAdminStub(
      BigtableInstanceAdminStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcBigtableInstanceAdminCallableFactory());
  }

  /**
   * Constructs an instance of GrpcBigtableInstanceAdminStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcBigtableInstanceAdminStub(
      BigtableInstanceAdminStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateInstanceRequest, Operation> createInstanceTransportSettings =
        GrpcCallSettings.<CreateInstanceRequest, Operation>newBuilder()
            .setMethodDescriptor(createInstanceMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetInstanceRequest, Instance> getInstanceTransportSettings =
        GrpcCallSettings.<GetInstanceRequest, Instance>newBuilder()
            .setMethodDescriptor(getInstanceMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListInstancesRequest, ListInstancesResponse> listInstancesTransportSettings =
        GrpcCallSettings.<ListInstancesRequest, ListInstancesResponse>newBuilder()
            .setMethodDescriptor(listInstancesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<Instance, Instance> updateInstanceTransportSettings =
        GrpcCallSettings.<Instance, Instance>newBuilder()
            .setMethodDescriptor(updateInstanceMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<PartialUpdateInstanceRequest, Operation>
        partialUpdateInstanceTransportSettings =
            GrpcCallSettings.<PartialUpdateInstanceRequest, Operation>newBuilder()
                .setMethodDescriptor(partialUpdateInstanceMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("instance.name", String.valueOf(request.getInstance().getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<DeleteInstanceRequest, Empty> deleteInstanceTransportSettings =
        GrpcCallSettings.<DeleteInstanceRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteInstanceMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateClusterRequest, Operation> createClusterTransportSettings =
        GrpcCallSettings.<CreateClusterRequest, Operation>newBuilder()
            .setMethodDescriptor(createClusterMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetClusterRequest, Cluster> getClusterTransportSettings =
        GrpcCallSettings.<GetClusterRequest, Cluster>newBuilder()
            .setMethodDescriptor(getClusterMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListClustersRequest, ListClustersResponse> listClustersTransportSettings =
        GrpcCallSettings.<ListClustersRequest, ListClustersResponse>newBuilder()
            .setMethodDescriptor(listClustersMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<Cluster, Operation> updateClusterTransportSettings =
        GrpcCallSettings.<Cluster, Operation>newBuilder()
            .setMethodDescriptor(updateClusterMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<PartialUpdateClusterRequest, Operation> partialUpdateClusterTransportSettings =
        GrpcCallSettings.<PartialUpdateClusterRequest, Operation>newBuilder()
            .setMethodDescriptor(partialUpdateClusterMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("cluster.name", String.valueOf(request.getCluster().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteClusterRequest, Empty> deleteClusterTransportSettings =
        GrpcCallSettings.<DeleteClusterRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteClusterMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateAppProfileRequest, AppProfile> createAppProfileTransportSettings =
        GrpcCallSettings.<CreateAppProfileRequest, AppProfile>newBuilder()
            .setMethodDescriptor(createAppProfileMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetAppProfileRequest, AppProfile> getAppProfileTransportSettings =
        GrpcCallSettings.<GetAppProfileRequest, AppProfile>newBuilder()
            .setMethodDescriptor(getAppProfileMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListAppProfilesRequest, ListAppProfilesResponse>
        listAppProfilesTransportSettings =
            GrpcCallSettings.<ListAppProfilesRequest, ListAppProfilesResponse>newBuilder()
                .setMethodDescriptor(listAppProfilesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateAppProfileRequest, Operation> updateAppProfileTransportSettings =
        GrpcCallSettings.<UpdateAppProfileRequest, Operation>newBuilder()
            .setMethodDescriptor(updateAppProfileMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add(
                      "app_profile.name", String.valueOf(request.getAppProfile().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteAppProfileRequest, Empty> deleteAppProfileTransportSettings =
        GrpcCallSettings.<DeleteAppProfileRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteAppProfileMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetIamPolicyRequest, Policy> getIamPolicyTransportSettings =
        GrpcCallSettings.<GetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(getIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<SetIamPolicyRequest, Policy> setIamPolicyTransportSettings =
        GrpcCallSettings.<SetIamPolicyRequest, Policy>newBuilder()
            .setMethodDescriptor(setIamPolicyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("resource", String.valueOf(request.getResource()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<TestIamPermissionsRequest, TestIamPermissionsResponse>
        testIamPermissionsTransportSettings =
            GrpcCallSettings.<TestIamPermissionsRequest, TestIamPermissionsResponse>newBuilder()
                .setMethodDescriptor(testIamPermissionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("resource", String.valueOf(request.getResource()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListHotTabletsRequest, ListHotTabletsResponse>
        listHotTabletsTransportSettings =
            GrpcCallSettings.<ListHotTabletsRequest, ListHotTabletsResponse>newBuilder()
                .setMethodDescriptor(listHotTabletsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<CreateLogicalViewRequest, Operation> createLogicalViewTransportSettings =
        GrpcCallSettings.<CreateLogicalViewRequest, Operation>newBuilder()
            .setMethodDescriptor(createLogicalViewMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetLogicalViewRequest, LogicalView> getLogicalViewTransportSettings =
        GrpcCallSettings.<GetLogicalViewRequest, LogicalView>newBuilder()
            .setMethodDescriptor(getLogicalViewMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListLogicalViewsRequest, ListLogicalViewsResponse>
        listLogicalViewsTransportSettings =
            GrpcCallSettings.<ListLogicalViewsRequest, ListLogicalViewsResponse>newBuilder()
                .setMethodDescriptor(listLogicalViewsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateLogicalViewRequest, Operation> updateLogicalViewTransportSettings =
        GrpcCallSettings.<UpdateLogicalViewRequest, Operation>newBuilder()
            .setMethodDescriptor(updateLogicalViewMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add(
                      "logical_view.name", String.valueOf(request.getLogicalView().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<DeleteLogicalViewRequest, Empty> deleteLogicalViewTransportSettings =
        GrpcCallSettings.<DeleteLogicalViewRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteLogicalViewMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateMaterializedViewRequest, Operation>
        createMaterializedViewTransportSettings =
            GrpcCallSettings.<CreateMaterializedViewRequest, Operation>newBuilder()
                .setMethodDescriptor(createMaterializedViewMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GetMaterializedViewRequest, MaterializedView>
        getMaterializedViewTransportSettings =
            GrpcCallSettings.<GetMaterializedViewRequest, MaterializedView>newBuilder()
                .setMethodDescriptor(getMaterializedViewMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListMaterializedViewsRequest, ListMaterializedViewsResponse>
        listMaterializedViewsTransportSettings =
            GrpcCallSettings
                .<ListMaterializedViewsRequest, ListMaterializedViewsResponse>newBuilder()
                .setMethodDescriptor(listMaterializedViewsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateMaterializedViewRequest, Operation>
        updateMaterializedViewTransportSettings =
            GrpcCallSettings.<UpdateMaterializedViewRequest, Operation>newBuilder()
                .setMethodDescriptor(updateMaterializedViewMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "materialized_view.name",
                          String.valueOf(request.getMaterializedView().getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<DeleteMaterializedViewRequest, Empty> deleteMaterializedViewTransportSettings =
        GrpcCallSettings.<DeleteMaterializedViewRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteMaterializedViewMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.createInstanceCallable =
        callableFactory.createUnaryCallable(
            createInstanceTransportSettings, settings.createInstanceSettings(), clientContext);
    this.createInstanceOperationCallable =
        callableFactory.createOperationCallable(
            createInstanceTransportSettings,
            settings.createInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.getInstanceCallable =
        callableFactory.createUnaryCallable(
            getInstanceTransportSettings, settings.getInstanceSettings(), clientContext);
    this.listInstancesCallable =
        callableFactory.createUnaryCallable(
            listInstancesTransportSettings, settings.listInstancesSettings(), clientContext);
    this.updateInstanceCallable =
        callableFactory.createUnaryCallable(
            updateInstanceTransportSettings, settings.updateInstanceSettings(), clientContext);
    this.partialUpdateInstanceCallable =
        callableFactory.createUnaryCallable(
            partialUpdateInstanceTransportSettings,
            settings.partialUpdateInstanceSettings(),
            clientContext);
    this.partialUpdateInstanceOperationCallable =
        callableFactory.createOperationCallable(
            partialUpdateInstanceTransportSettings,
            settings.partialUpdateInstanceOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteInstanceCallable =
        callableFactory.createUnaryCallable(
            deleteInstanceTransportSettings, settings.deleteInstanceSettings(), clientContext);
    this.createClusterCallable =
        callableFactory.createUnaryCallable(
            createClusterTransportSettings, settings.createClusterSettings(), clientContext);
    this.createClusterOperationCallable =
        callableFactory.createOperationCallable(
            createClusterTransportSettings,
            settings.createClusterOperationSettings(),
            clientContext,
            operationsStub);
    this.getClusterCallable =
        callableFactory.createUnaryCallable(
            getClusterTransportSettings, settings.getClusterSettings(), clientContext);
    this.listClustersCallable =
        callableFactory.createUnaryCallable(
            listClustersTransportSettings, settings.listClustersSettings(), clientContext);
    this.updateClusterCallable =
        callableFactory.createUnaryCallable(
            updateClusterTransportSettings, settings.updateClusterSettings(), clientContext);
    this.updateClusterOperationCallable =
        callableFactory.createOperationCallable(
            updateClusterTransportSettings,
            settings.updateClusterOperationSettings(),
            clientContext,
            operationsStub);
    this.partialUpdateClusterCallable =
        callableFactory.createUnaryCallable(
            partialUpdateClusterTransportSettings,
            settings.partialUpdateClusterSettings(),
            clientContext);
    this.partialUpdateClusterOperationCallable =
        callableFactory.createOperationCallable(
            partialUpdateClusterTransportSettings,
            settings.partialUpdateClusterOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteClusterCallable =
        callableFactory.createUnaryCallable(
            deleteClusterTransportSettings, settings.deleteClusterSettings(), clientContext);
    this.createAppProfileCallable =
        callableFactory.createUnaryCallable(
            createAppProfileTransportSettings, settings.createAppProfileSettings(), clientContext);
    this.getAppProfileCallable =
        callableFactory.createUnaryCallable(
            getAppProfileTransportSettings, settings.getAppProfileSettings(), clientContext);
    this.listAppProfilesCallable =
        callableFactory.createUnaryCallable(
            listAppProfilesTransportSettings, settings.listAppProfilesSettings(), clientContext);
    this.listAppProfilesPagedCallable =
        callableFactory.createPagedCallable(
            listAppProfilesTransportSettings, settings.listAppProfilesSettings(), clientContext);
    this.updateAppProfileCallable =
        callableFactory.createUnaryCallable(
            updateAppProfileTransportSettings, settings.updateAppProfileSettings(), clientContext);
    this.updateAppProfileOperationCallable =
        callableFactory.createOperationCallable(
            updateAppProfileTransportSettings,
            settings.updateAppProfileOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteAppProfileCallable =
        callableFactory.createUnaryCallable(
            deleteAppProfileTransportSettings, settings.deleteAppProfileSettings(), clientContext);
    this.getIamPolicyCallable =
        callableFactory.createUnaryCallable(
            getIamPolicyTransportSettings, settings.getIamPolicySettings(), clientContext);
    this.setIamPolicyCallable =
        callableFactory.createUnaryCallable(
            setIamPolicyTransportSettings, settings.setIamPolicySettings(), clientContext);
    this.testIamPermissionsCallable =
        callableFactory.createUnaryCallable(
            testIamPermissionsTransportSettings,
            settings.testIamPermissionsSettings(),
            clientContext);
    this.listHotTabletsCallable =
        callableFactory.createUnaryCallable(
            listHotTabletsTransportSettings, settings.listHotTabletsSettings(), clientContext);
    this.listHotTabletsPagedCallable =
        callableFactory.createPagedCallable(
            listHotTabletsTransportSettings, settings.listHotTabletsSettings(), clientContext);
    this.createLogicalViewCallable =
        callableFactory.createUnaryCallable(
            createLogicalViewTransportSettings,
            settings.createLogicalViewSettings(),
            clientContext);
    this.createLogicalViewOperationCallable =
        callableFactory.createOperationCallable(
            createLogicalViewTransportSettings,
            settings.createLogicalViewOperationSettings(),
            clientContext,
            operationsStub);
    this.getLogicalViewCallable =
        callableFactory.createUnaryCallable(
            getLogicalViewTransportSettings, settings.getLogicalViewSettings(), clientContext);
    this.listLogicalViewsCallable =
        callableFactory.createUnaryCallable(
            listLogicalViewsTransportSettings, settings.listLogicalViewsSettings(), clientContext);
    this.listLogicalViewsPagedCallable =
        callableFactory.createPagedCallable(
            listLogicalViewsTransportSettings, settings.listLogicalViewsSettings(), clientContext);
    this.updateLogicalViewCallable =
        callableFactory.createUnaryCallable(
            updateLogicalViewTransportSettings,
            settings.updateLogicalViewSettings(),
            clientContext);
    this.updateLogicalViewOperationCallable =
        callableFactory.createOperationCallable(
            updateLogicalViewTransportSettings,
            settings.updateLogicalViewOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteLogicalViewCallable =
        callableFactory.createUnaryCallable(
            deleteLogicalViewTransportSettings,
            settings.deleteLogicalViewSettings(),
            clientContext);
    this.createMaterializedViewCallable =
        callableFactory.createUnaryCallable(
            createMaterializedViewTransportSettings,
            settings.createMaterializedViewSettings(),
            clientContext);
    this.createMaterializedViewOperationCallable =
        callableFactory.createOperationCallable(
            createMaterializedViewTransportSettings,
            settings.createMaterializedViewOperationSettings(),
            clientContext,
            operationsStub);
    this.getMaterializedViewCallable =
        callableFactory.createUnaryCallable(
            getMaterializedViewTransportSettings,
            settings.getMaterializedViewSettings(),
            clientContext);
    this.listMaterializedViewsCallable =
        callableFactory.createUnaryCallable(
            listMaterializedViewsTransportSettings,
            settings.listMaterializedViewsSettings(),
            clientContext);
    this.listMaterializedViewsPagedCallable =
        callableFactory.createPagedCallable(
            listMaterializedViewsTransportSettings,
            settings.listMaterializedViewsSettings(),
            clientContext);
    this.updateMaterializedViewCallable =
        callableFactory.createUnaryCallable(
            updateMaterializedViewTransportSettings,
            settings.updateMaterializedViewSettings(),
            clientContext);
    this.updateMaterializedViewOperationCallable =
        callableFactory.createOperationCallable(
            updateMaterializedViewTransportSettings,
            settings.updateMaterializedViewOperationSettings(),
            clientContext,
            operationsStub);
    this.deleteMaterializedViewCallable =
        callableFactory.createUnaryCallable(
            deleteMaterializedViewTransportSettings,
            settings.deleteMaterializedViewSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    return createInstanceCallable;
  }

  @Override
  public OperationCallable<CreateInstanceRequest, Instance, CreateInstanceMetadata>
      createInstanceOperationCallable() {
    return createInstanceOperationCallable;
  }

  @Override
  public UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    return getInstanceCallable;
  }

  @Override
  public UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    return listInstancesCallable;
  }

  @Override
  public UnaryCallable<Instance, Instance> updateInstanceCallable() {
    return updateInstanceCallable;
  }

  @Override
  public UnaryCallable<PartialUpdateInstanceRequest, Operation> partialUpdateInstanceCallable() {
    return partialUpdateInstanceCallable;
  }

  @Override
  public OperationCallable<PartialUpdateInstanceRequest, Instance, UpdateInstanceMetadata>
      partialUpdateInstanceOperationCallable() {
    return partialUpdateInstanceOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteInstanceRequest, Empty> deleteInstanceCallable() {
    return deleteInstanceCallable;
  }

  @Override
  public UnaryCallable<CreateClusterRequest, Operation> createClusterCallable() {
    return createClusterCallable;
  }

  @Override
  public OperationCallable<CreateClusterRequest, Cluster, CreateClusterMetadata>
      createClusterOperationCallable() {
    return createClusterOperationCallable;
  }

  @Override
  public UnaryCallable<GetClusterRequest, Cluster> getClusterCallable() {
    return getClusterCallable;
  }

  @Override
  public UnaryCallable<ListClustersRequest, ListClustersResponse> listClustersCallable() {
    return listClustersCallable;
  }

  @Override
  public UnaryCallable<Cluster, Operation> updateClusterCallable() {
    return updateClusterCallable;
  }

  @Override
  public OperationCallable<Cluster, Cluster, UpdateClusterMetadata>
      updateClusterOperationCallable() {
    return updateClusterOperationCallable;
  }

  @Override
  public UnaryCallable<PartialUpdateClusterRequest, Operation> partialUpdateClusterCallable() {
    return partialUpdateClusterCallable;
  }

  @Override
  public OperationCallable<PartialUpdateClusterRequest, Cluster, PartialUpdateClusterMetadata>
      partialUpdateClusterOperationCallable() {
    return partialUpdateClusterOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteClusterRequest, Empty> deleteClusterCallable() {
    return deleteClusterCallable;
  }

  @Override
  public UnaryCallable<CreateAppProfileRequest, AppProfile> createAppProfileCallable() {
    return createAppProfileCallable;
  }

  @Override
  public UnaryCallable<GetAppProfileRequest, AppProfile> getAppProfileCallable() {
    return getAppProfileCallable;
  }

  @Override
  public UnaryCallable<ListAppProfilesRequest, ListAppProfilesResponse> listAppProfilesCallable() {
    return listAppProfilesCallable;
  }

  @Override
  public UnaryCallable<ListAppProfilesRequest, ListAppProfilesPagedResponse>
      listAppProfilesPagedCallable() {
    return listAppProfilesPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateAppProfileRequest, Operation> updateAppProfileCallable() {
    return updateAppProfileCallable;
  }

  @Override
  public OperationCallable<UpdateAppProfileRequest, AppProfile, UpdateAppProfileMetadata>
      updateAppProfileOperationCallable() {
    return updateAppProfileOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteAppProfileRequest, Empty> deleteAppProfileCallable() {
    return deleteAppProfileCallable;
  }

  @Override
  public UnaryCallable<GetIamPolicyRequest, Policy> getIamPolicyCallable() {
    return getIamPolicyCallable;
  }

  @Override
  public UnaryCallable<SetIamPolicyRequest, Policy> setIamPolicyCallable() {
    return setIamPolicyCallable;
  }

  @Override
  public UnaryCallable<TestIamPermissionsRequest, TestIamPermissionsResponse>
      testIamPermissionsCallable() {
    return testIamPermissionsCallable;
  }

  @Override
  public UnaryCallable<ListHotTabletsRequest, ListHotTabletsResponse> listHotTabletsCallable() {
    return listHotTabletsCallable;
  }

  @Override
  public UnaryCallable<ListHotTabletsRequest, ListHotTabletsPagedResponse>
      listHotTabletsPagedCallable() {
    return listHotTabletsPagedCallable;
  }

  @Override
  public UnaryCallable<CreateLogicalViewRequest, Operation> createLogicalViewCallable() {
    return createLogicalViewCallable;
  }

  @Override
  public OperationCallable<CreateLogicalViewRequest, LogicalView, CreateLogicalViewMetadata>
      createLogicalViewOperationCallable() {
    return createLogicalViewOperationCallable;
  }

  @Override
  public UnaryCallable<GetLogicalViewRequest, LogicalView> getLogicalViewCallable() {
    return getLogicalViewCallable;
  }

  @Override
  public UnaryCallable<ListLogicalViewsRequest, ListLogicalViewsResponse>
      listLogicalViewsCallable() {
    return listLogicalViewsCallable;
  }

  @Override
  public UnaryCallable<ListLogicalViewsRequest, ListLogicalViewsPagedResponse>
      listLogicalViewsPagedCallable() {
    return listLogicalViewsPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateLogicalViewRequest, Operation> updateLogicalViewCallable() {
    return updateLogicalViewCallable;
  }

  @Override
  public OperationCallable<UpdateLogicalViewRequest, LogicalView, UpdateLogicalViewMetadata>
      updateLogicalViewOperationCallable() {
    return updateLogicalViewOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteLogicalViewRequest, Empty> deleteLogicalViewCallable() {
    return deleteLogicalViewCallable;
  }

  @Override
  public UnaryCallable<CreateMaterializedViewRequest, Operation> createMaterializedViewCallable() {
    return createMaterializedViewCallable;
  }

  @Override
  public OperationCallable<
          CreateMaterializedViewRequest, MaterializedView, CreateMaterializedViewMetadata>
      createMaterializedViewOperationCallable() {
    return createMaterializedViewOperationCallable;
  }

  @Override
  public UnaryCallable<GetMaterializedViewRequest, MaterializedView> getMaterializedViewCallable() {
    return getMaterializedViewCallable;
  }

  @Override
  public UnaryCallable<ListMaterializedViewsRequest, ListMaterializedViewsResponse>
      listMaterializedViewsCallable() {
    return listMaterializedViewsCallable;
  }

  @Override
  public UnaryCallable<ListMaterializedViewsRequest, ListMaterializedViewsPagedResponse>
      listMaterializedViewsPagedCallable() {
    return listMaterializedViewsPagedCallable;
  }

  @Override
  public UnaryCallable<UpdateMaterializedViewRequest, Operation> updateMaterializedViewCallable() {
    return updateMaterializedViewCallable;
  }

  @Override
  public OperationCallable<
          UpdateMaterializedViewRequest, MaterializedView, UpdateMaterializedViewMetadata>
      updateMaterializedViewOperationCallable() {
    return updateMaterializedViewOperationCallable;
  }

  @Override
  public UnaryCallable<DeleteMaterializedViewRequest, Empty> deleteMaterializedViewCallable() {
    return deleteMaterializedViewCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
