package com.hackathon.kafka.client;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static com.hackathon.kafka.TopicConfiguration.WORD_COUNT_TOPIC_NAME;

@Component
public class Consumer {

    /* @KafkaListener(topics= {"hobbit"}, groupId="hackathon-kafka")
    public void consumeFromHobbit(ConsumerRecord<Integer, String> record) {
        System.out.println("received= " + record.value() + " with key " + record.key());
    }*/

    @KafkaListener(topics= {WORD_COUNT_TOPIC_NAME}, groupId="hackathon-kafka")
    public void consumeFromWordCount(ConsumerRecord<String, Long> record) {
        System.out.println("received= " + record.value() + " with key " + record.key());
    }
}
