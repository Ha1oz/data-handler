package com.haloz.springboot.payload;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.haloz.springboot.exceptions.InvalidDataException;
import com.haloz.springboot.proto.Product;
import org.apache.kafka.common.serialization.Serdes;

import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.UUID;

public class SendingObject {
    private UUID globalId;
    private final ProtoCPU data;
    public SendingObject() {
        globalId = null;
        data = null;
    }
    public SendingObject(String jsonStr) {
        //hardcore? TO DO: Change
        JsonElement jsonElement = extractField(jsonStr, "globalId");
        try {
            this.globalId = UUID.fromString(jsonElement.getAsString());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        data = new ProtoCPU(getBytesFromMessage(jsonStr));
    }
    public UUID getGlobalId() {
        return globalId;
    }

    public ProtoCPU getMessage() {
        return data;
    }
    private byte[] getBytesFromMessage(String jsonStr){
        JsonElement jsonElement = extractField(jsonStr, "data");
        int dataSize = jsonElement.getAsJsonArray().size();
        if (dataSize == 0){
            throw new InvalidDataException("Data is not found!");
        }
        byte[] bytes = new byte[jsonElement.getAsJsonArray().size()];
        //byte[] bytes = jsonElement.getAsString().getBytes(StandardCharsets.UTF_8);
        int i = 0;
        for (JsonElement j : jsonElement.getAsJsonArray()){ //(JsonElement j : jsonElement.getAsJsonArray())
            bytes[i] = j.getAsByte();
            i++;
        }
        System.out.println();
        return bytes;
    }
    private JsonElement extractField(String from ,String fieldName) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);
        return jsonObject.get(fieldName);
    }
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
