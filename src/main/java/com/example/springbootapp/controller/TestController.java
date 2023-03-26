package com.example.springbootapp.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class TestController {

    @RequestMapping(value = "welcome/{name}", method = RequestMethod.GET)
    public String welcome(@PathVariable(value = "") String name){
        return "Hi welcome " + name;
    }
}
