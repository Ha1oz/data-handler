package com.haloz.springboot.producer;

import com.haloz.springboot.payload.SendingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
@Service
public class Producer {
//    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }
//
//    public void sendMessage(String data) {
////        Message<SendingObject> message = MessageBuilder
////                .withPayload(data)
////                .setHeader(KafkaHeaders.TOPIC, "topic-b")
////                .build();
//        kafkaTemplate.send("topic-b", data);
//        LOGGER.info(String.format("Message sent -> %s", data));
//    }
}
