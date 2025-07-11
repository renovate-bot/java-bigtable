/*
 * Copyright 2025 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

// Protobuf Java Version: 3.25.8
package com.google.bigtable.admin.v2;

public final class TableProto {
  private TableProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_RestoreInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_RestoreInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_ChangeStreamConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ChangeStreamConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_ClusterState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ClusterState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_AutomatedBackupPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_AutomatedBackupPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AuthorizedView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AuthorizedView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AuthorizedView_FamilySubsets_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AuthorizedView_FamilySubsets_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_FamilySubsetsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_FamilySubsetsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_GcRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_Intersection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_GcRule_Union_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_EncryptionInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_EncryptionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Snapshot_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Snapshot_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_Backup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_Backup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_BackupInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_BackupInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_ProtoSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_ProtoSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_bigtable_admin_v2_SchemaBundle_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_bigtable_admin_v2_SchemaBundle_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "$google/bigtable/admin/v2/table.proto\022\030"
          + "google.bigtable.admin.v2\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032$google/bigtable/admin/v2/types.pro"
          + "to\032\036google/protobuf/duration.proto\032\037goog"
          + "le/protobuf/timestamp.proto\032\027google/rpc/status.proto\"\233\001\n"
          + "\013RestoreInfo\022@\n"
          + "\013source_type\030\001 \001(\0162+.google.bigtable.admin.v2.RestoreSourceType\022;\n"
          + "\013backup_info\030\002 \001(\0132$.google.bigtable.admin.v2.BackupInfoH\000B\r\n"
          + "\013source_info\"I\n"
          + "\022ChangeStreamConfig\0223\n"
          + "\020retention_period\030\001 \001(\0132\031.google.protobuf.Duration\"\225\014\n"
          + "\005Table\022\014\n"
          + "\004name\030\001 \001(\t\022O\n"
          + "\016cluster_states\030\002"
          + " \003(\01322.google.bigtable.admin.v2.Table.ClusterStatesEntryB\003\340A\003\022L\n"
          + "\017column_families\030\003"
          + " \003(\01323.google.bigtable.admin.v2.Table.ColumnFamiliesEntry\022N\n"
          + "\013granularity\030\004"
          + " \001(\01624.google.bigtable.admin.v2.Table.TimestampGranularityB\003\340A\005\022@\n"
          + "\014restore_info\030\006"
          + " \001(\0132%.google.bigtable.admin.v2.RestoreInfoB\003\340A\003\022J\n"
          + "\024change_stream_config\030\010"
          + " \001(\0132,.google.bigtable.admin.v2.ChangeStreamConfig\022\033\n"
          + "\023deletion_protection\030\t \001(\010\022X\n"
          + "\027automated_backup_policy\030\r"
          + " \001(\01325.google.bigtable.admin.v2.Table.AutomatedBackupPolicyH\000\022=\n"
          + "\016row_key_schema\030\017"
          + " \001(\0132%.google.bigtable.admin.v2.Type.Struct\032\306\002\n"
          + "\014ClusterState\022]\n"
          + "\021replication_state\030\001 \001(\0162=.g"
          + "oogle.bigtable.admin.v2.Table.ClusterState.ReplicationStateB\003\340A\003\022F\n"
          + "\017encryption_info\030\002"
          + " \003(\0132(.google.bigtable.admin.v2.EncryptionInfoB\003\340A\003\"\216\001\n"
          + "\020ReplicationState\022\023\n"
          + "\017STATE_NOT_KNOWN\020\000\022\020\n"
          + "\014INITIALIZING\020\001\022\027\n"
          + "\023PLANNED_MAINTENANCE\020\002\022\031\n"
          + "\025UNPLANNED_MAINTENANCE\020\003\022\t\n"
          + "\005READY\020\004\022\024\n"
          + "\020READY_OPTIMIZING\020\005\032\204\001\n"
          + "\025AutomatedBackupPolicy\0228\n"
          + "\020retention_period\030\001"
          + " \001(\0132\031.google.protobuf.DurationB\003\340A\002\0221\n"
          + "\tfrequency\030\002 \001(\0132\031.google.protobuf.DurationB\003\340A\002\032b\n"
          + "\022ClusterStatesEntry\022\013\n"
          + "\003key\030\001 \001(\t\022;\n"
          + "\005value\030\002"
          + " \001(\0132,.google.bigtable.admin.v2.Table.ClusterState:\0028\001\032]\n"
          + "\023ColumnFamiliesEntry\022\013\n"
          + "\003key\030\001 \001(\t\0225\n"
          + "\005value\030\002 \001(\0132&.google.bigtable.admin.v2.ColumnFamily:\0028\001\"I\n"
          + "\024TimestampGranularity\022%\n"
          + "!TIMESTAMP_GRANULARITY_UNSPECIFIED\020\000\022\n\n"
          + "\006MILLIS\020\001\"q\n"
          + "\004View\022\024\n"
          + "\020VIEW_UNSPECIFIED\020\000\022\r\n"
          + "\tNAME_ONLY\020\001\022\017\n"
          + "\013SCHEMA_VIEW\020\002\022\024\n"
          + "\020REPLICATION_VIEW\020\003\022\023\n"
          + "\017ENCRYPTION_VIEW\020\005\022\010\n"
          + "\004FULL\020\004:_\352A\\\n"
          + "\"bigtableadmin.googleapis.com/Tab"
          + "le\0226projects/{project}/instances/{instance}/tables/{table}B\031\n"
          + "\027automated_backup_config\"\343\005\n"
          + "\016AuthorizedView\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022J\n"
          + "\013subset_view\030\002 \001(\01323.google.bigtab"
          + "le.admin.v2.AuthorizedView.SubsetViewH\000\022\014\n"
          + "\004etag\030\003 \001(\t\022\033\n"
          + "\023deletion_protection\030\004 \001(\010\032?\n\r"
          + "FamilySubsets\022\022\n\n"
          + "qualifiers\030\001 \003(\014\022\032\n"
          + "\022qualifier_prefixes\030\002 \003(\014\032\360\001\n\n"
          + "SubsetView\022\024\n"
          + "\014row_prefixes\030\001 \003(\014\022^\n"
          + "\016family_subsets\030\002 \003(\0132F.google.bigtable.admin.v2.Auth"
          + "orizedView.SubsetView.FamilySubsetsEntry\032l\n"
          + "\022FamilySubsetsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022E\n"
          + "\005value\030\002"
          + " \001(\01326.google.bigtable.admin.v2.AuthorizedView.FamilySubsets:\0028\001\"Q\n"
          + "\014ResponseView\022\035\n"
          + "\031RESPONSE_VIEW_UNSPECIFIED\020\000\022\r\n"
          + "\tNAME_ONLY\020\001\022\t\n"
          + "\005BASIC\020\002\022\010\n"
          + "\004FULL\020\003:\254\001\352A\250\001\n"
          + "+bigtableadmin.googleapis.com/AuthorizedView\022Xprojects/{project}/instances/{ins"
          + "tance}/tables/{table}/authorizedViews/{a"
          + "uthorized_view}*\017authorizedViews2\016authorizedViewB\021\n"
          + "\017authorized_view\"u\n"
          + "\014ColumnFamily\0221\n"
          + "\007gc_rule\030\001 \001(\0132 .google.bigtable.admin.v2.GcRule\0222\n\n"
          + "value_type\030\003 \001(\0132\036.google.bigtable.admin.v2.Type\"\325\002\n"
          + "\006GcRule\022\032\n"
          + "\020max_num_versions\030\001 \001(\005H\000\022,\n"
          + "\007max_age\030\002 \001(\0132\031.google.protobuf.DurationH\000\022E\n"
          + "\014intersection\030\003"
          + " \001(\0132-.google.bigtable.admin.v2.GcRule.IntersectionH\000\0227\n"
          + "\005union\030\004 \001(\0132&.google.bigtable.admin.v2.GcRule.UnionH\000\032?\n"
          + "\014Intersection\022/\n"
          + "\005rules\030\001 \003(\0132 .google.bigtable.admin.v2.GcRule\0328\n"
          + "\005Union\022/\n"
          + "\005rules\030\001 \003(\0132 .google.bigtable.admin.v2.GcRuleB\006\n"
          + "\004rule\"\331\002\n"
          + "\016EncryptionInfo\022U\n"
          + "\017encryption_type\030\003"
          + " \001(\01627.google.bigtable.admin.v2.EncryptionInfo.EncryptionTypeB\003\340A\003\0222\n"
          + "\021encryption_status\030\004 \001(\0132\022.google.rpc.StatusB\003\340A\003\022I\n"
          + "\017kms_key_version\030\002 \001(\tB0\340A\003\372A*\n"
          + "(cloudkms.googleapis.com/CryptoKeyVersion\"q\n"
          + "\016EncryptionType\022\037\n"
          + "\033ENCRYPTION_TYPE_UNSPECIFIED\020\000\022\035\n"
          + "\031GOOGLE_DEFAULT_ENCRYPTION\020\001\022\037\n"
          + "\033CUSTOMER_MANAGED_ENCRYPTION\020\002\"\340\003\n"
          + "\010Snapshot\022\014\n"
          + "\004name\030\001 \001(\t\022:\n"
          + "\014source_table\030\002"
          + " \001(\0132\037.google.bigtable.admin.v2.TableB\003\340A\003\022\034\n"
          + "\017data_size_bytes\030\003 \001(\003B\003\340A\003\0224\n"
          + "\013create_time\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022/\n"
          + "\013delete_time\030\005 \001(\0132\032.google.protobuf.Timestamp\022<\n"
          + "\005state\030\006 \001(\0162(.goog"
          + "le.bigtable.admin.v2.Snapshot.StateB\003\340A\003\022\023\n"
          + "\013description\030\007 \001(\t\"5\n"
          + "\005State\022\023\n"
          + "\017STATE_NOT_KNOWN\020\000\022\t\n"
          + "\005READY\020\001\022\014\n"
          + "\010CREATING\020\002:{\352Ax\n"
          + "%bigtableadmin.googleapis.com/Snapshot\022Oprojects/{project}/instances/{instance"
          + "}/clusters/{cluster}/snapshots/{snapshot}\"\371\005\n"
          + "\006Backup\022\014\n"
          + "\004name\030\001 \001(\t\022\034\n"
          + "\014source_table\030\002 \001(\tB\006\340A\005\340A\002\022\032\n\r"
          + "source_backup\030\n"
          + " \001(\tB\003\340A\003\0224\n"
          + "\013expire_time\030\003"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\002\0223\n\n"
          + "start_time\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\005"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\027\n\n"
          + "size_bytes\030\006 \001(\003B\003\340A\003\022:\n"
          + "\005state\030\007 \001"
          + "(\0162&.google.bigtable.admin.v2.Backup.StateB\003\340A\003\022F\n"
          + "\017encryption_info\030\t \001(\0132(.googl"
          + "e.bigtable.admin.v2.EncryptionInfoB\003\340A\003\022@\n"
          + "\013backup_type\030\013 \001(\0162+.google.bigtable.admin.v2.Backup.BackupType\0228\n"
          + "\024hot_to_standard_time\030\014 \001(\0132\032.google.protobuf.Timestamp\"7\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\t\n"
          + "\005READY\020\002\"@\n\n"
          + "BackupType\022\033\n"
          + "\027BACKUP_TYPE_UNSPECIFIED\020\000\022\014\n"
          + "\010STANDARD\020\001\022\007\n"
          + "\003HOT\020\002:u\352Ar\n"
          + "#bigtableadmin.googleapis.com/Backup\022Kprojects/{project}/instances/{"
          + "instance}/clusters/{cluster}/backups/{backup}\"\300\001\n\n"
          + "BackupInfo\022\023\n"
          + "\006backup\030\001 \001(\tB\003\340A\003\0223\n\n"
          + "start_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\031\n"
          + "\014source_table\030\004 \001(\tB\003\340A\003\022\032\n\r"
          + "source_backup\030\n"
          + " \001(\tB\003\340A\003\"-\n"
          + "\013ProtoSchema\022\036\n"
          + "\021proto_descriptors\030\002 \001(\014B\003\340A\002\"\240\002\n"
          + "\014SchemaBundle\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022=\n"
          + "\014proto_schema\030\002"
          + " \001(\0132%.google.bigtable.admin.v2.ProtoSchemaH\000\022\021\n"
          + "\004etag\030\003 \001(\tB\003\340A\001:\242\001\352A\236\001\n"
          + ")bigtableadmin.googleapis.com/SchemaBundle\022Tprojects/{project}/inst"
          + "ances/{instance}/tables/{table}/schemaBundles/{schema_bundle}*\r"
          + "schemaBundles2\014schemaBundleB\006\n"
          + "\004type*D\n"
          + "\021RestoreSourceType\022#\n"
          + "\037RESTORE_SOURCE_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006BACKUP\020\001B\367\002\n"
          + "\034com.google.bigtable.admin.v2B\n"
          + "TableProtoP\001Z8cloud.google.com/go/big"
          + "table/admin/apiv2/adminpb;adminpb\252\002\036Goog"
          + "le.Cloud.Bigtable.Admin.V2\312\002\036Google\\Clou"
          + "d\\Bigtable\\Admin\\V2\352\002\"Google::Cloud::Bigtable::Admin::V2\352A\246\001\n"
          + "(cloudkms.googleapis.com/CryptoKeyVersion\022zprojects/{projec"
          + "t}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/cryptoKeyVer"
          + "sions/{crypto_key_version}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.bigtable.admin.v2.TypesProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_bigtable_admin_v2_RestoreInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_v2_RestoreInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_RestoreInfo_descriptor,
            new java.lang.String[] {
              "SourceType", "BackupInfo", "SourceInfo",
            });
    internal_static_google_bigtable_admin_v2_ChangeStreamConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_v2_ChangeStreamConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_ChangeStreamConfig_descriptor,
            new java.lang.String[] {
              "RetentionPeriod",
            });
    internal_static_google_bigtable_admin_v2_Table_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_v2_Table_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_descriptor,
            new java.lang.String[] {
              "Name",
              "ClusterStates",
              "ColumnFamilies",
              "Granularity",
              "RestoreInfo",
              "ChangeStreamConfig",
              "DeletionProtection",
              "AutomatedBackupPolicy",
              "RowKeySchema",
              "AutomatedBackupConfig",
            });
    internal_static_google_bigtable_admin_v2_Table_ClusterState_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_Table_ClusterState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_ClusterState_descriptor,
            new java.lang.String[] {
              "ReplicationState", "EncryptionInfo",
            });
    internal_static_google_bigtable_admin_v2_Table_AutomatedBackupPolicy_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_Table_AutomatedBackupPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_AutomatedBackupPolicy_descriptor,
            new java.lang.String[] {
              "RetentionPeriod", "Frequency",
            });
    internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(2);
    internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_ClusterStatesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor =
        internal_static_google_bigtable_admin_v2_Table_descriptor.getNestedTypes().get(3);
    internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Table_ColumnFamiliesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_AuthorizedView_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_admin_v2_AuthorizedView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AuthorizedView_descriptor,
            new java.lang.String[] {
              "Name", "SubsetView", "Etag", "DeletionProtection", "AuthorizedView",
            });
    internal_static_google_bigtable_admin_v2_AuthorizedView_FamilySubsets_descriptor =
        internal_static_google_bigtable_admin_v2_AuthorizedView_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_AuthorizedView_FamilySubsets_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AuthorizedView_FamilySubsets_descriptor,
            new java.lang.String[] {
              "Qualifiers", "QualifierPrefixes",
            });
    internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_descriptor =
        internal_static_google_bigtable_admin_v2_AuthorizedView_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_descriptor,
            new java.lang.String[] {
              "RowPrefixes", "FamilySubsets",
            });
    internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_FamilySubsetsEntry_descriptor =
        internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_FamilySubsetsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_AuthorizedView_SubsetView_FamilySubsetsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_bigtable_admin_v2_ColumnFamily_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_ColumnFamily_descriptor,
            new java.lang.String[] {
              "GcRule", "ValueType",
            });
    internal_static_google_bigtable_admin_v2_GcRule_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_bigtable_admin_v2_GcRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_GcRule_descriptor,
            new java.lang.String[] {
              "MaxNumVersions", "MaxAge", "Intersection", "Union", "Rule",
            });
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor =
        internal_static_google_bigtable_admin_v2_GcRule_descriptor.getNestedTypes().get(0);
    internal_static_google_bigtable_admin_v2_GcRule_Intersection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_GcRule_Intersection_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor =
        internal_static_google_bigtable_admin_v2_GcRule_descriptor.getNestedTypes().get(1);
    internal_static_google_bigtable_admin_v2_GcRule_Union_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_GcRule_Union_descriptor,
            new java.lang.String[] {
              "Rules",
            });
    internal_static_google_bigtable_admin_v2_EncryptionInfo_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_bigtable_admin_v2_EncryptionInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_EncryptionInfo_descriptor,
            new java.lang.String[] {
              "EncryptionType", "EncryptionStatus", "KmsKeyVersion",
            });
    internal_static_google_bigtable_admin_v2_Snapshot_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_bigtable_admin_v2_Snapshot_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Snapshot_descriptor,
            new java.lang.String[] {
              "Name",
              "SourceTable",
              "DataSizeBytes",
              "CreateTime",
              "DeleteTime",
              "State",
              "Description",
            });
    internal_static_google_bigtable_admin_v2_Backup_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_bigtable_admin_v2_Backup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_Backup_descriptor,
            new java.lang.String[] {
              "Name",
              "SourceTable",
              "SourceBackup",
              "ExpireTime",
              "StartTime",
              "EndTime",
              "SizeBytes",
              "State",
              "EncryptionInfo",
              "BackupType",
              "HotToStandardTime",
            });
    internal_static_google_bigtable_admin_v2_BackupInfo_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_bigtable_admin_v2_BackupInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_BackupInfo_descriptor,
            new java.lang.String[] {
              "Backup", "StartTime", "EndTime", "SourceTable", "SourceBackup",
            });
    internal_static_google_bigtable_admin_v2_ProtoSchema_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_bigtable_admin_v2_ProtoSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_ProtoSchema_descriptor,
            new java.lang.String[] {
              "ProtoDescriptors",
            });
    internal_static_google_bigtable_admin_v2_SchemaBundle_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_bigtable_admin_v2_SchemaBundle_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_bigtable_admin_v2_SchemaBundle_descriptor,
            new java.lang.String[] {
              "Name", "ProtoSchema", "Etag", "Type",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.bigtable.admin.v2.TypesProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
