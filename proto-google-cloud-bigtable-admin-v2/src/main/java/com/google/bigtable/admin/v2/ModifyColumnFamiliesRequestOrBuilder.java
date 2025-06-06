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
// source: google/bigtable/admin/v2/bigtable_table_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.bigtable.admin.v2;

public interface ModifyColumnFamiliesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ModifyColumnFamiliesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique name of the table whose families should be modified.
   * Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The unique name of the table whose families should be modified.
   * Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Modifications to be atomically applied to the specified table's
   * families. Entries are applied in order, meaning that earlier modifications
   * can be masked by later ones (in the case of repeated updates to the same
   * family, for example).
   * </pre>
   *
   * <code>
   * repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification>
      getModificationsList();

  /**
   *
   *
   * <pre>
   * Required. Modifications to be atomically applied to the specified table's
   * families. Entries are applied in order, meaning that earlier modifications
   * can be masked by later ones (in the case of repeated updates to the same
   * family, for example).
   * </pre>
   *
   * <code>
   * repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification getModifications(int index);

  /**
   *
   *
   * <pre>
   * Required. Modifications to be atomically applied to the specified table's
   * families. Entries are applied in order, meaning that earlier modifications
   * can be masked by later ones (in the case of repeated updates to the same
   * family, for example).
   * </pre>
   *
   * <code>
   * repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getModificationsCount();

  /**
   *
   *
   * <pre>
   * Required. Modifications to be atomically applied to the specified table's
   * families. Entries are applied in order, meaning that earlier modifications
   * can be masked by later ones (in the case of repeated updates to the same
   * family, for example).
   * </pre>
   *
   * <code>
   * repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest.ModificationOrBuilder>
      getModificationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Required. Modifications to be atomically applied to the specified table's
   * families. Entries are applied in order, meaning that earlier modifications
   * can be masked by later ones (in the case of repeated updates to the same
   * family, for example).
   * </pre>
   *
   * <code>
   * repeated .google.bigtable.admin.v2.ModifyColumnFamiliesRequest.Modification modifications = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest.ModificationOrBuilder
      getModificationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. If true, ignore safety checks when modifying the column families.
   * </pre>
   *
   * <code>bool ignore_warnings = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ignoreWarnings.
   */
  boolean getIgnoreWarnings();
}
