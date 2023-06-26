package com.haloz.springboot.payload;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.haloz.springboot.proto.Product;
import org.apache.kafka.common.serialization.Serdes;

import java.util.UUID;

public class SendingObject {
    private UUID globalId;
    private final ProtoCPU data;

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
    private byte[] getBytesFromMessage(String jsonStr) {
        JsonElement jsonElement = extractField(jsonStr, "data");
        byte[] bytes = new byte[jsonElement.getAsJsonArray().size()];

        int i = 0;
        for (JsonElement j : jsonElement.getAsJsonArray()) {
            bytes[i] = j.getAsByte();
            i++;
        }
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
