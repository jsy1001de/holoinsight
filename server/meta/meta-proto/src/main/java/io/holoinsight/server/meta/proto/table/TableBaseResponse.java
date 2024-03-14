/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: TableService.proto

package io.holoinsight.server.meta.proto.table;

/**
 * Protobuf type {@code scheduler.TableBaseResponse}
 */
public final class TableBaseResponse extends com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:scheduler.TableBaseResponse)
    TableBaseResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use TableBaseResponse.newBuilder() to construct.
  private TableBaseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TableBaseResponse() {
    success_ = false;
    errMsg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TableBaseResponse(com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            success_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            errMsg_ = s;
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
    return io.holoinsight.server.meta.proto.table.TableServiceProto.internal_static_scheduler_TableBaseResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
    return io.holoinsight.server.meta.proto.table.TableServiceProto.internal_static_scheduler_TableBaseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.holoinsight.server.meta.proto.table.TableBaseResponse.class,
            io.holoinsight.server.meta.proto.table.TableBaseResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;

  /**
   * <code>bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int ERRMSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object errMsg_;

  /**
   * <code>string errMsg = 2;</code>
   */
  public java.lang.String getErrMsg() {
    java.lang.Object ref = errMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errMsg_ = s;
      return s;
    }
  }

  /**
   * <code>string errMsg = 2;</code>
   */
  public com.google.protobuf.ByteString getErrMsgBytes() {
    java.lang.Object ref = errMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      errMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1)
      return true;
    if (isInitialized == 0)
      return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (!getErrMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, errMsg_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1)
      return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, success_);
    }
    if (!getErrMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, errMsg_);
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
    if (!(obj instanceof io.holoinsight.server.meta.proto.table.TableBaseResponse)) {
      return super.equals(obj);
    }
    io.holoinsight.server.meta.proto.table.TableBaseResponse other =
        (io.holoinsight.server.meta.proto.table.TableBaseResponse) obj;

    boolean result = true;
    result = result && (getSuccess() == other.getSuccess());
    result = result && getErrMsg().equals(other.getErrMsg());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSuccess());
    hash = (37 * hash) + ERRMSG_FIELD_NUMBER;
    hash = (53 * hash) + getErrMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input,
        extensionRegistry);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input,
        extensionRegistry);
  }

  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      io.holoinsight.server.meta.proto.table.TableBaseResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   * Protobuf type {@code scheduler.TableBaseResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:scheduler.TableBaseResponse)
      io.holoinsight.server.meta.proto.table.TableBaseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.holoinsight.server.meta.proto.table.TableServiceProto.internal_static_scheduler_TableBaseResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return io.holoinsight.server.meta.proto.table.TableServiceProto.internal_static_scheduler_TableBaseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.holoinsight.server.meta.proto.table.TableBaseResponse.class,
              io.holoinsight.server.meta.proto.table.TableBaseResponse.Builder.class);
    }

    // Construct using io.holoinsight.server.meta.proto.table.TableBaseResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {}

    public Builder clear() {
      super.clear();
      success_ = false;

      errMsg_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.holoinsight.server.meta.proto.table.TableServiceProto.internal_static_scheduler_TableBaseResponse_descriptor;
    }

    public io.holoinsight.server.meta.proto.table.TableBaseResponse getDefaultInstanceForType() {
      return io.holoinsight.server.meta.proto.table.TableBaseResponse.getDefaultInstance();
    }

    public io.holoinsight.server.meta.proto.table.TableBaseResponse build() {
      io.holoinsight.server.meta.proto.table.TableBaseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.holoinsight.server.meta.proto.table.TableBaseResponse buildPartial() {
      io.holoinsight.server.meta.proto.table.TableBaseResponse result =
          new io.holoinsight.server.meta.proto.table.TableBaseResponse(this);
      result.success_ = success_;
      result.errMsg_ = errMsg_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }

    public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.holoinsight.server.meta.proto.table.TableBaseResponse) {
        return mergeFrom((io.holoinsight.server.meta.proto.table.TableBaseResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.holoinsight.server.meta.proto.table.TableBaseResponse other) {
      if (other == io.holoinsight.server.meta.proto.table.TableBaseResponse.getDefaultInstance())
        return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (!other.getErrMsg().isEmpty()) {
        errMsg_ = other.errMsg_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      io.holoinsight.server.meta.proto.table.TableBaseResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (io.holoinsight.server.meta.proto.table.TableBaseResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean success_;

    /**
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }

    /**
     * <code>bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {

      success_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>bool success = 1;</code>
     */
    public Builder clearSuccess() {

      success_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object errMsg_ = "";

    /**
     * <code>string errMsg = 2;</code>
     */
    public java.lang.String getErrMsg() {
      java.lang.Object ref = errMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string errMsg = 2;</code>
     */
    public com.google.protobuf.ByteString getErrMsgBytes() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        errMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string errMsg = 2;</code>
     */
    public Builder setErrMsg(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      errMsg_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string errMsg = 2;</code>
     */
    public Builder clearErrMsg() {

      errMsg_ = getDefaultInstance().getErrMsg();
      onChanged();
      return this;
    }

    /**
     * <code>string errMsg = 2;</code>
     */
    public Builder setErrMsgBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      errMsg_ = value;
      onChanged();
      return this;
    }

    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:scheduler.TableBaseResponse)
  }

  // @@protoc_insertion_point(class_scope:scheduler.TableBaseResponse)
  private static final io.holoinsight.server.meta.proto.table.TableBaseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.holoinsight.server.meta.proto.table.TableBaseResponse();
  }

  public static io.holoinsight.server.meta.proto.table.TableBaseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableBaseResponse> PARSER =
      new com.google.protobuf.AbstractParser<TableBaseResponse>() {
        public TableBaseResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TableBaseResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TableBaseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableBaseResponse> getParserForType() {
    return PARSER;
  }

  public io.holoinsight.server.meta.proto.table.TableBaseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
