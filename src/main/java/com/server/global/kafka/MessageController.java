package com.server.global.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;

    @PostMapping("/send")
    public void sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage("my_topic", message);
    }
}
