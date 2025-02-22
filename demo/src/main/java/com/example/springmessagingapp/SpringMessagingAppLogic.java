package com.example.springmessagingapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController          //removed controller because it was a subset of restcontroller
@RequestMapping("/sayhello")

public class SpringMessagingAppLogic {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    //UC1 has been completed

  

}
