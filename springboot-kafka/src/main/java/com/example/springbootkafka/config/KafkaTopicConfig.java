package com.example.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author YangLiming
 */
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic firstDemoTopic() {
        return TopicBuilder.name("firstDemo")
                // .partitions(10)
                .build();
    }

    @Bean
    public NewTopic JsonTopic() {
        return TopicBuilder.name("Demo_JSON")
                // .partitions(10)
                .build();
    }
}
