package com.haloz.springboot.consumer;

import com.haloz.springboot.controller.ProducerController;
import com.haloz.springboot.payload.SendingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
//    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
//    private final ProducerController producerController;
//
//    public Consumer(ProducerController producerController) {
//        this.producerController = producerController;
//    }
//
//    @KafkaListener(
//            topics = "${spring.kafka.topic.name}",
//            groupId = "${spring.kafka.consumer.group-id}"
//    )
//    public void consume(String eventMessage) {
//        LOGGER.info(String.format("Event message received -> %s", eventMessage));
//        try {
//            SendingObject sendingObject = new SendingObject(eventMessage);
//            producerController.sendMessage(sendingObject);
//        } catch (Exception e) {
//            producerController.sendMessage(eventMessage);
//            e.printStackTrace();
//        }
//    }
}
