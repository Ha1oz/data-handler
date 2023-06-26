package com.haloz.springboot.consumer;

import com.haloz.springboot.payload.SendingObject;
import com.haloz.springboot.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
    private final Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(String eventMessage) {
        LOGGER.info(String.format("Event message received -> %s", eventMessage));
        try {
            SendingObject sendingObject = new SendingObject(eventMessage);
            sendingObject.enrichData();
            producer.sendMessage(sendingObject);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
