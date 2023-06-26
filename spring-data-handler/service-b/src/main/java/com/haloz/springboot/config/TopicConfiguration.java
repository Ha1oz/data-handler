package com.haloz.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {
    @Value("${spring.kafka.topic.new.name}")
    private String newTopicName;
    @Value("${spring.kafka.topic.troubles.name}")
    private String troubleTopicName;

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(newTopicName)
                .build();
    }
    @Bean
    public NewTopic troublesTopic() {
        return TopicBuilder.name(troubleTopicName)
                .build();
    }

}
