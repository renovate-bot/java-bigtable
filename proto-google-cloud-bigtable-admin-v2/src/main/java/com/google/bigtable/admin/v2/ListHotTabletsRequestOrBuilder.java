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
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.bigtable.admin.v2;

public interface ListHotTabletsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.ListHotTabletsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The cluster name to list hot tablets.
   * Value is in the following form:
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
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
   * Required. The cluster name to list hot tablets.
   * Value is in the following form:
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
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
   * The start time to list hot tablets. The hot tablets in the response will
   * have start times between the requested start time and end time. Start time
   * defaults to Now if it is unset, and end time defaults to Now - 24 hours if
   * it is unset. The start time should be less than the end time, and the
   * maximum allowed time range between start time and end time is 48 hours.
   * Start time and end time should have values between Now and Now - 14 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The start time to list hot tablets. The hot tablets in the response will
   * have start times between the requested start time and end time. Start time
   * defaults to Now if it is unset, and end time defaults to Now - 24 hours if
   * it is unset. The start time should be less than the end time, and the
   * maximum allowed time range between start time and end time is 48 hours.
   * Start time and end time should have values between Now and Now - 14 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The start time to list hot tablets. The hot tablets in the response will
   * have start times between the requested start time and end time. Start time
   * defaults to Now if it is unset, and end time defaults to Now - 24 hours if
   * it is unset. The start time should be less than the end time, and the
   * maximum allowed time range between start time and end time is 48 hours.
   * Start time and end time should have values between Now and Now - 14 days.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The end time to list hot tablets.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * The end time to list hot tablets.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * The end time to list hot tablets.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of results per page.
   *
   * A page_size that is empty or zero lets the server choose the number of
   * items to return. A page_size which is strictly positive will return at most
   * that many items. A negative page_size will cause an error.
   *
   * Following the first request, subsequent paginated calls do not need a
   * page_size field. If a page_size is set in subsequent calls, it must match
   * the page_size given in the first request.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();

  /**
   *
   *
   * <pre>
   * The value of `next_page_token` returned by a previous call.
   * </pre>
   *
   * <code>string page_token = 5;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
