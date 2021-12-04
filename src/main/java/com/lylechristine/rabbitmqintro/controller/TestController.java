package com.lylechristine.rabbitmqintro.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lylechristine.rabbitmqintro.sender.QueueSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    public TestController(RabbitTemplate queueSender) {
        this.queueSender = queueSender;
    }

    private final RabbitTemplate queueSender;

    @GetMapping
    public String send() throws JsonProcessingException {
        queueSender.convertAndSend("lylio-exchange", "routing-key-lylio", "lyle sends a message");
        return "okey doke, done";
    }


}
