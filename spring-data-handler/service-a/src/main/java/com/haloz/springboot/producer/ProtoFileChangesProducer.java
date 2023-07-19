package com.haloz.springboot.producer;

import com.google.gson.Gson;
import com.haloz.springboot.payload.SendingObject;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.lang.NonNull;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
public class ProtoFileChangesProducer {
    @Value("${spring.kafka.topic.name}")
    private String topicName;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProtoFileChangesProducer.class);
    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProtoFileChangesProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @NonNull
    public void sendProto(SendingObject sendingObject) {
//                Message<SendingObject> message = MessageBuilder
//                .withPayload(sendingObject)
//                .setHeader(KafkaHeaders.TOPIC, topicName)
//                .build();
        kafkaTemplate.send(topicName, sendingObject.toString());
        LOGGER.info(String.format("File sent -> %s", sendingObject));
    }

}
