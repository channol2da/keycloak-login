package com.example.keycloak_login.controller;

import com.example.keycloak_login.VO.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }

    @PostMapping("/api/login")
    public String login(@RequestBody UserVO user){
        System.out.println("================");
        System.out.println("id:" + user.id);
        System.out.println("pw:" + user.password);
        return "";
    }
}
