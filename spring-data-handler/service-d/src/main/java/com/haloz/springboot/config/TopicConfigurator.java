package com.haloz.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfigurator {
    @Value("${spring.kafka.topic.new.name}")
    private String newTopicName;
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(newTopicName)
                .build();
    }
}
