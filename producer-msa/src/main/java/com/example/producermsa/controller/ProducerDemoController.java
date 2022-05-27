package com.example.producermsa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerDemoController {

    @PostMapping("/demo/produce")
    public void produce() {

    }

}
