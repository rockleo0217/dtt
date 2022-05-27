package com.example.producermsa.service;

import com.example.producermsa.entity.kafka.KafkaMessage;
import com.example.producermsa.property.KafkaSettings;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate kafkaTemplate;
    private final KafkaSettings kafkaSettings;

    public void sendMessage(final String key, final String value) {
        kafkaTemplate.send(kafkaSettings.getTopic(), key, value)
                .addCallback(new ListenableFutureCallback() {
                    @Override
                    public void onFailure(Throwable ex) {
                        log.error("send message failed.", ex);
                    }

                    @Override
                    public void onSuccess(Object result) {
                        log.info("send success. result:{}", result);
                    }
                });
    }
}
