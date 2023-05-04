package com.example.SpringApp3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class userController {

    @GetMapping("/user")
    public String usermapping(){
        String msg = "Redirected to user mapping method";
        return msg;
    }
}
