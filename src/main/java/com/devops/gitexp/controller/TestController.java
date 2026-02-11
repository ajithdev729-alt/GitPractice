package com.devops.gitexp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
