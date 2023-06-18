package com.haloz.datahandlerkafka.config;

import com.haloz.datahandlerkafka.kafka.KafkaProducer;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic kafkaTopic() {
        return TopicBuilder.name("kafkaTopicTest")
                .build();
    }
    @Bean
    public NewTopic kafkaTopicJson() {
        return TopicBuilder.name("kafkaTopicTestJson")
                .build();
    }
}
