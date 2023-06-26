package com.haloz.springboot.controller;

import com.haloz.springboot.payload.SendingObject;
import com.haloz.springboot.producer.Producer;
import com.haloz.springboot.producer.TroubleProducer;
import org.springframework.stereotype.Service;

@Service
public class ProducerController {
    private final Producer producer;
    private final TroubleProducer troubleProducer;

    public ProducerController(Producer producer, TroubleProducer troubleProducer) {
        this.producer = producer;
        this.troubleProducer = troubleProducer;
    }

    public void sendMessage(String message) {
        troubleProducer.sendMessage(message);
    }
    public void sendMessage(SendingObject data) {
        producer.sendMessage(data);
    }
}
