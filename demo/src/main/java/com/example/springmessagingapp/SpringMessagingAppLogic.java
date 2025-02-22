package com.example.springmessagingapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringMessagingAppLogic {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    //UC1 has been completed


}
