package com.haloz.springboot.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.ByteString;

public class Parser {
    public static ByteString getDataFromMessage(String message) {
        JsonObject jsonObject = new Gson().fromJson(message, JsonObject.class);
        JsonElement jsonElement = jsonObject.get("data");
        byte[] bytes = new byte[jsonElement.getAsJsonArray().size()];


        int i = 0;
        for (JsonElement j : jsonElement.getAsJsonArray()) {
            bytes[i] = j.getAsByte();
            i++;
        }
        //ByteString byteString = ByteString.copyFrom(bytes);
        return ByteString.copyFrom(bytes);
    }
}
