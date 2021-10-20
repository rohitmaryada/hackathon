package com.hackathon.kafka.client;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics= {"hobbit"}, groupId="hackathon-kafka")
    public void consume(ConsumerRecord<Integer, String> record) {
        System.out.println("received= " + record.value() + " with key " + record.key());
    }
}
