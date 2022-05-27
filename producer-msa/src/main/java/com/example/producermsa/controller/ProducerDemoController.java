package com.example.producermsa.controller;

import com.example.producermsa.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerDemoController {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/demo/produce")
    public void produce() {
        kafkaProducer.sendMessage("id", "hello");
    }

}
