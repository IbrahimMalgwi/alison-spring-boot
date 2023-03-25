package com.example.springbootapp.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Pabir")
public class GreetingServicePabir implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Usa " + name;
    }
}
