package com.haloz.springboot.payload;

import com.google.gson.Gson;
import com.google.protobuf.ByteString;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

public class SendingObject {
    private final UUID globalId;
    private final byte[] data;
    public SendingObject(File file) throws IOException {
        if (!file.isFile()) {
            throw new IOException("File is not found");
        }
        byte[] bytes = Files.readAllBytes(file.toPath());

        this.data = bytes;
        this.globalId = UUID.randomUUID();
    }

    public UUID getGlobalId() {
        return globalId;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
