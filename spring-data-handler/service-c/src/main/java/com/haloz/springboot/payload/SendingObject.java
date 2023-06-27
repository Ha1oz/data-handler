package com.haloz.springboot.payload;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.haloz.springboot.base.NewsletterBase;
import org.springframework.beans.factory.annotation.Value;

import java.nio.file.Files;
import java.util.UUID;

public class SendingObject {
    private UUID globalId;
    private final JsonObject data;
    private final String receiver;
    public SendingObject(String jsonStr) {
        //hardcore? TO DO: Change
        JsonElement jsonElement = extractField(jsonStr, "globalId");
        try {
            this.globalId = UUID.fromString(jsonElement.getAsString());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        jsonElement = extractField(jsonStr,"data");
        data = jsonElement.getAsJsonObject();

        NewsletterBase newsletterBase = new NewsletterBase();
        JsonElement propertyId = data.get("receiverId");
        receiver = newsletterBase.getNewsletter("receiver", propertyId.getAsString());

    }
    public UUID getGlobalId() {
        return globalId;
    }
    public JsonObject getData() {
        return data;
    }

    public String getReceiver() {
        return receiver;
    }

    public void enrichData(String baseKey, String property) {
        NewsletterBase newsletterBase = new NewsletterBase();
        JsonElement propertyId = data.get(property);
        String res = newsletterBase.getNewsletter(baseKey, propertyId.getAsString());
        //TO DO: is it normal?
        if (res == null) {
            res = "null";
        }
        data.addProperty("receiver", res);
    }
    private JsonElement extractField(String from, String fieldName) {
        JsonObject jsonObject = new Gson().fromJson(from, JsonObject.class);
        return jsonObject.get(fieldName);
    }
    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
