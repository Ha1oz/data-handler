package com.haloz.springboot.config;

import com.haloz.springboot.payload.SendingObject;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.TopicConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.config.KafkaStreamsConfiguration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class StreamConfig {
    private final static Logger LOGGER = LoggerFactory.getLogger(StreamConfig.class);
    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public KafkaStreamsConfiguration kStreamsConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "myGroup-1");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        //props.put(ConsumerConfig.CLIENT_ID_CONFIG, "client");
        //props.put(ConsumerConfig.ISOLATION_LEVEL_CONFIG, "read_committed");
//        props.put(StreamsConfig.topicPrefix(TopicConfig.MIN_IN_SYNC_REPLICAS_CONFIG), 2);
//        props.put(StreamsConfig.producerPrefix(ProducerConfig.ACKS_CONFIG), "all");
//        props.put(StreamsConfig.NUM_STANDBY_REPLICAS_CONFIG, 1);
//        props.put(StreamsConfig.MAX_TASK_IDLE_MS_CONFIG, 0);
        //props.put(ConsumerConfig.GROUP_ID_CONFIG, "myGroup");
        //props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        return new KafkaStreamsConfiguration(props);
    }

    @Bean
    public KStream<String, String> kStream(StreamsBuilder kStreamBuilder) {
        KStream<String, String> stream = kStreamBuilder
                .stream("topic-b", Consumed.with(Serdes.String(), Serdes.String()));
        // logic
        KStream<String, String> userStream = stream
                .peek((key, value) -> LOGGER.info("Event message is read <- " + value))
                .mapValues(value -> {
                    SendingObject so = new SendingObject(value);
                    return so.toString();
                })
                .peek((key, value) -> LOGGER.info("Event message is sent -> " + value));
        //out
        userStream.to("topic-c");
        return userStream;

    }
}
