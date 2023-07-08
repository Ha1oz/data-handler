package com.haloz.springboot.config;

import com.haloz.springboot.file.FileController;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
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
    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public KafkaStreamsConfiguration kStreamsConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "myGroup-3");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        //props.put(StreamsConfig.DEFAULT_PRODUCTION_EXCEPTION_HANDLER_CLASS_CONFIG, CustomProductionExceptionHandler.class);
        return new KafkaStreamsConfiguration(props);
    }

    @Bean
    public String writeStream(StreamsBuilder kStreamBuilder) {
        KStream<String, String> stream = kStreamBuilder
                .stream("topic-d", Consumed.with(Serdes.String(), Serdes.String())); // src - name of the enter topic, reading in come msg
        // logic
        stream.foreach((key, value) -> writeJsonToFile(value));
//        KStream<String, String> userStream = stream.peek((key, value) -> writeJsonToFile(value));
//                .mapValues(k -> {
//                    SendingObject so = new SendingObject(k, ClientCpuFullImpl.class);
//                    return so.toString();
//                });
        return "Event message past";
    }
    private void writeJsonToFile(String msg) {
        FileController fileController = new FileController();
        try {
            fileController.writeFile(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
