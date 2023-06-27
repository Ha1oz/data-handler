package com.haloz.springboot.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class GetData {
    public static String json(String from, String fieldName) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);
        JsonElement jsonElement = jsonObject.get(fieldName);
        return jsonElement.getAsString();
    }
    public static String jsonOneDepth(String from, String fieldName) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);
        JsonElement jsonElement = jsonObject.get(fieldName);
        return jsonElement.getAsJsonObject().toString();
    }
}
