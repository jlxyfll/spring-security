package com.xiaojiang.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/hello")
public class Hello {
    @GetMapping(value = "/sayHello/{name}")
    public String sayHello(@PathVariable(value = "name") String name){
        return "Hello,"+name+"!";
    }
}
