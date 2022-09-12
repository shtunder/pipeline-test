package com.example.pipeline.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // Some changes
    @GetMapping("/hello")
    public String hello(){
        return "Demo application with Spring Boot!";
    }


}
