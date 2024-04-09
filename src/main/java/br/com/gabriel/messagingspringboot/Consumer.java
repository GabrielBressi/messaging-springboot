package br.com.gabriel.messagingspringboot;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "hello-topic", groupId = "group-1")
    public void receiveMessage(String msg) {
        System.out.println("Consumer Message: " + msg);
    }
}
