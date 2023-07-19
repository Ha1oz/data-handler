package com.haloz.springboot.proto;
public final class Product {
    private Product() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface CPUOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CPU)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string receiverId = 1;</code>
         * @return The receiverId.
         */
        java.lang.String getReceiverId();
        /**
         * <code>string receiverId = 1;</code>
         * @return The bytes for receiverId.
         */
        com.google.protobuf.ByteString
        getReceiverIdBytes();

        /**
         * <pre>
         *Name of the CPU
         * </pre>
         *
         * <code>string name = 2;</code>
         * @return The name.
         */
        java.lang.String getName();
        /**
         * <pre>
         *Name of the CPU
         * </pre>
         *
         * <code>string name = 2;</code>
         * @return The bytes for name.
         */
        com.google.protobuf.ByteString
        getNameBytes();

        /**
         * <code>uint32 number_cores = 3;</code>
         * @return The numberCores.
         */
        int getNumberCores();

        /**
         * <code>uint32 number_threads = 4;</code>
         * @return The numberThreads.
         */
        int getNumberThreads();
    }
    /**
     * Protobuf type {@code CPU}
     */
    public static final class CPU extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CPU)
            CPUOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CPU.newBuilder() to construct.
        private CPU(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private CPU() {
            receiverId_ = "";
            name_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new CPU();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private CPU(
                com.google.protobuf.CodedInputStream input,
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
                        case 10: {
                            java.lang.String s = input.readStringRequireUtf8();

                            receiverId_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            name_ = s;
                            break;
                        }
                        case 24: {

                            numberCores_ = input.readUInt32();
                            break;
                        }
                        case 32: {

                            numberThreads_ = input.readUInt32();
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
                                    input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Product.internal_static_CPU_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Product.internal_static_CPU_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Product.CPU.class, Product.CPU.Builder.class);
        }

        public static final int RECEIVERID_FIELD_NUMBER = 1;
        private volatile java.lang.Object receiverId_;
        /**
         * <code>string receiverId = 1;</code>
         * @return The receiverId.
         */
        @java.lang.Override
        public java.lang.String getReceiverId() {
            java.lang.Object ref = receiverId_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                receiverId_ = s;
                return s;
            }
        }
        /**
         * <code>string receiverId = 1;</code>
         * @return The bytes for receiverId.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getReceiverIdBytes() {
            java.lang.Object ref = receiverId_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                receiverId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int NAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object name_;
        /**
         * <pre>
         *Name of the CPU
         * </pre>
         *
         * <code>string name = 2;</code>
         * @return The name.
         */
        @java.lang.Override
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            }
        }
        /**
         * <pre>
         *Name of the CPU
         * </pre>
         *
         * <code>string name = 2;</code>
         * @return The bytes for name.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int NUMBER_CORES_FIELD_NUMBER = 3;
        private int numberCores_;
        /**
         * <code>uint32 number_cores = 3;</code>
         * @return The numberCores.
         */
        @java.lang.Override
        public int getNumberCores() {
            return numberCores_;
        }

        public static final int NUMBER_THREADS_FIELD_NUMBER = 4;
        private int numberThreads_;
        /**
         * <code>uint32 number_threads = 4;</code>
         * @return The numberThreads.
         */
        @java.lang.Override
        public int getNumberThreads() {
            return numberThreads_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiverId_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, receiverId_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
            }
            if (numberCores_ != 0) {
                output.writeUInt32(3, numberCores_);
            }
            if (numberThreads_ != 0) {
                output.writeUInt32(4, numberThreads_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(receiverId_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, receiverId_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
            }
            if (numberCores_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, numberCores_);
            }
            if (numberThreads_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, numberThreads_);
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
            if (!(obj instanceof Product.CPU)) {
                return super.equals(obj);
            }
            Product.CPU other = (Product.CPU) obj;

            if (!getReceiverId()
                    .equals(other.getReceiverId())) return false;
            if (!getName()
                    .equals(other.getName())) return false;
            if (getNumberCores()
                    != other.getNumberCores()) return false;
            if (getNumberThreads()
                    != other.getNumberThreads()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RECEIVERID_FIELD_NUMBER;
            hash = (53 * hash) + getReceiverId().hashCode();
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
            hash = (37 * hash) + NUMBER_CORES_FIELD_NUMBER;
            hash = (53 * hash) + getNumberCores();
            hash = (37 * hash) + NUMBER_THREADS_FIELD_NUMBER;
            hash = (53 * hash) + getNumberThreads();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static Product.CPU parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Product.CPU parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Product.CPU parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Product.CPU parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Product.CPU parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Product.CPU parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Product.CPU parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Product.CPU parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static Product.CPU parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static Product.CPU parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static Product.CPU parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Product.CPU parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(Product.CPU prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code CPU}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CPU)
                Product.CPUOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Product.internal_static_CPU_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Product.internal_static_CPU_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Product.CPU.class, Product.CPU.Builder.class);
            }

            // Construct using Product.CPU.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                receiverId_ = "";

                name_ = "";

                numberCores_ = 0;

                numberThreads_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Product.internal_static_CPU_descriptor;
            }

            @java.lang.Override
            public Product.CPU getDefaultInstanceForType() {
                return Product.CPU.getDefaultInstance();
            }

            @java.lang.Override
            public Product.CPU build() {
                Product.CPU result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public Product.CPU buildPartial() {
                Product.CPU result = new Product.CPU(this);
                result.receiverId_ = receiverId_;
                result.name_ = name_;
                result.numberCores_ = numberCores_;
                result.numberThreads_ = numberThreads_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }
            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }
            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }
            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Product.CPU) {
                    return mergeFrom((Product.CPU)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Product.CPU other) {
                if (other == Product.CPU.getDefaultInstance()) return this;
                if (!other.getReceiverId().isEmpty()) {
                    receiverId_ = other.receiverId_;
                    onChanged();
                }
                if (!other.getName().isEmpty()) {
                    name_ = other.name_;
                    onChanged();
                }
                if (other.getNumberCores() != 0) {
                    setNumberCores(other.getNumberCores());
                }
                if (other.getNumberThreads() != 0) {
                    setNumberThreads(other.getNumberThreads());
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
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Product.CPU parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Product.CPU) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object receiverId_ = "";
            /**
             * <code>string receiverId = 1;</code>
             * @return The receiverId.
             */
            public java.lang.String getReceiverId() {
                java.lang.Object ref = receiverId_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    receiverId_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string receiverId = 1;</code>
             * @return The bytes for receiverId.
             */
            public com.google.protobuf.ByteString
            getReceiverIdBytes() {
                java.lang.Object ref = receiverId_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    receiverId_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string receiverId = 1;</code>
             * @param value The receiverId to set.
             * @return This builder for chaining.
             */
            public Builder setReceiverId(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                receiverId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string receiverId = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearReceiverId() {

                receiverId_ = getDefaultInstance().getReceiverId();
                onChanged();
                return this;
            }
            /**
             * <code>string receiverId = 1;</code>
             * @param value The bytes for receiverId to set.
             * @return This builder for chaining.
             */
            public Builder setReceiverIdBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                receiverId_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object name_ = "";
            /**
             * <pre>
             *Name of the CPU
             * </pre>
             *
             * <code>string name = 2;</code>
             * @return The name.
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <pre>
             *Name of the CPU
             * </pre>
             *
             * <code>string name = 2;</code>
             * @return The bytes for name.
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             *Name of the CPU
             * </pre>
             *
             * <code>string name = 2;</code>
             * @param value The name to set.
             * @return This builder for chaining.
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                name_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *Name of the CPU
             * </pre>
             *
             * <code>string name = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearName() {

                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }
            /**
             * <pre>
             *Name of the CPU
             * </pre>
             *
             * <code>string name = 2;</code>
             * @param value The bytes for name to set.
             * @return This builder for chaining.
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                name_ = value;
                onChanged();
                return this;
            }

            private int numberCores_ ;
            /**
             * <code>uint32 number_cores = 3;</code>
             * @return The numberCores.
             */
            @java.lang.Override
            public int getNumberCores() {
                return numberCores_;
            }
            /**
             * <code>uint32 number_cores = 3;</code>
             * @param value The numberCores to set.
             * @return This builder for chaining.
             */
            public Builder setNumberCores(int value) {

                numberCores_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 number_cores = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearNumberCores() {

                numberCores_ = 0;
                onChanged();
                return this;
            }

            private int numberThreads_ ;
            /**
             * <code>uint32 number_threads = 4;</code>
             * @return The numberThreads.
             */
            @java.lang.Override
            public int getNumberThreads() {
                return numberThreads_;
            }
            /**
             * <code>uint32 number_threads = 4;</code>
             * @param value The numberThreads to set.
             * @return This builder for chaining.
             */
            public Builder setNumberThreads(int value) {

                numberThreads_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 number_threads = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearNumberThreads() {

                numberThreads_ = 0;
                onChanged();
                return this;
            }
            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:CPU)
        }

        // @@protoc_insertion_point(class_scope:CPU)
        private static final Product.CPU DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new Product.CPU();
        }

        public static Product.CPU getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CPU>
                PARSER = new com.google.protobuf.AbstractParser<CPU>() {
            @java.lang.Override
            public CPU parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CPU(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CPU> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CPU> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public Product.CPU getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CPU_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CPU_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\007Product\"U\n\003CPU\022\022\n\nreceiverId\030\001 \001(\t\022\014\n\004" +
                        "name\030\002 \001(\t\022\024\n\014number_cores\030\003 \001(\r\022\026\n\016numb" +
                        "er_threads\030\004 \001(\rb\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        });
        internal_static_CPU_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_CPU_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CPU_descriptor,
                new java.lang.String[] { "ReceiverId", "Name", "NumberCores", "NumberThreads", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}


