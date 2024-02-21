/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: common.proto

package io.holoinsight.server.common.grpc;

/**
 * <pre>
 * 模拟 golang 里的 fs.FileInfo
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.common.grpc.FileInfo}
 */
public final class FileInfo extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.common.grpc.FileInfo)
    FileInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FileInfo.newBuilder() to construct.
  private FileInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FileInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FileInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FileInfo(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            size_ = input.readInt64();
            break;
          }
          case 16: {

            modTime_ = input.readInt64();
            break;
          }
          case 24: {

            mode_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_FileInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_FileInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.holoinsight.server.common.grpc.FileInfo.class,
            io.holoinsight.server.common.grpc.FileInfo.Builder.class);
  }

  public static final int SIZE_FIELD_NUMBER = 1;
  private long size_;

  /**
   * <code>int64 size = 1;</code>
   */
  public long getSize() {
    return size_;
  }

  public static final int MOD_TIME_FIELD_NUMBER = 2;
  private long modTime_;

  /**
   * <code>int64 mod_time = 2;</code>
   */
  public long getModTime() {
    return modTime_;
  }

  public static final int MODE_FIELD_NUMBER = 3;
  private int mode_;

  /**
   * <pre>
   * 上层已经有dir了, 这里就不放了
   * bool dir = 3;
   * </pre>
   *
   * <code>int32 mode = 3;</code>
   */
  public int getMode() {
    return mode_;
  }

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
    if (size_ != 0L) {
      output.writeInt64(1, size_);
    }
    if (modTime_ != 0L) {
      output.writeInt64(2, modTime_);
    }
    if (mode_ != 0) {
      output.writeInt32(3, mode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, size_);
    }
    if (modTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, modTime_);
    }
    if (mode_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, mode_);
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
    if (!(obj instanceof io.holoinsight.server.common.grpc.FileInfo)) {
      return super.equals(obj);
    }
    io.holoinsight.server.common.grpc.FileInfo other =
        (io.holoinsight.server.common.grpc.FileInfo) obj;

    if (getSize() != other.getSize())
      return false;
    if (getModTime() != other.getModTime())
      return false;
    if (getMode() != other.getMode())
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
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSize());
    hash = (37 * hash) + MOD_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getModTime());
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + getMode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.common.grpc.FileInfo parseFrom(
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

  public static Builder newBuilder(io.holoinsight.server.common.grpc.FileInfo prototype) {
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
   * <pre>
   * 模拟 golang 里的 fs.FileInfo
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.common.grpc.FileInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.common.grpc.FileInfo)
      io.holoinsight.server.common.grpc.FileInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_FileInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_FileInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.holoinsight.server.common.grpc.FileInfo.class,
              io.holoinsight.server.common.grpc.FileInfo.Builder.class);
    }

    // Construct using io.holoinsight.server.common.grpc.FileInfo.newBuilder()
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
      size_ = 0L;

      modTime_ = 0L;

      mode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.common.grpc.CommonProtos.internal_static_io_holoinsight_server_common_grpc_FileInfo_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.common.grpc.FileInfo getDefaultInstanceForType() {
      return io.holoinsight.server.common.grpc.FileInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.common.grpc.FileInfo build() {
      io.holoinsight.server.common.grpc.FileInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.common.grpc.FileInfo buildPartial() {
      io.holoinsight.server.common.grpc.FileInfo result =
          new io.holoinsight.server.common.grpc.FileInfo(this);
      result.size_ = size_;
      result.modTime_ = modTime_;
      result.mode_ = mode_;
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
      if (other instanceof io.holoinsight.server.common.grpc.FileInfo) {
        return mergeFrom((io.holoinsight.server.common.grpc.FileInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.common.grpc.FileInfo other) {
      if (other == io.holoinsight.server.common.grpc.FileInfo.getDefaultInstance())
        return this;
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (other.getModTime() != 0L) {
        setModTime(other.getModTime());
      }
      if (other.getMode() != 0) {
        setMode(other.getMode());
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
      io.holoinsight.server.common.grpc.FileInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.common.grpc.FileInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long size_;

    /**
     * <code>int64 size = 1;</code>
     */
    public long getSize() {
      return size_;
    }

    /**
     * <code>int64 size = 1;</code>
     */
    public Builder setSize(long value) {

      size_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int64 size = 1;</code>
     */
    public Builder clearSize() {

      size_ = 0L;
      onChanged();
      return this;
    }

    private long modTime_;

    /**
     * <code>int64 mod_time = 2;</code>
     */
    public long getModTime() {
      return modTime_;
    }

    /**
     * <code>int64 mod_time = 2;</code>
     */
    public Builder setModTime(long value) {

      modTime_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>int64 mod_time = 2;</code>
     */
    public Builder clearModTime() {

      modTime_ = 0L;
      onChanged();
      return this;
    }

    private int mode_;

    /**
     * <pre>
     * 上层已经有dir了, 这里就不放了
     * bool dir = 3;
     * </pre>
     *
     * <code>int32 mode = 3;</code>
     */
    public int getMode() {
      return mode_;
    }

    /**
     * <pre>
     * 上层已经有dir了, 这里就不放了
     * bool dir = 3;
     * </pre>
     *
     * <code>int32 mode = 3;</code>
     */
    public Builder setMode(int value) {

      mode_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 上层已经有dir了, 这里就不放了
     * bool dir = 3;
     * </pre>
     *
     * <code>int32 mode = 3;</code>
     */
    public Builder clearMode() {

      mode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.common.grpc.FileInfo)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.common.grpc.FileInfo)
  private static final io.holoinsight.server.common.grpc.FileInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.common.grpc.FileInfo();
  }

  public static io.holoinsight.server.common.grpc.FileInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileInfo> PARSER =
      new com.google.protobuf.AbstractParser<FileInfo>() {
        @java.lang.Override
        public FileInfo parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FileInfo(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FileInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.common.grpc.FileInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
