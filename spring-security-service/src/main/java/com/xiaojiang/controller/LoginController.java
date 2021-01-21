package com.xiaojiang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class LoginController {
    @GetMapping(value = "/login")
    public String login(){
        return "hello";
    }

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "welcome";
    }

}
