/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: registry-for-prod.proto

package io.holoinsight.server.registry.grpc.prod;

/**
 * Protobuf type
 * {@code io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse}
 */
public final class CheckConfigTaskDistributionResponse
    extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse)
    CheckConfigTaskDistributionResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CheckConfigTaskDistributionResponse.newBuilder() to construct.
  private CheckConfigTaskDistributionResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CheckConfigTaskDistributionResponse() {
    status_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CheckConfigTaskDistributionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CheckConfigTaskDistributionResponse(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            io.holoinsight.server.common.grpc.CommonResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(
                io.holoinsight.server.common.grpc.CommonResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              status_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            status_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              status_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              status_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        status_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_CheckConfigTaskDistributionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_CheckConfigTaskDistributionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse.class,
            io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private io.holoinsight.server.common.grpc.CommonResponseHeader header_;

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  public io.holoinsight.server.common.grpc.CommonResponseHeader getHeader() {
    return header_ == null
        ? io.holoinsight.server.common.grpc.CommonResponseHeader.getDefaultInstance()
        : header_;
  }

  /**
   * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
   */
  public io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList status_;

  /**
   * <code>repeated int32 status = 2;</code>
   */
  public java.util.List<java.lang.Integer> getStatusList() {
    return status_;
  }

  /**
   * <code>repeated int32 status = 2;</code>
   */
  public int getStatusCount() {
    return status_.size();
  }

  /**
   * <code>repeated int32 status = 2;</code>
   */
  public int getStatus(int index) {
    return status_.getInt(index);
  }

  private int statusMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    getSerializedSize();
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (getStatusList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(statusMemoizedSerializedSize);
    }
    for (int i = 0; i < status_.size(); i++) {
      output.writeInt32NoTag(status_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHeader());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < status_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(status_.getInt(i));
      }
      size += dataSize;
      if (!getStatusList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      statusMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse)) {
      return super.equals(obj);
    }
    io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse other =
        (io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse) obj;

    if (hasHeader() != other.hasHeader())
      return false;
    if (hasHeader()) {
      if (!getHeader().equals(other.getHeader()))
        return false;
    }
    if (!getStatusList().equals(other.getStatusList()))
      return false;
    if (!unknownFields.equals(other.unknownFields))
      return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getStatusCount() > 0) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse prototype) {
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
   * Protobuf type
   * {@code io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse)
      io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_CheckConfigTaskDistributionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_CheckConfigTaskDistributionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse.class,
              io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse.Builder.class);
    }

    // Construct using
    // io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {}

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      status_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.registry.grpc.prod.RegistryForProdProtos.internal_static_io_holoinsight_server_registry_grpc_prod_CheckConfigTaskDistributionResponse_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse getDefaultInstanceForType() {
      return io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse build() {
      io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse buildPartial() {
      io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse result =
          new io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        status_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.status_ = status_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse) {
        return mergeFrom(
            (io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse other) {
      if (other == io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse
          .getDefaultInstance())
        return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.status_.isEmpty()) {
        if (status_.isEmpty()) {
          status_ = other.status_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStatusIsMutable();
          status_.addAll(other.status_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse) e
                .getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private io.holoinsight.server.common.grpc.CommonResponseHeader header_;
    private com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.common.grpc.CommonResponseHeader, io.holoinsight.server.common.grpc.CommonResponseHeader.Builder, io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder> headerBuilder_;

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null
            ? io.holoinsight.server.common.grpc.CommonResponseHeader.getDefaultInstance()
            : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder setHeader(io.holoinsight.server.common.grpc.CommonResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        io.holoinsight.server.common.grpc.CommonResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(io.holoinsight.server.common.grpc.CommonResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ = io.holoinsight.server.common.grpc.CommonResponseHeader.newBuilder(header_)
              .mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonResponseHeader.Builder getHeaderBuilder() {

      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    public io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null
            ? io.holoinsight.server.common.grpc.CommonResponseHeader.getDefaultInstance()
            : header_;
      }
    }

    /**
     * <code>.io.holoinsight.server.common.grpc.CommonResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.common.grpc.CommonResponseHeader, io.holoinsight.server.common.grpc.CommonResponseHeader.Builder, io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder> getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<io.holoinsight.server.common.grpc.CommonResponseHeader, io.holoinsight.server.common.grpc.CommonResponseHeader.Builder, io.holoinsight.server.common.grpc.CommonResponseHeaderOrBuilder>(
                getHeader(), getParentForChildren(), isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.Internal.IntList status_ = emptyIntList();

    private void ensureStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        status_ = mutableCopy(status_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public java.util.List<java.lang.Integer> getStatusList() {
      return ((bitField0_ & 0x00000001) != 0) ? java.util.Collections.unmodifiableList(status_)
          : status_;
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public int getStatusCount() {
      return status_.size();
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public int getStatus(int index) {
      return status_.getInt(index);
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public Builder setStatus(int index, int value) {
      ensureStatusIsMutable();
      status_.setInt(index, value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public Builder addStatus(int value) {
      ensureStatusIsMutable();
      status_.addInt(value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public Builder addAllStatus(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureStatusIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, status_);
      onChanged();
      return this;
    }

    /**
     * <code>repeated int32 status = 2;</code>
     */
    public Builder clearStatus() {
      status_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse)
  private static final io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE =
        new io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse();
  }

  public static io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckConfigTaskDistributionResponse> PARSER =
      new com.google.protobuf.AbstractParser<CheckConfigTaskDistributionResponse>() {
        @java.lang.Override
        public CheckConfigTaskDistributionResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CheckConfigTaskDistributionResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CheckConfigTaskDistributionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckConfigTaskDistributionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.registry.grpc.prod.CheckConfigTaskDistributionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
