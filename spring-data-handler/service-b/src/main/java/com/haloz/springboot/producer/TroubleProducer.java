package com.haloz.springboot.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class TroubleProducer {
//    @Value("${spring.kafka.topic.troubles.name}")
//    private String troubleTopicName;
//    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public TroubleProducer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(String data) {
//        kafkaTemplate.send(troubleTopicName, data);
//        LOGGER.info(String.format("Trouble message sent -> %s", data));
//    }
}
