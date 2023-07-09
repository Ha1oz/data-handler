package com.haloz.springboot.handler;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.streams.errors.ProductionExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CustomProductionExceptionHandler implements ProductionExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomProductionExceptionHandler.class);
    @Override
    public ProductionExceptionHandler.ProductionExceptionHandlerResponse handle(final ProducerRecord<byte[], byte[]> record,
                                                                                final Exception exception) {
        LOGGER.error("Kafka message marked as processed although it failed. Message: [{}], destination topic: [{}]",  new String(record.value()), record.topic(), exception);
        return ProductionExceptionHandlerResponse.CONTINUE;
    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}
