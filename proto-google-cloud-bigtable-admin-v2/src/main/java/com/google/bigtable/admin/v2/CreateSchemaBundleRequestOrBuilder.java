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

public interface CreateSchemaBundleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.CreateSchemaBundleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this schema bundle will be created.
   * Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this schema bundle will be created.
   * Values are of the form
   * `projects/{project}/instances/{instance}/tables/{table}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The unique ID to use for the schema bundle, which will become the
   * final component of the schema bundle's resource name.
   * </pre>
   *
   * <code>string schema_bundle_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The schemaBundleId.
   */
  java.lang.String getSchemaBundleId();

  /**
   *
   *
   * <pre>
   * Required. The unique ID to use for the schema bundle, which will become the
   * final component of the schema bundle's resource name.
   * </pre>
   *
   * <code>string schema_bundle_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for schemaBundleId.
   */
  com.google.protobuf.ByteString getSchemaBundleIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The schema bundle to create.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.SchemaBundle schema_bundle = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the schemaBundle field is set.
   */
  boolean hasSchemaBundle();

  /**
   *
   *
   * <pre>
   * Required. The schema bundle to create.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.SchemaBundle schema_bundle = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The schemaBundle.
   */
  com.google.bigtable.admin.v2.SchemaBundle getSchemaBundle();

  /**
   *
   *
   * <pre>
   * Required. The schema bundle to create.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.SchemaBundle schema_bundle = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.bigtable.admin.v2.SchemaBundleOrBuilder getSchemaBundleOrBuilder();
}
