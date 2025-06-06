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
// source: google/bigtable/v2/bigtable.proto

// Protobuf Java Version: 3.25.8
package com.google.bigtable.v2;

public interface PrepareQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.PrepareQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The unique name of the instance against which the query should be
   * executed.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`
   * </pre>
   *
   * <code>
   * string instance_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The instanceName.
   */
  java.lang.String getInstanceName();

  /**
   *
   *
   * <pre>
   * Required. The unique name of the instance against which the query should be
   * executed.
   * Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;`
   * </pre>
   *
   * <code>
   * string instance_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for instanceName.
   */
  com.google.protobuf.ByteString getInstanceNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. This value specifies routing for preparing the query. Note that
   * this `app_profile_id` is only used for preparing the query. The actual
   * query execution will use the app profile specified in the
   * `ExecuteQueryRequest`. If not specified, the `default` application profile
   * will be used.
   * </pre>
   *
   * <code>string app_profile_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The appProfileId.
   */
  java.lang.String getAppProfileId();

  /**
   *
   *
   * <pre>
   * Optional. This value specifies routing for preparing the query. Note that
   * this `app_profile_id` is only used for preparing the query. The actual
   * query execution will use the app profile specified in the
   * `ExecuteQueryRequest`. If not specified, the `default` application profile
   * will be used.
   * </pre>
   *
   * <code>string app_profile_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for appProfileId.
   */
  com.google.protobuf.ByteString getAppProfileIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();

  /**
   *
   *
   * <pre>
   * Required. The query string.
   * </pre>
   *
   * <code>string query = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Protocol buffer format as described by ProtoSchema and ProtoRows
   * messages.
   * </pre>
   *
   * <code>.google.bigtable.v2.ProtoFormat proto_format = 4;</code>
   *
   * @return Whether the protoFormat field is set.
   */
  boolean hasProtoFormat();

  /**
   *
   *
   * <pre>
   * Protocol buffer format as described by ProtoSchema and ProtoRows
   * messages.
   * </pre>
   *
   * <code>.google.bigtable.v2.ProtoFormat proto_format = 4;</code>
   *
   * @return The protoFormat.
   */
  com.google.bigtable.v2.ProtoFormat getProtoFormat();

  /**
   *
   *
   * <pre>
   * Protocol buffer format as described by ProtoSchema and ProtoRows
   * messages.
   * </pre>
   *
   * <code>.google.bigtable.v2.ProtoFormat proto_format = 4;</code>
   */
  com.google.bigtable.v2.ProtoFormatOrBuilder getProtoFormatOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. `param_types` is a map of parameter identifier strings to their
   * `Type`s.
   *
   * In query string, a parameter placeholder consists of the
   * `&#64;` character followed by the parameter name (for example, `&#64;firstName`) in
   * the query string.
   *
   * For example, if param_types["firstName"] = Bytes then &#64;firstName will be a
   * query parameter of type Bytes. The specific `Value` to be used for the
   * query execution must be sent in `ExecuteQueryRequest` in the `params` map.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.v2.Type&gt; param_types = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getParamTypesCount();

  /**
   *
   *
   * <pre>
   * Required. `param_types` is a map of parameter identifier strings to their
   * `Type`s.
   *
   * In query string, a parameter placeholder consists of the
   * `&#64;` character followed by the parameter name (for example, `&#64;firstName`) in
   * the query string.
   *
   * For example, if param_types["firstName"] = Bytes then &#64;firstName will be a
   * query parameter of type Bytes. The specific `Value` to be used for the
   * query execution must be sent in `ExecuteQueryRequest` in the `params` map.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.v2.Type&gt; param_types = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  boolean containsParamTypes(java.lang.String key);

  /** Use {@link #getParamTypesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.bigtable.v2.Type> getParamTypes();

  /**
   *
   *
   * <pre>
   * Required. `param_types` is a map of parameter identifier strings to their
   * `Type`s.
   *
   * In query string, a parameter placeholder consists of the
   * `&#64;` character followed by the parameter name (for example, `&#64;firstName`) in
   * the query string.
   *
   * For example, if param_types["firstName"] = Bytes then &#64;firstName will be a
   * query parameter of type Bytes. The specific `Value` to be used for the
   * query execution must be sent in `ExecuteQueryRequest` in the `params` map.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.v2.Type&gt; param_types = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.bigtable.v2.Type> getParamTypesMap();

  /**
   *
   *
   * <pre>
   * Required. `param_types` is a map of parameter identifier strings to their
   * `Type`s.
   *
   * In query string, a parameter placeholder consists of the
   * `&#64;` character followed by the parameter name (for example, `&#64;firstName`) in
   * the query string.
   *
   * For example, if param_types["firstName"] = Bytes then &#64;firstName will be a
   * query parameter of type Bytes. The specific `Value` to be used for the
   * query execution must be sent in `ExecuteQueryRequest` in the `params` map.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.v2.Type&gt; param_types = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  /* nullable */
  com.google.bigtable.v2.Type getParamTypesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.bigtable.v2.Type defaultValue);

  /**
   *
   *
   * <pre>
   * Required. `param_types` is a map of parameter identifier strings to their
   * `Type`s.
   *
   * In query string, a parameter placeholder consists of the
   * `&#64;` character followed by the parameter name (for example, `&#64;firstName`) in
   * the query string.
   *
   * For example, if param_types["firstName"] = Bytes then &#64;firstName will be a
   * query parameter of type Bytes. The specific `Value` to be used for the
   * query execution must be sent in `ExecuteQueryRequest` in the `params` map.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.bigtable.v2.Type&gt; param_types = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.bigtable.v2.Type getParamTypesOrThrow(java.lang.String key);

  com.google.bigtable.v2.PrepareQueryRequest.DataFormatCase getDataFormatCase();
}
