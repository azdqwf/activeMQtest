package com.example.activemqtest;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @JmsListener(destination = "standalone.queue")
    public void consume(String message) {
        System.out.println("Recieved message " + message);
    }
}
