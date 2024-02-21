/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: gateway-for-agent.proto

package io.holoinsight.server.gateway.grpc;

/**
 * <pre>
 * 可以存下各种类型的万能字段
 * </pre>
 *
 * Protobuf type {@code io.holoinsight.server.gateway.grpc.DataNode}
 */
public final class DataNode extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.holoinsight.server.gateway.grpc.DataNode)
    DataNodeOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DataNode.newBuilder() to construct.
  private DataNode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataNode() {
    bytes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataNode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DataNode(com.google.protobuf.CodedInputStream input,
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

            type_ = input.readInt32();
            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          case 25: {

            value_ = input.readDouble();
            break;
          }
          case 34: {

            bytes_ = input.readBytes();
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
    return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_DataNode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_DataNode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(io.holoinsight.server.gateway.grpc.DataNode.class,
            io.holoinsight.server.gateway.grpc.DataNode.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;

  /**
   * <pre>
   * 表示数据类型, 其实这里不存也行, 根据配置元数据理论是可以知道的
   * 比如约定:
   * 0 的话 value 就是聚合后的结果, count是聚合次数(可能没用)
   * 1 的话 value 表示聚合类型是avg, count是聚合次数, value是sum值, 此时用 sum/count 可以得到正确的avg, 方便做分布式avg计算
   * 2 的话 表示 bytes 是字符串, 需要根据具体业务语义进行解释
   * 3 的话 表示 bytes 是复杂的字节数据, 需要根据具体业务语义进行解释
   * </pre>
   *
   * <code>int32 type = 1;</code>
   * 
   * @return The type.
   */
  @java.lang.Override
  public int getType() {
    return type_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;

  /**
   * <pre>
   * 聚合次数
   * </pre>
   *
   * <code>int32 count = 2;</code>
   * 
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private double value_;

  /**
   * <pre>
   * 聚合的值, 根据情况可能是一个聚合结果, 或avg的sum值(此时需要与count配合使用)
   * </pre>
   *
   * <code>double value = 3;</code>
   * 
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
  }

  public static final int BYTES_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString bytes_;

  /**
   * <pre>
   * 还能携带任意二进制数据, 字符串也可以使用这种方式存
   * </pre>
   *
   * <code>bytes bytes = 4;</code>
   * 
   * @return The bytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBytes() {
    return bytes_;
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
    if (type_ != 0) {
      output.writeInt32(1, type_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (value_ != 0D) {
      output.writeDouble(3, value_);
    }
    if (!bytes_.isEmpty()) {
      output.writeBytes(4, bytes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (type_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, type_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, count_);
    }
    if (value_ != 0D) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, value_);
    }
    if (!bytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, bytes_);
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
    if (!(obj instanceof io.holoinsight.server.gateway.grpc.DataNode)) {
      return super.equals(obj);
    }
    io.holoinsight.server.gateway.grpc.DataNode other =
        (io.holoinsight.server.gateway.grpc.DataNode) obj;

    if (getType() != other.getType())
      return false;
    if (getCount() != other.getCount())
      return false;
    if (java.lang.Double.doubleToLongBits(getValue()) != java.lang.Double
        .doubleToLongBits(other.getValue()))
      return false;
    if (!getBytes().equals(other.getBytes()))
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType();
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash)
        + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getValue()));
    hash = (37 * hash) + BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getBytes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.gateway.grpc.DataNode parseFrom(
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

  public static Builder newBuilder(io.holoinsight.server.gateway.grpc.DataNode prototype) {
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
   * 可以存下各种类型的万能字段
   * </pre>
   *
   * Protobuf type {@code io.holoinsight.server.gateway.grpc.DataNode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:io.holoinsight.server.gateway.grpc.DataNode)
      io.holoinsight.server.gateway.grpc.DataNodeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_DataNode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_DataNode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(io.holoinsight.server.gateway.grpc.DataNode.class,
              io.holoinsight.server.gateway.grpc.DataNode.Builder.class);
    }

    // Construct using io.holoinsight.server.gateway.grpc.DataNode.newBuilder()
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
      type_ = 0;

      count_ = 0;

      value_ = 0D;

      bytes_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.gateway.grpc.GatewayProtos.internal_static_io_holoinsight_server_gateway_grpc_DataNode_descriptor;
    }

    @java.lang.Override
    public io.holoinsight.server.gateway.grpc.DataNode getDefaultInstanceForType() {
      return io.holoinsight.server.gateway.grpc.DataNode.getDefaultInstance();
    }

    @java.lang.Override
    public io.holoinsight.server.gateway.grpc.DataNode build() {
      io.holoinsight.server.gateway.grpc.DataNode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.holoinsight.server.gateway.grpc.DataNode buildPartial() {
      io.holoinsight.server.gateway.grpc.DataNode result =
          new io.holoinsight.server.gateway.grpc.DataNode(this);
      result.type_ = type_;
      result.count_ = count_;
      result.value_ = value_;
      result.bytes_ = bytes_;
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
      if (other instanceof io.holoinsight.server.gateway.grpc.DataNode) {
        return mergeFrom((io.holoinsight.server.gateway.grpc.DataNode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.gateway.grpc.DataNode other) {
      if (other == io.holoinsight.server.gateway.grpc.DataNode.getDefaultInstance())
        return this;
      if (other.getType() != 0) {
        setType(other.getType());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
      }
      if (other.getBytes() != com.google.protobuf.ByteString.EMPTY) {
        setBytes(other.getBytes());
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
      io.holoinsight.server.gateway.grpc.DataNode parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.holoinsight.server.gateway.grpc.DataNode) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_;

    /**
     * <pre>
     * 表示数据类型, 其实这里不存也行, 根据配置元数据理论是可以知道的
     * 比如约定:
     * 0 的话 value 就是聚合后的结果, count是聚合次数(可能没用)
     * 1 的话 value 表示聚合类型是avg, count是聚合次数, value是sum值, 此时用 sum/count 可以得到正确的avg, 方便做分布式avg计算
     * 2 的话 表示 bytes 是字符串, 需要根据具体业务语义进行解释
     * 3 的话 表示 bytes 是复杂的字节数据, 需要根据具体业务语义进行解释
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * 
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    /**
     * <pre>
     * 表示数据类型, 其实这里不存也行, 根据配置元数据理论是可以知道的
     * 比如约定:
     * 0 的话 value 就是聚合后的结果, count是聚合次数(可能没用)
     * 1 的话 value 表示聚合类型是avg, count是聚合次数, value是sum值, 此时用 sum/count 可以得到正确的avg, 方便做分布式avg计算
     * 2 的话 表示 bytes 是字符串, 需要根据具体业务语义进行解释
     * 3 的话 表示 bytes 是复杂的字节数据, 需要根据具体业务语义进行解释
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * 
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(int value) {

      type_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 表示数据类型, 其实这里不存也行, 根据配置元数据理论是可以知道的
     * 比如约定:
     * 0 的话 value 就是聚合后的结果, count是聚合次数(可能没用)
     * 1 的话 value 表示聚合类型是avg, count是聚合次数, value是sum值, 此时用 sum/count 可以得到正确的avg, 方便做分布式avg计算
     * 2 的话 表示 bytes 是字符串, 需要根据具体业务语义进行解释
     * 3 的话 表示 bytes 是复杂的字节数据, 需要根据具体业务语义进行解释
     * </pre>
     *
     * <code>int32 type = 1;</code>
     * 
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private int count_;

    /**
     * <pre>
     * 聚合次数
     * </pre>
     *
     * <code>int32 count = 2;</code>
     * 
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }

    /**
     * <pre>
     * 聚合次数
     * </pre>
     *
     * <code>int32 count = 2;</code>
     * 
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 聚合次数
     * </pre>
     *
     * <code>int32 count = 2;</code>
     * 
     * @return This builder for chaining.
     */
    public Builder clearCount() {

      count_ = 0;
      onChanged();
      return this;
    }

    private double value_;

    /**
     * <pre>
     * 聚合的值, 根据情况可能是一个聚合结果, 或avg的sum值(此时需要与count配合使用)
     * </pre>
     *
     * <code>double value = 3;</code>
     * 
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }

    /**
     * <pre>
     * 聚合的值, 根据情况可能是一个聚合结果, 或avg的sum值(此时需要与count配合使用)
     * </pre>
     *
     * <code>double value = 3;</code>
     * 
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {

      value_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 聚合的值, 根据情况可能是一个聚合结果, 或avg的sum值(此时需要与count配合使用)
     * </pre>
     *
     * <code>double value = 3;</code>
     * 
     * @return This builder for chaining.
     */
    public Builder clearValue() {

      value_ = 0D;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString bytes_ = com.google.protobuf.ByteString.EMPTY;

    /**
     * <pre>
     * 还能携带任意二进制数据, 字符串也可以使用这种方式存
     * </pre>
     *
     * <code>bytes bytes = 4;</code>
     * 
     * @return The bytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBytes() {
      return bytes_;
    }

    /**
     * <pre>
     * 还能携带任意二进制数据, 字符串也可以使用这种方式存
     * </pre>
     *
     * <code>bytes bytes = 4;</code>
     * 
     * @param value The bytes to set.
     * @return This builder for chaining.
     */
    public Builder setBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      bytes_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * 还能携带任意二进制数据, 字符串也可以使用这种方式存
     * </pre>
     *
     * <code>bytes bytes = 4;</code>
     * 
     * @return This builder for chaining.
     */
    public Builder clearBytes() {

      bytes_ = getDefaultInstance().getBytes();
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


    // @@protoc_insertion_point(builder_scope:io.holoinsight.server.gateway.grpc.DataNode)
  }

  // @@protoc_insertion_point(class_scope:io.holoinsight.server.gateway.grpc.DataNode)
  private static final io.holoinsight.server.gateway.grpc.DataNode DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.gateway.grpc.DataNode();
  }

  public static io.holoinsight.server.gateway.grpc.DataNode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataNode> PARSER =
      new com.google.protobuf.AbstractParser<DataNode>() {
        @java.lang.Override
        public DataNode parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DataNode(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DataNode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataNode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.holoinsight.server.gateway.grpc.DataNode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
