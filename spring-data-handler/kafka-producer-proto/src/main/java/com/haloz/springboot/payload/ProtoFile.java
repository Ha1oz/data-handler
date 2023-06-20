package com.haloz.springboot.payload;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;

public class ProtoFile {
    private UUID globalId;
    private byte[] data;

    public ProtoFile(File file) throws IOException {
        if (!file.isFile()) {
            throw new IOException("File is not found");
        }
        this.data = Files.readAllBytes(file.toPath());
        this.globalId = UUID.randomUUID(); //.nameUUIDFromBytes(data)
    }

    public UUID getGlobalId() {
        return globalId;
    }

    public byte[] getData() {
        return data;
    }
    public void setData(byte[] data) {
        this.data = data;
    }

    public void setGlobalId(UUID globalId) {
        this.globalId = globalId;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
