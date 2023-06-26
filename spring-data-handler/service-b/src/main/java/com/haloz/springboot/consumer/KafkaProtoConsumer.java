package com.haloz.springboot.consumer;

import com.haloz.springboot.payload.SendingObject;
import com.haloz.springboot.utils.Parser;
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
            SendingObject sendingObject = new SendingObject(eventMessage);
            LOGGER.info(String.format("DATA -> %s", sendingObject));
        } catch (Exception e) {
            e.printStackTrace();
            // send to another topic: troubles
        }
    }
}
