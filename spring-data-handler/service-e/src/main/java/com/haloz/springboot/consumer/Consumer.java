package com.haloz.springboot.consumer;

import com.haloz.springboot.file.FileController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
//    private final static Logger LOGGER = LoggerFactory.getLogger(Consumer.class);
//    private final FileController fileController;
//
//    public Consumer(FileController fileController) {
//        this.fileController = fileController;
//    }
//
//    @KafkaListener(
//            topics = "${spring.kafka.topic.name}",
//            groupId = "${spring.kafka.consumer.group-id}"
//    )
//    public void consume(String eventMessage) {
//        LOGGER.info(String.format("Event message received -> %s", eventMessage));
//        try {
//            fileController.writeFile(eventMessage);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
