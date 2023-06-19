package com.haloz.springboot;

import com.haloz.springboot.payload.ProtoFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProtoFileChangesProducer {
    @Value("${spring.kafka.topic.name}")
    private String topicName;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProtoFileChangesProducer.class);
    private final KafkaTemplate<String, String> kafkaTemplate;

    public ProtoFileChangesProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendProto(ProtoFile protoFile) {
//        ProtoFile protoFile = null;
//        try {
//            protoFile = new ProtoFile(new File("F:\\Oleg\\EIKO.png"));
//
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
        assert protoFile != null;
//        Message<ProtoFile> message = MessageBuilder
//                .withPayload(protoFile)
//                .setHeader(KafkaHeaders.TOPIC, topicName)
//                .build();
        kafkaTemplate.send(topicName, protoFile.toString());
        //kafkaTemplate.send(topicName, protoFile.toString());
        LOGGER.info(String.format("File sent -> %s", protoFile.getGlobalId()));
    }

}
