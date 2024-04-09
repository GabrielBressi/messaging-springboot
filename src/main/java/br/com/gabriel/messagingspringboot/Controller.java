package br.com.gabriel.messagingspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class Controller {

    private Producer producer;

    public Controller(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        producer.sendMessage("Hello, "+ name);
        return "OK";
    }
}
