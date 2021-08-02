package com.myexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @ResponseBody
    @GetMapping("/message")
    public String getStarterMessage(){
        return "Hello, this is an app with Spring boot";
    }
}
