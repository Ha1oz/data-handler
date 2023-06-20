package com.haloz.springboot;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.protobuf.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaProtoConsumer {
    private final static Logger LOGGER = LoggerFactory.getLogger(KafkaProtoConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(String eventMessage) {
        LOGGER.info(String.format("Event message received -> %s", eventMessage));
        // json to byte string service
        try {
            parseJsonToByte(eventMessage);
            LOGGER.info(String.format("DATA -> %s", parseJsonToByte(eventMessage).toStringUtf8()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private ByteString parseJsonToByte(String stringJson) {
        JsonObject jsonObject = new Gson().fromJson(stringJson, JsonObject.class);
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
