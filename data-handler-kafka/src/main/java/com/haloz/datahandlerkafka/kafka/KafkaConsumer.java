package com.haloz.datahandlerkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(org.apache.kafka.clients.consumer.KafkaConsumer.class);
    @KafkaListener(topics = "kafkaTestTopic", groupId = "myGroup")
    public void consume(String msg) {
        LOGGER.info(String.format("Message received -> %s", msg));
    }
}
