package com.haloz.springboot.config;

import com.haloz.springboot.tracker.FileMonitor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Value("${spring.kafka.topic.name}")
    private String topicName;
    @Value("${spring.kafka.interval.time}")
    private Integer interval;
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(topicName)
                .build();
    }
    @Bean
    public FileMonitor fileMonitor() {
        return new FileMonitor(interval);
    }
}
