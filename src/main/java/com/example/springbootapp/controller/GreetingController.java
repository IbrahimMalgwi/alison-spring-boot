package com.example.springbootapp.controller;

import com.example.springbootapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/")
@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(path = "hello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable(value = "name") String name){
        return greetingService.sayHello(name);
    }
}
