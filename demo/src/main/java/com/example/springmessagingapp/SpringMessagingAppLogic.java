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
    @PostMapping("/post")
    public String sayhello(@RequestBody UserClass user){
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz!!";

    }
    //UC4 has been completed
    @PutMapping("/put/{firstName}")
    public String putMethod(@PathVariable String firstName,@RequestParam(value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName+" from bridgeLabz!!";
    }
    //UC5 has been completed
}
