package com.devops.gitexp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")

public class TestController {

    @GetMapping("/test1")
    public String test1(){
        String temp = "test1";
        return "test";
    }

    @GetMapping("/test2")
    public String test(int no){
        String temp = "test "+no;
        return "test";
    }

    @GetMapping("/get/{message}")
    public String getter(@PathVariable String message){
        return message;
    }

    @PostMapping("/post/{message}")
    public String poster(@PathVariable String message){
        return message+"posted";
    }

}