package com.example.keycloak_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    int count = 0;
    @GetMapping("/api/hello")
    public String test() {
        if(count >= 10) count = 0;
        ++count;
        return "Hello, world!" + count;
    }
}
