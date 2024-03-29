package com.haloz.springboot.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.haloz.springboot.handler.CustomProductionExceptionHandler;
import com.haloz.springboot.payload.SendingObject;
import com.haloz.springboot.producer.Producer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.*;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.config.KafkaStreamsConfiguration;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class StreamConfig {
//    @Autowired
//    private Producer producer;
    private final static Logger LOGGER = LoggerFactory.getLogger(StreamConfig.class);
    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public KafkaStreamsConfiguration kStreamsConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "myGroup");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(ConsumerConfig.CLIENT_ID_CONFIG, "client");
        //props.put(ConsumerConfig.GROUP_ID_CONFIG, "myGroup");
        //props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        //props.put(StreamsConfig.DEFAULT_PRODUCTION_EXCEPTION_HANDLER_CLASS_CONFIG, CustomProductionExceptionHandler.class);
        return new KafkaStreamsConfiguration(props);
    }

    @Bean
    public KStream<String, String> kStream(StreamsBuilder kStreamBuilder) {
        KStream<String, String> stream = kStreamBuilder
                .stream("topic-a", Consumed.with(Serdes.String(), Serdes.String())); // src - name of the enter topic, reading in come msg
        // logic
        KStream<String, String> userStream = stream //String
                .filter((key, value) -> {
                    try {
                        SendingObject so = new SendingObject(value);
                        return true;
                    }catch (Exception e) {
                        return false;
                    }
                })
                .peek((key, value) -> LOGGER.info("Event message is read <- " + value))
                .mapValues(k -> {
                    SendingObject so = new SendingObject(k);
                    return so.toString(); //.toString()

                })
                .peek((key, value) -> LOGGER.info("Event message is sent -> " + value));
        //out
        userStream.to("topic-b");

        //test out
        //userStream.foreach((key, value) -> producer.sendMessage(value));

        return userStream;

    }
    @Bean
    public KStream<String, String> kTroubleStream(StreamsBuilder kStreamBuilder) {
        KStream<String, String> stream = kStreamBuilder
                .stream("topic-a", Consumed.with(Serdes.String(), Serdes.String())); // src - name of the enter topic, reading in come msg
        //logic
        KStream<String, String> userStream = stream
                .filter((key, value) -> {
                    try {
                        SendingObject so = new SendingObject(value);
                        return false;
                    }catch (Exception e) {
                        return true;
                    }
                })
                .mapValues(k -> k);
        //out
        userStream.to("troubles");
        return userStream;
    }
}
