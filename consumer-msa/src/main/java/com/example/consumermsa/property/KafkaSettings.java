package com.example.consumermsa.property;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@ConfigurationProperties("kafka")
public class KafkaSettings {
    private String bootstrapServers;
    private String groupId;
    private String topic;
}
