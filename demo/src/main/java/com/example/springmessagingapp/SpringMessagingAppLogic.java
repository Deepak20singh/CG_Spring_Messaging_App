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

    @GetMapping("/query")
    public String sayhello(@RequestParam(value="name")String name){
        return "Hello "+name+"! from BridgeLabz...";
    }
   //UC2 has been completed

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "! from BridgeLabz...";
    }
//UC3 has been completed
}
