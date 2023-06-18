package com.haloz.datahandlerkafka.kafka;

import com.haloz.datahandlerkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "kafkaTopicTestJson", groupId="myGroup")
    public void consume(User data) {
        LOGGER.info(String.format("JSON Message received -> %s", data));
    }
}
