//package com.haloz.pb;
//
//public final class My {
//    private My() {}
//    public static void registerAllExtensions(
//            com.google.protobuf.ExtensionRegistryLite registry) {
//    }
//
//    public static void registerAllExtensions(
//            com.google.protobuf.ExtensionRegistry registry) {
//        registerAllExtensions(
//                (com.google.protobuf.ExtensionRegistryLite) registry);
//    }
//    public interface CPUOrBuilder extends
//            // @@protoc_insertion_point(interface_extends:CPU)
//            com.google.protobuf.MessageOrBuilder {
//
//        /**
//         * <pre>
//         *Brand of the CPU
//         * </pre>
//         *
//         * <code>string brand = 1;</code>
//         * @return The brand.
//         */
//        java.lang.String getBrand();
//        /**
//         * <pre>
//         *Brand of the CPU
//         * </pre>
//         *
//         * <code>string brand = 1;</code>
//         * @return The bytes for brand.
//         */
//        com.google.protobuf.ByteString
//        getBrandBytes();
//
//        /**
//         * <pre>
//         *Name of the CPU
//         * </pre>
//         *
//         * <code>string name = 2;</code>
//         * @return The name.
//         */
//        java.lang.String getName();
//        /**
//         * <pre>
//         *Name of the CPU
//         * </pre>
//         *
//         * <code>string name = 2;</code>
//         * @return The bytes for name.
//         */
//        com.google.protobuf.ByteString
//        getNameBytes();
//
//        /**
//         * <code>uint32 number_cores = 3;</code>
//         * @return The numberCores.
//         */
//        int getNumberCores();
//
//        /**
//         * <code>uint32 number_threads = 4;</code>
//         * @return The numberThreads.
//         */
//        int getNumberThreads();
//
//        /**
//         * <code>double min_ghz = 5;</code>
//         * @return The minGhz.
//         */
//        double getMinGhz();
//
//        /**
//         * <code>double max_ghz = 6;</code>
//         * @return The maxGhz.
//         */
//        double getMaxGhz();
//    }
//    /**
//     * Protobuf type {@code CPU}
//     */
//    public static final class CPU extends
//            com.google.protobuf.GeneratedMessageV3 implements
//            // @@protoc_insertion_point(message_implements:CPU)
//            CPUOrBuilder {
//        private static final long serialVersionUID = 0L;
//        // Use CPU.newBuilder() to construct.
//        private CPU(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
//            super(builder);
//        }
//        private CPU() {
//            brand_ = "";
//            name_ = "";
//        }
//
//        @java.lang.Override
//        @SuppressWarnings({"unused"})
//        protected java.lang.Object newInstance(
//                UnusedPrivateParameter unused) {
//            return new CPU();
//        }
//
//        @java.lang.Override
//        public final com.google.protobuf.UnknownFieldSet
//        getUnknownFields() {
//            return this.unknownFields;
//        }
//        public static final com.google.protobuf.Descriptors.Descriptor
//        getDescriptor() {
//            return My.internal_static_CPU_descriptor;
//        }
//
//        @java.lang.Override
//        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
//        internalGetFieldAccessorTable() {
//            return My.internal_static_CPU_fieldAccessorTable
//                    .ensureFieldAccessorsInitialized(
//                            My.CPU.class, My.CPU.Builder.class);
//        }
//
//        public static final int BRAND_FIELD_NUMBER = 1;
//        @SuppressWarnings("serial")
//        private volatile java.lang.Object brand_ = "";
//        /**
//         * <pre>
//         *Brand of the CPU
//         * </pre>
//         *
//         * <code>string brand = 1;</code>
//         * @return The brand.
//         */
//        @java.lang.Override
//        public java.lang.String getBrand() {
//            java.lang.Object ref = brand_;
//            if (ref instanceof java.lang.String) {
//                return (java.lang.String) ref;
//            } else {
//                com.google.protobuf.ByteString bs =
//                        (com.google.protobuf.ByteString) ref;
//                java.lang.String s = bs.toStringUtf8();
//                brand_ = s;
//                return s;
//            }
//        }
//        /**
//         * <pre>
//         *Brand of the CPU
//         * </pre>
//         *
//         * <code>string brand = 1;</code>
//         * @return The bytes for brand.
//         */
//        @java.lang.Override
//        public com.google.protobuf.ByteString
//        getBrandBytes() {
//            java.lang.Object ref = brand_;
//            if (ref instanceof java.lang.String) {
//                com.google.protobuf.ByteString b =
//                        com.google.protobuf.ByteString.copyFromUtf8(
//                                (java.lang.String) ref);
//                brand_ = b;
//                return b;
//            } else {
//                return (com.google.protobuf.ByteString) ref;
//            }
//        }
//
//        public static final int NAME_FIELD_NUMBER = 2;
//        @SuppressWarnings("serial")
//        private volatile java.lang.Object name_ = "";
//        /**
//         * <pre>
//         *Name of the CPU
//         * </pre>
//         *
//         * <code>string name = 2;</code>
//         * @return The name.
//         */
//        @java.lang.Override
//        public java.lang.String getName() {
//            java.lang.Object ref = name_;
//            if (ref instanceof java.lang.String) {
//                return (java.lang.String) ref;
//            } else {
//                com.google.protobuf.ByteString bs =
//                        (com.google.protobuf.ByteString) ref;
//                java.lang.String s = bs.toStringUtf8();
//                name_ = s;
//                return s;
//            }
//        }
//        /**
//         * <pre>
//         *Name of the CPU
//         * </pre>
//         *
//         * <code>string name = 2;</code>
//         * @return The bytes for name.
//         */
//        @java.lang.Override
//        public com.google.protobuf.ByteString
//        getNameBytes() {
//            java.lang.Object ref = name_;
//            if (ref instanceof java.lang.String) {
//                com.google.protobuf.ByteString b =
//                        com.google.protobuf.ByteString.copyFromUtf8(
//                                (java.lang.String) ref);
//                name_ = b;
//                return b;
//            } else {
//                return (com.google.protobuf.ByteString) ref;
//            }
//        }
//
//        public static final int NUMBER_CORES_FIELD_NUMBER = 3;
//        private int numberCores_ = 0;
//        /**
//         * <code>uint32 number_cores = 3;</code>
//         * @return The numberCores.
//         */
//        @java.lang.Override
//        public int getNumberCores() {
//            return numberCores_;
//        }
//
//        public static final int NUMBER_THREADS_FIELD_NUMBER = 4;
//        private int numberThreads_ = 0;
//        /**
//         * <code>uint32 number_threads = 4;</code>
//         * @return The numberThreads.
//         */
//        @java.lang.Override
//        public int getNumberThreads() {
//            return numberThreads_;
//        }
//
//        public static final int MIN_GHZ_FIELD_NUMBER = 5;
//        private double minGhz_ = 0D;
//        /**
//         * <code>double min_ghz = 5;</code>
//         * @return The minGhz.
//         */
//        @java.lang.Override
//        public double getMinGhz() {
//            return minGhz_;
//        }
//
//        public static final int MAX_GHZ_FIELD_NUMBER = 6;
//        private double maxGhz_ = 0D;
//        /**
//         * <code>double max_ghz = 6;</code>
//         * @return The maxGhz.
//         */
//        @java.lang.Override
//        public double getMaxGhz() {
//            return maxGhz_;
//        }
//
//        private byte memoizedIsInitialized = -1;
//        @java.lang.Override
//        public final boolean isInitialized() {
//            byte isInitialized = memoizedIsInitialized;
//            if (isInitialized == 1) return true;
//            if (isInitialized == 0) return false;
//
//            memoizedIsInitialized = 1;
//            return true;
//        }
//
//        @java.lang.Override
//        public void writeTo(com.google.protobuf.CodedOutputStream output)
//                throws java.io.IOException {
//            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
//                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, brand_);
//            }
//            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
//                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
//            }
//            if (numberCores_ != 0) {
//                output.writeUInt32(3, numberCores_);
//            }
//            if (numberThreads_ != 0) {
//                output.writeUInt32(4, numberThreads_);
//            }
//            if (java.lang.Double.doubleToRawLongBits(minGhz_) != 0) {
//                output.writeDouble(5, minGhz_);
//            }
//            if (java.lang.Double.doubleToRawLongBits(maxGhz_) != 0) {
//                output.writeDouble(6, maxGhz_);
//            }
//            getUnknownFields().writeTo(output);
//        }
//
//        @java.lang.Override
//        public int getSerializedSize() {
//            int size = memoizedSize;
//            if (size != -1) return size;
//
//            size = 0;
//            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(brand_)) {
//                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, brand_);
//            }
//            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
//                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
//            }
//            if (numberCores_ != 0) {
//                size += com.google.protobuf.CodedOutputStream
//                        .computeUInt32Size(3, numberCores_);
//            }
//            if (numberThreads_ != 0) {
//                size += com.google.protobuf.CodedOutputStream
//                        .computeUInt32Size(4, numberThreads_);
//            }
//            if (java.lang.Double.doubleToRawLongBits(minGhz_) != 0) {
//                size += com.google.protobuf.CodedOutputStream
//                        .computeDoubleSize(5, minGhz_);
//            }
//            if (java.lang.Double.doubleToRawLongBits(maxGhz_) != 0) {
//                size += com.google.protobuf.CodedOutputStream
//                        .computeDoubleSize(6, maxGhz_);
//            }
//            size += getUnknownFields().getSerializedSize();
//            memoizedSize = size;
//            return size;
//        }
//
//        @java.lang.Override
//        public boolean equals(final java.lang.Object obj) {
//            if (obj == this) {
//                return true;
//            }
//            if (!(obj instanceof My.CPU)) {
//                return super.equals(obj);
//            }
//            My.CPU other = (My.CPU) obj;
//
//            if (!getBrand()
//                    .equals(other.getBrand())) return false;
//            if (!getName()
//                    .equals(other.getName())) return false;
//            if (getNumberCores()
//                    != other.getNumberCores()) return false;
//            if (getNumberThreads()
//                    != other.getNumberThreads()) return false;
//            if (java.lang.Double.doubleToLongBits(getMinGhz())
//                    != java.lang.Double.doubleToLongBits(
//                    other.getMinGhz())) return false;
//            if (java.lang.Double.doubleToLongBits(getMaxGhz())
//                    != java.lang.Double.doubleToLongBits(
//                    other.getMaxGhz())) return false;
//            if (!getUnknownFields().equals(other.getUnknownFields())) return false;
//            return true;
//        }
//
//        @java.lang.Override
//        public int hashCode() {
//            if (memoizedHashCode != 0) {
//                return memoizedHashCode;
//            }
//            int hash = 41;
//            hash = (19 * hash) + getDescriptor().hashCode();
//            hash = (37 * hash) + BRAND_FIELD_NUMBER;
//            hash = (53 * hash) + getBrand().hashCode();
//            hash = (37 * hash) + NAME_FIELD_NUMBER;
//            hash = (53 * hash) + getName().hashCode();
//            hash = (37 * hash) + NUMBER_CORES_FIELD_NUMBER;
//            hash = (53 * hash) + getNumberCores();
//            hash = (37 * hash) + NUMBER_THREADS_FIELD_NUMBER;
//            hash = (53 * hash) + getNumberThreads();
//            hash = (37 * hash) + MIN_GHZ_FIELD_NUMBER;
//            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
//                    java.lang.Double.doubleToLongBits(getMinGhz()));
//            hash = (37 * hash) + MAX_GHZ_FIELD_NUMBER;
//            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
//                    java.lang.Double.doubleToLongBits(getMaxGhz()));
//            hash = (29 * hash) + getUnknownFields().hashCode();
//            memoizedHashCode = hash;
//            return hash;
//        }
//
//        public static My.CPU parseFrom(
//                java.nio.ByteBuffer data)
//                throws com.google.protobuf.InvalidProtocolBufferException {
//            return PARSER.parseFrom(data);
//        }
//        public static My.CPU parseFrom(
//                java.nio.ByteBuffer data,
//                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                throws com.google.protobuf.InvalidProtocolBufferException {
//            return PARSER.parseFrom(data, extensionRegistry);
//        }
//        public static My.CPU parseFrom(
//                com.google.protobuf.ByteString data)
//                throws com.google.protobuf.InvalidProtocolBufferException {
//            return PARSER.parseFrom(data);
//        }
//        public static My.CPU parseFrom(
//                com.google.protobuf.ByteString data,
//                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                throws com.google.protobuf.InvalidProtocolBufferException {
//            return PARSER.parseFrom(data, extensionRegistry);
//        }
//        public static My.CPU parseFrom(byte[] data)
//                throws com.google.protobuf.InvalidProtocolBufferException {
//            return PARSER.parseFrom(data);
//        }
//        public static My.CPU parseFrom(
//                byte[] data,
//                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                throws com.google.protobuf.InvalidProtocolBufferException {
//            return PARSER.parseFrom(data, extensionRegistry);
//        }
//        public static My.CPU parseFrom(java.io.InputStream input)
//                throws java.io.IOException {
//            return com.google.protobuf.GeneratedMessageV3
//                    .parseWithIOException(PARSER, input);
//        }
//        public static My.CPU parseFrom(
//                java.io.InputStream input,
//                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                throws java.io.IOException {
//            return com.google.protobuf.GeneratedMessageV3
//                    .parseWithIOException(PARSER, input, extensionRegistry);
//        }
//        public static My.CPU parseDelimitedFrom(java.io.InputStream input)
//                throws java.io.IOException {
//            return com.google.protobuf.GeneratedMessageV3
//                    .parseDelimitedWithIOException(PARSER, input);
//        }
//        public static My.CPU parseDelimitedFrom(
//                java.io.InputStream input,
//                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                throws java.io.IOException {
//            return com.google.protobuf.GeneratedMessageV3
//                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
//        }
//        public static My.CPU parseFrom(
//                com.google.protobuf.CodedInputStream input)
//                throws java.io.IOException {
//            return com.google.protobuf.GeneratedMessageV3
//                    .parseWithIOException(PARSER, input);
//        }
//        public static My.CPU parseFrom(
//                com.google.protobuf.CodedInputStream input,
//                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                throws java.io.IOException {
//            return com.google.protobuf.GeneratedMessageV3
//                    .parseWithIOException(PARSER, input, extensionRegistry);
//        }
//
//        @java.lang.Override
//        public Builder newBuilderForType() { return newBuilder(); }
//        public static Builder newBuilder() {
//            return DEFAULT_INSTANCE.toBuilder();
//        }
//        public static Builder newBuilder(My.CPU prototype) {
//            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
//        }
//        @java.lang.Override
//        public Builder toBuilder() {
//            return this == DEFAULT_INSTANCE
//                    ? new Builder() : new Builder().mergeFrom(this);
//        }
//
//        @java.lang.Override
//        protected Builder newBuilderForType(
//                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
//            Builder builder = new Builder(parent);
//            return builder;
//        }
//        /**
//         * Protobuf type {@code CPU}
//         */
//        public static final class Builder extends
//                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
//                // @@protoc_insertion_point(builder_implements:CPU)
//                My.CPUOrBuilder {
//            public static final com.google.protobuf.Descriptors.Descriptor
//            getDescriptor() {
//                return My.internal_static_CPU_descriptor;
//            }
//
//            @java.lang.Override
//            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
//            internalGetFieldAccessorTable() {
//                return My.internal_static_CPU_fieldAccessorTable
//                        .ensureFieldAccessorsInitialized(
//                                My.CPU.class, My.CPU.Builder.class);
//            }
//
//            // Construct using My.CPU.newBuilder()
//            private Builder() {
//
//            }
//
//            private Builder(
//                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
//                super(parent);
//
//            }
//            @java.lang.Override
//            public Builder clear() {
//                super.clear();
//                bitField0_ = 0;
//                brand_ = "";
//                name_ = "";
//                numberCores_ = 0;
//                numberThreads_ = 0;
//                minGhz_ = 0D;
//                maxGhz_ = 0D;
//                return this;
//            }
//
//            @java.lang.Override
//            public com.google.protobuf.Descriptors.Descriptor
//            getDescriptorForType() {
//                return My.internal_static_CPU_descriptor;
//            }
//
//            @java.lang.Override
//            public My.CPU getDefaultInstanceForType() {
//                return My.CPU.getDefaultInstance();
//            }
//
//            @java.lang.Override
//            public My.CPU build() {
//                My.CPU result = buildPartial();
//                if (!result.isInitialized()) {
//                    throw newUninitializedMessageException(result);
//                }
//                return result;
//            }
//
//            @java.lang.Override
//            public My.CPU buildPartial() {
//                My.CPU result = new My.CPU(this);
//                if (bitField0_ != 0) { buildPartial0(result); }
//                onBuilt();
//                return result;
//            }
//
//            private void buildPartial0(My.CPU result) {
//                int from_bitField0_ = bitField0_;
//                if (((from_bitField0_ & 0x00000001) != 0)) {
//                    result.brand_ = brand_;
//                }
//                if (((from_bitField0_ & 0x00000002) != 0)) {
//                    result.name_ = name_;
//                }
//                if (((from_bitField0_ & 0x00000004) != 0)) {
//                    result.numberCores_ = numberCores_;
//                }
//                if (((from_bitField0_ & 0x00000008) != 0)) {
//                    result.numberThreads_ = numberThreads_;
//                }
//                if (((from_bitField0_ & 0x00000010) != 0)) {
//                    result.minGhz_ = minGhz_;
//                }
//                if (((from_bitField0_ & 0x00000020) != 0)) {
//                    result.maxGhz_ = maxGhz_;
//                }
//            }
//
//            @java.lang.Override
//            public Builder clone() {
//                return super.clone();
//            }
//            @java.lang.Override
//            public Builder setField(
//                    com.google.protobuf.Descriptors.FieldDescriptor field,
//                    java.lang.Object value) {
//                return super.setField(field, value);
//            }
//            @java.lang.Override
//            public Builder clearField(
//                    com.google.protobuf.Descriptors.FieldDescriptor field) {
//                return super.clearField(field);
//            }
//            @java.lang.Override
//            public Builder clearOneof(
//                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
//                return super.clearOneof(oneof);
//            }
//            @java.lang.Override
//            public Builder setRepeatedField(
//                    com.google.protobuf.Descriptors.FieldDescriptor field,
//                    int index, java.lang.Object value) {
//                return super.setRepeatedField(field, index, value);
//            }
//            @java.lang.Override
//            public Builder addRepeatedField(
//                    com.google.protobuf.Descriptors.FieldDescriptor field,
//                    java.lang.Object value) {
//                return super.addRepeatedField(field, value);
//            }
//            @java.lang.Override
//            public Builder mergeFrom(com.google.protobuf.Message other) {
//                if (other instanceof My.CPU) {
//                    return mergeFrom((My.CPU)other);
//                } else {
//                    super.mergeFrom(other);
//                    return this;
//                }
//            }
//
//            public Builder mergeFrom(My.CPU other) {
//                if (other == My.CPU.getDefaultInstance()) return this;
//                if (!other.getBrand().isEmpty()) {
//                    brand_ = other.brand_;
//                    bitField0_ |= 0x00000001;
//                    onChanged();
//                }
//                if (!other.getName().isEmpty()) {
//                    name_ = other.name_;
//                    bitField0_ |= 0x00000002;
//                    onChanged();
//                }
//                if (other.getNumberCores() != 0) {
//                    setNumberCores(other.getNumberCores());
//                }
//                if (other.getNumberThreads() != 0) {
//                    setNumberThreads(other.getNumberThreads());
//                }
//                if (other.getMinGhz() != 0D) {
//                    setMinGhz(other.getMinGhz());
//                }
//                if (other.getMaxGhz() != 0D) {
//                    setMaxGhz(other.getMaxGhz());
//                }
//                this.mergeUnknownFields(other.getUnknownFields());
//                onChanged();
//                return this;
//            }
//
//            @java.lang.Override
//            public final boolean isInitialized() {
//                return true;
//            }
//
//            @java.lang.Override
//            public Builder mergeFrom(
//                    com.google.protobuf.CodedInputStream input,
//                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                    throws java.io.IOException {
//                if (extensionRegistry == null) {
//                    throw new java.lang.NullPointerException();
//                }
//                try {
//                    boolean done = false;
//                    while (!done) {
//                        int tag = input.readTag();
//                        switch (tag) {
//                            case 0:
//                                done = true;
//                                break;
//                            case 10: {
//                                brand_ = input.readStringRequireUtf8();
//                                bitField0_ |= 0x00000001;
//                                break;
//                            } // case 10
//                            case 18: {
//                                name_ = input.readStringRequireUtf8();
//                                bitField0_ |= 0x00000002;
//                                break;
//                            } // case 18
//                            case 24: {
//                                numberCores_ = input.readUInt32();
//                                bitField0_ |= 0x00000004;
//                                break;
//                            } // case 24
//                            case 32: {
//                                numberThreads_ = input.readUInt32();
//                                bitField0_ |= 0x00000008;
//                                break;
//                            } // case 32
//                            case 41: {
//                                minGhz_ = input.readDouble();
//                                bitField0_ |= 0x00000010;
//                                break;
//                            } // case 41
//                            case 49: {
//                                maxGhz_ = input.readDouble();
//                                bitField0_ |= 0x00000020;
//                                break;
//                            } // case 49
//                            default: {
//                                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
//                                    done = true; // was an endgroup tag
//                                }
//                                break;
//                            } // default:
//                        } // switch (tag)
//                    } // while (!done)
//                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
//                    throw e.unwrapIOException();
//                } finally {
//                    onChanged();
//                } // finally
//                return this;
//            }
//            private int bitField0_;
//
//            private java.lang.Object brand_ = "";
//            /**
//             * <pre>
//             *Brand of the CPU
//             * </pre>
//             *
//             * <code>string brand = 1;</code>
//             * @return The brand.
//             */
//            public java.lang.String getBrand() {
//                java.lang.Object ref = brand_;
//                if (!(ref instanceof java.lang.String)) {
//                    com.google.protobuf.ByteString bs =
//                            (com.google.protobuf.ByteString) ref;
//                    java.lang.String s = bs.toStringUtf8();
//                    brand_ = s;
//                    return s;
//                } else {
//                    return (java.lang.String) ref;
//                }
//            }
//            /**
//             * <pre>
//             *Brand of the CPU
//             * </pre>
//             *
//             * <code>string brand = 1;</code>
//             * @return The bytes for brand.
//             */
//            public com.google.protobuf.ByteString
//            getBrandBytes() {
//                java.lang.Object ref = brand_;
//                if (ref instanceof String) {
//                    com.google.protobuf.ByteString b =
//                            com.google.protobuf.ByteString.copyFromUtf8(
//                                    (java.lang.String) ref);
//                    brand_ = b;
//                    return b;
//                } else {
//                    return (com.google.protobuf.ByteString) ref;
//                }
//            }
//            /**
//             * <pre>
//             *Brand of the CPU
//             * </pre>
//             *
//             * <code>string brand = 1;</code>
//             * @param value The brand to set.
//             * @return This builder for chaining.
//             */
//            public Builder setBrand(
//                    java.lang.String value) {
//                if (value == null) { throw new NullPointerException(); }
//                brand_ = value;
//                bitField0_ |= 0x00000001;
//                onChanged();
//                return this;
//            }
//            /**
//             * <pre>
//             *Brand of the CPU
//             * </pre>
//             *
//             * <code>string brand = 1;</code>
//             * @return This builder for chaining.
//             */
//            public Builder clearBrand() {
//                brand_ = getDefaultInstance().getBrand();
//                bitField0_ = (bitField0_ & ~0x00000001);
//                onChanged();
//                return this;
//            }
//            /**
//             * <pre>
//             *Brand of the CPU
//             * </pre>
//             *
//             * <code>string brand = 1;</code>
//             * @param value The bytes for brand to set.
//             * @return This builder for chaining.
//             */
//            public Builder setBrandBytes(
//                    com.google.protobuf.ByteString value) {
//                if (value == null) { throw new NullPointerException(); }
//                checkByteStringIsUtf8(value);
//                brand_ = value;
//                bitField0_ |= 0x00000001;
//                onChanged();
//                return this;
//            }
//
//            private java.lang.Object name_ = "";
//            /**
//             * <pre>
//             *Name of the CPU
//             * </pre>
//             *
//             * <code>string name = 2;</code>
//             * @return The name.
//             */
//            public java.lang.String getName() {
//                java.lang.Object ref = name_;
//                if (!(ref instanceof java.lang.String)) {
//                    com.google.protobuf.ByteString bs =
//                            (com.google.protobuf.ByteString) ref;
//                    java.lang.String s = bs.toStringUtf8();
//                    name_ = s;
//                    return s;
//                } else {
//                    return (java.lang.String) ref;
//                }
//            }
//            /**
//             * <pre>
//             *Name of the CPU
//             * </pre>
//             *
//             * <code>string name = 2;</code>
//             * @return The bytes for name.
//             */
//            public com.google.protobuf.ByteString
//            getNameBytes() {
//                java.lang.Object ref = name_;
//                if (ref instanceof String) {
//                    com.google.protobuf.ByteString b =
//                            com.google.protobuf.ByteString.copyFromUtf8(
//                                    (java.lang.String) ref);
//                    name_ = b;
//                    return b;
//                } else {
//                    return (com.google.protobuf.ByteString) ref;
//                }
//            }
//            /**
//             * <pre>
//             *Name of the CPU
//             * </pre>
//             *
//             * <code>string name = 2;</code>
//             * @param value The name to set.
//             * @return This builder for chaining.
//             */
//            public Builder setName(
//                    java.lang.String value) {
//                if (value == null) { throw new NullPointerException(); }
//                name_ = value;
//                bitField0_ |= 0x00000002;
//                onChanged();
//                return this;
//            }
//            /**
//             * <pre>
//             *Name of the CPU
//             * </pre>
//             *
//             * <code>string name = 2;</code>
//             * @return This builder for chaining.
//             */
//            public Builder clearName() {
//                name_ = getDefaultInstance().getName();
//                bitField0_ = (bitField0_ & ~0x00000002);
//                onChanged();
//                return this;
//            }
//            /**
//             * <pre>
//             *Name of the CPU
//             * </pre>
//             *
//             * <code>string name = 2;</code>
//             * @param value The bytes for name to set.
//             * @return This builder for chaining.
//             */
//            public Builder setNameBytes(
//                    com.google.protobuf.ByteString value) {
//                if (value == null) { throw new NullPointerException(); }
//                checkByteStringIsUtf8(value);
//                name_ = value;
//                bitField0_ |= 0x00000002;
//                onChanged();
//                return this;
//            }
//
//            private int numberCores_ ;
//            /**
//             * <code>uint32 number_cores = 3;</code>
//             * @return The numberCores.
//             */
//            @java.lang.Override
//            public int getNumberCores() {
//                return numberCores_;
//            }
//            /**
//             * <code>uint32 number_cores = 3;</code>
//             * @param value The numberCores to set.
//             * @return This builder for chaining.
//             */
//            public Builder setNumberCores(int value) {
//
//                numberCores_ = value;
//                bitField0_ |= 0x00000004;
//                onChanged();
//                return this;
//            }
//            /**
//             * <code>uint32 number_cores = 3;</code>
//             * @return This builder for chaining.
//             */
//            public Builder clearNumberCores() {
//                bitField0_ = (bitField0_ & ~0x00000004);
//                numberCores_ = 0;
//                onChanged();
//                return this;
//            }
//
//            private int numberThreads_ ;
//            /**
//             * <code>uint32 number_threads = 4;</code>
//             * @return The numberThreads.
//             */
//            @java.lang.Override
//            public int getNumberThreads() {
//                return numberThreads_;
//            }
//            /**
//             * <code>uint32 number_threads = 4;</code>
//             * @param value The numberThreads to set.
//             * @return This builder for chaining.
//             */
//            public Builder setNumberThreads(int value) {
//
//                numberThreads_ = value;
//                bitField0_ |= 0x00000008;
//                onChanged();
//                return this;
//            }
//            /**
//             * <code>uint32 number_threads = 4;</code>
//             * @return This builder for chaining.
//             */
//            public Builder clearNumberThreads() {
//                bitField0_ = (bitField0_ & ~0x00000008);
//                numberThreads_ = 0;
//                onChanged();
//                return this;
//            }
//
//            private double minGhz_ ;
//            /**
//             * <code>double min_ghz = 5;</code>
//             * @return The minGhz.
//             */
//            @java.lang.Override
//            public double getMinGhz() {
//                return minGhz_;
//            }
//            /**
//             * <code>double min_ghz = 5;</code>
//             * @param value The minGhz to set.
//             * @return This builder for chaining.
//             */
//            public Builder setMinGhz(double value) {
//
//                minGhz_ = value;
//                bitField0_ |= 0x00000010;
//                onChanged();
//                return this;
//            }
//            /**
//             * <code>double min_ghz = 5;</code>
//             * @return This builder for chaining.
//             */
//            public Builder clearMinGhz() {
//                bitField0_ = (bitField0_ & ~0x00000010);
//                minGhz_ = 0D;
//                onChanged();
//                return this;
//            }
//
//            private double maxGhz_ ;
//            /**
//             * <code>double max_ghz = 6;</code>
//             * @return The maxGhz.
//             */
//            @java.lang.Override
//            public double getMaxGhz() {
//                return maxGhz_;
//            }
//            /**
//             * <code>double max_ghz = 6;</code>
//             * @param value The maxGhz to set.
//             * @return This builder for chaining.
//             */
//            public Builder setMaxGhz(double value) {
//
//                maxGhz_ = value;
//                bitField0_ |= 0x00000020;
//                onChanged();
//                return this;
//            }
//            /**
//             * <code>double max_ghz = 6;</code>
//             * @return This builder for chaining.
//             */
//            public Builder clearMaxGhz() {
//                bitField0_ = (bitField0_ & ~0x00000020);
//                maxGhz_ = 0D;
//                onChanged();
//                return this;
//            }
//            @java.lang.Override
//            public final Builder setUnknownFields(
//                    final com.google.protobuf.UnknownFieldSet unknownFields) {
//                return super.setUnknownFields(unknownFields);
//            }
//
//            @java.lang.Override
//            public final Builder mergeUnknownFields(
//                    final com.google.protobuf.UnknownFieldSet unknownFields) {
//                return super.mergeUnknownFields(unknownFields);
//            }
//
//
//            // @@protoc_insertion_point(builder_scope:CPU)
//        }
//
//        // @@protoc_insertion_point(class_scope:CPU)
//        private static final My.CPU DEFAULT_INSTANCE;
//        static {
//            DEFAULT_INSTANCE = new My.CPU();
//        }
//
//        public static My.CPU getDefaultInstance() {
//            return DEFAULT_INSTANCE;
//        }
//
//        private static final com.google.protobuf.Parser<CPU>
//                PARSER = new com.google.protobuf.AbstractParser<CPU>() {
//            @java.lang.Override
//            public CPU parsePartialFrom(
//                    com.google.protobuf.CodedInputStream input,
//                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
//                    throws com.google.protobuf.InvalidProtocolBufferException {
//                Builder builder = newBuilder();
//                try {
//                    builder.mergeFrom(input, extensionRegistry);
//                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
//                    throw e.setUnfinishedMessage(builder.buildPartial());
//                } catch (com.google.protobuf.UninitializedMessageException e) {
//                    throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
//                } catch (java.io.IOException e) {
//                    throw new com.google.protobuf.InvalidProtocolBufferException(e)
//                            .setUnfinishedMessage(builder.buildPartial());
//                }
//                return builder.buildPartial();
//            }
//        };
//
//        public static com.google.protobuf.Parser<CPU> parser() {
//            return PARSER;
//        }
//
//        @java.lang.Override
//        public com.google.protobuf.Parser<CPU> getParserForType() {
//            return PARSER;
//        }
//
//        @java.lang.Override
//        public My.CPU getDefaultInstanceForType() {
//            return DEFAULT_INSTANCE;
//        }
//
//    }
//
//    private static final com.google.protobuf.Descriptors.Descriptor
//            internal_static_CPU_descriptor;
//    private static final
//    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
//            internal_static_CPU_fieldAccessorTable;
//
//    public static com.google.protobuf.Descriptors.FileDescriptor
//    getDescriptor() {
//        return descriptor;
//    }
//    private static  com.google.protobuf.Descriptors.FileDescriptor
//            descriptor;
//    static {
//        java.lang.String[] descriptorData = {
//                "\n\010my.proto\"r\n\003CPU\022\r\n\005brand\030\001 \001(\t\022\014\n\004name" +
//                        "\030\002 \001(\t\022\024\n\014number_cores\030\003 \001(\r\022\026\n\016number_t" +
//                        "hreads\030\004 \001(\r\022\017\n\007min_ghz\030\005 \001(\001\022\017\n\007max_ghz" +
//                        "\030\006 \001(\001b\006proto3"
//        };
//        descriptor = com.google.protobuf.Descriptors.FileDescriptor
//                .internalBuildGeneratedFileFrom(descriptorData,
//                        new com.google.protobuf.Descriptors.FileDescriptor[] {
//                        });
//        internal_static_CPU_descriptor =
//                getDescriptor().getMessageTypes().get(0);
//        internal_static_CPU_fieldAccessorTable = new
//                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
//                internal_static_CPU_descriptor,
//                new java.lang.String[] { "Brand", "Name", "NumberCores", "NumberThreads", "MinGhz", "MaxGhz", });
//    }
//
//    // @@protoc_insertion_point(outer_class_scope)
//}
//
