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
// source: google/bigtable/v2/request_stats.proto

// Protobuf Java Version: 3.25.8
package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * RequestLatencyStats provides a measurement of the latency of the request as
 * it interacts with different systems over its lifetime, e.g. how long the
 * request took to execute within a frontend server.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.RequestLatencyStats}
 */
public final class RequestLatencyStats extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.RequestLatencyStats)
    RequestLatencyStatsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RequestLatencyStats.newBuilder() to construct.
  private RequestLatencyStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RequestLatencyStats() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RequestLatencyStats();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.v2.RequestStatsProto
        .internal_static_google_bigtable_v2_RequestLatencyStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.RequestStatsProto
        .internal_static_google_bigtable_v2_RequestLatencyStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.RequestLatencyStats.class,
            com.google.bigtable.v2.RequestLatencyStats.Builder.class);
  }

  private int bitField0_;
  public static final int FRONTEND_SERVER_LATENCY_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration frontendServerLatency_;

  /**
   *
   *
   * <pre>
   * The latency measured by the frontend server handling this request, from
   * when the request was received, to when this value is sent back in the
   * response. For more context on the component that is measuring this latency,
   * see: https://cloud.google.com/bigtable/docs/overview
   *
   * Note: This value may be slightly shorter than the value reported into
   * aggregate latency metrics in Monitoring for this request
   * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
   * needs to be sent in the response before the latency measurement including
   * that transmission is finalized.
   *
   * Note: This value includes the end-to-end latency of contacting nodes in
   * the targeted cluster, e.g. measuring from when the first byte arrives at
   * the frontend server, to when this value is sent back as the last value in
   * the response, including any latency incurred by contacting nodes, waiting
   * for results from nodes, and finally sending results from nodes back to the
   * caller.
   * </pre>
   *
   * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
   *
   * @return Whether the frontendServerLatency field is set.
   */
  @java.lang.Override
  public boolean hasFrontendServerLatency() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The latency measured by the frontend server handling this request, from
   * when the request was received, to when this value is sent back in the
   * response. For more context on the component that is measuring this latency,
   * see: https://cloud.google.com/bigtable/docs/overview
   *
   * Note: This value may be slightly shorter than the value reported into
   * aggregate latency metrics in Monitoring for this request
   * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
   * needs to be sent in the response before the latency measurement including
   * that transmission is finalized.
   *
   * Note: This value includes the end-to-end latency of contacting nodes in
   * the targeted cluster, e.g. measuring from when the first byte arrives at
   * the frontend server, to when this value is sent back as the last value in
   * the response, including any latency incurred by contacting nodes, waiting
   * for results from nodes, and finally sending results from nodes back to the
   * caller.
   * </pre>
   *
   * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
   *
   * @return The frontendServerLatency.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getFrontendServerLatency() {
    return frontendServerLatency_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : frontendServerLatency_;
  }

  /**
   *
   *
   * <pre>
   * The latency measured by the frontend server handling this request, from
   * when the request was received, to when this value is sent back in the
   * response. For more context on the component that is measuring this latency,
   * see: https://cloud.google.com/bigtable/docs/overview
   *
   * Note: This value may be slightly shorter than the value reported into
   * aggregate latency metrics in Monitoring for this request
   * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
   * needs to be sent in the response before the latency measurement including
   * that transmission is finalized.
   *
   * Note: This value includes the end-to-end latency of contacting nodes in
   * the targeted cluster, e.g. measuring from when the first byte arrives at
   * the frontend server, to when this value is sent back as the last value in
   * the response, including any latency incurred by contacting nodes, waiting
   * for results from nodes, and finally sending results from nodes back to the
   * caller.
   * </pre>
   *
   * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getFrontendServerLatencyOrBuilder() {
    return frontendServerLatency_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : frontendServerLatency_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getFrontendServerLatency());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFrontendServerLatency());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.bigtable.v2.RequestLatencyStats)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.RequestLatencyStats other =
        (com.google.bigtable.v2.RequestLatencyStats) obj;

    if (hasFrontendServerLatency() != other.hasFrontendServerLatency()) return false;
    if (hasFrontendServerLatency()) {
      if (!getFrontendServerLatency().equals(other.getFrontendServerLatency())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFrontendServerLatency()) {
      hash = (37 * hash) + FRONTEND_SERVER_LATENCY_FIELD_NUMBER;
      hash = (53 * hash) + getFrontendServerLatency().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.RequestLatencyStats parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.v2.RequestLatencyStats prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * RequestLatencyStats provides a measurement of the latency of the request as
   * it interacts with different systems over its lifetime, e.g. how long the
   * request took to execute within a frontend server.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.RequestLatencyStats}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.RequestLatencyStats)
      com.google.bigtable.v2.RequestLatencyStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.RequestStatsProto
          .internal_static_google_bigtable_v2_RequestLatencyStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.RequestStatsProto
          .internal_static_google_bigtable_v2_RequestLatencyStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.RequestLatencyStats.class,
              com.google.bigtable.v2.RequestLatencyStats.Builder.class);
    }

    // Construct using com.google.bigtable.v2.RequestLatencyStats.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFrontendServerLatencyFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      frontendServerLatency_ = null;
      if (frontendServerLatencyBuilder_ != null) {
        frontendServerLatencyBuilder_.dispose();
        frontendServerLatencyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.RequestStatsProto
          .internal_static_google_bigtable_v2_RequestLatencyStats_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.RequestLatencyStats getDefaultInstanceForType() {
      return com.google.bigtable.v2.RequestLatencyStats.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.RequestLatencyStats build() {
      com.google.bigtable.v2.RequestLatencyStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.RequestLatencyStats buildPartial() {
      com.google.bigtable.v2.RequestLatencyStats result =
          new com.google.bigtable.v2.RequestLatencyStats(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.v2.RequestLatencyStats result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.frontendServerLatency_ =
            frontendServerLatencyBuilder_ == null
                ? frontendServerLatency_
                : frontendServerLatencyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.RequestLatencyStats) {
        return mergeFrom((com.google.bigtable.v2.RequestLatencyStats) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.RequestLatencyStats other) {
      if (other == com.google.bigtable.v2.RequestLatencyStats.getDefaultInstance()) return this;
      if (other.hasFrontendServerLatency()) {
        mergeFrontendServerLatency(other.getFrontendServerLatency());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getFrontendServerLatencyFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Duration frontendServerLatency_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        frontendServerLatencyBuilder_;

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     *
     * @return Whether the frontendServerLatency field is set.
     */
    public boolean hasFrontendServerLatency() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     *
     * @return The frontendServerLatency.
     */
    public com.google.protobuf.Duration getFrontendServerLatency() {
      if (frontendServerLatencyBuilder_ == null) {
        return frontendServerLatency_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : frontendServerLatency_;
      } else {
        return frontendServerLatencyBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    public Builder setFrontendServerLatency(com.google.protobuf.Duration value) {
      if (frontendServerLatencyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        frontendServerLatency_ = value;
      } else {
        frontendServerLatencyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    public Builder setFrontendServerLatency(com.google.protobuf.Duration.Builder builderForValue) {
      if (frontendServerLatencyBuilder_ == null) {
        frontendServerLatency_ = builderForValue.build();
      } else {
        frontendServerLatencyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    public Builder mergeFrontendServerLatency(com.google.protobuf.Duration value) {
      if (frontendServerLatencyBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && frontendServerLatency_ != null
            && frontendServerLatency_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getFrontendServerLatencyBuilder().mergeFrom(value);
        } else {
          frontendServerLatency_ = value;
        }
      } else {
        frontendServerLatencyBuilder_.mergeFrom(value);
      }
      if (frontendServerLatency_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    public Builder clearFrontendServerLatency() {
      bitField0_ = (bitField0_ & ~0x00000001);
      frontendServerLatency_ = null;
      if (frontendServerLatencyBuilder_ != null) {
        frontendServerLatencyBuilder_.dispose();
        frontendServerLatencyBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getFrontendServerLatencyBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFrontendServerLatencyFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getFrontendServerLatencyOrBuilder() {
      if (frontendServerLatencyBuilder_ != null) {
        return frontendServerLatencyBuilder_.getMessageOrBuilder();
      } else {
        return frontendServerLatency_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : frontendServerLatency_;
      }
    }

    /**
     *
     *
     * <pre>
     * The latency measured by the frontend server handling this request, from
     * when the request was received, to when this value is sent back in the
     * response. For more context on the component that is measuring this latency,
     * see: https://cloud.google.com/bigtable/docs/overview
     *
     * Note: This value may be slightly shorter than the value reported into
     * aggregate latency metrics in Monitoring for this request
     * (https://cloud.google.com/bigtable/docs/monitoring-instance) as this value
     * needs to be sent in the response before the latency measurement including
     * that transmission is finalized.
     *
     * Note: This value includes the end-to-end latency of contacting nodes in
     * the targeted cluster, e.g. measuring from when the first byte arrives at
     * the frontend server, to when this value is sent back as the last value in
     * the response, including any latency incurred by contacting nodes, waiting
     * for results from nodes, and finally sending results from nodes back to the
     * caller.
     * </pre>
     *
     * <code>.google.protobuf.Duration frontend_server_latency = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getFrontendServerLatencyFieldBuilder() {
      if (frontendServerLatencyBuilder_ == null) {
        frontendServerLatencyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getFrontendServerLatency(), getParentForChildren(), isClean());
        frontendServerLatency_ = null;
      }
      return frontendServerLatencyBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.RequestLatencyStats)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.RequestLatencyStats)
  private static final com.google.bigtable.v2.RequestLatencyStats DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.RequestLatencyStats();
  }

  public static com.google.bigtable.v2.RequestLatencyStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestLatencyStats> PARSER =
      new com.google.protobuf.AbstractParser<RequestLatencyStats>() {
        @java.lang.Override
        public RequestLatencyStats parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<RequestLatencyStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestLatencyStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.RequestLatencyStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
