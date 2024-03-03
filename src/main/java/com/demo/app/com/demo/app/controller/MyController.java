package com.demo.app.com.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Welcome  to Jenkins world : " +name +"!";
    }
}
