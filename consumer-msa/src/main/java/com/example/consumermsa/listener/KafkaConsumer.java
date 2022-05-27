package com.example.consumermsa.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "${kafka.topic}")
    public void demoTopicListener(ConsumerRecord<String, String> record) {
        System.out.println("key: " + record.key() + ", value: " + record.value());
    }
}
