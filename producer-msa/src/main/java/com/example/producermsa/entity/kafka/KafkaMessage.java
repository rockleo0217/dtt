package com.example.producermsa.entity.kafka;

import lombok.Data;

@Data
public class KafkaMessage {
    private String key;
    private String value;
}
