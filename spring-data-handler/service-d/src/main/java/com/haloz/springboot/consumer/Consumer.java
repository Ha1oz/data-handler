package com.haloz.springboot.consumer;

import com.haloz.springboot.entities.ClientCpu;
import com.haloz.springboot.entities.ClientCpuFullImpl;
import com.haloz.springboot.entities.ClientCpuImpl;
import com.haloz.springboot.payload.SendingObject;
import com.haloz.springboot.producer.Producer;
import com.haloz.springboot.service.ClientConverter;
import com.haloz.springboot.utils.GetData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
//    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
//    private final Producer producer;
//
//    public Consumer(Producer producer, ClientConverter clientConverter) {
//        this.producer = producer;
//    }
//
//    @KafkaListener(
//            topics = "${spring.kafka.topic.name}",
//            groupId = "${spring.kafka.consumer.group-id}"
//    )
//    public void consume(String eventMessage) {
//        LOGGER.info(String.format("Event message received -> %s", eventMessage));
//        try {
//            SendingObject sendingObject = new SendingObject(eventMessage, ClientCpuFullImpl.class);
//            producer.sendMessage(sendingObject);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
