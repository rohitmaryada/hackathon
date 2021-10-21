package com.hackathon.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

    // Topics after creation will be updated if same name is used.
    @Bean
    public NewTopic hackathonKafka10221Wordcount() {
        return TopicBuilder.name("hackathon_kafka-10_22_1_wordcount")
                .partitions(3)
                .replicas(3)
                .compact()
                .build();
    }
}
