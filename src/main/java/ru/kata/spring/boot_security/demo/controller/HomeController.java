package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/user")
    public String userPage(){
        return "user";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "admin";
    }
}
