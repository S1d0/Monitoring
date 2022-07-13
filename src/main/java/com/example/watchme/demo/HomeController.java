package com.example.watchme.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HomeController {
    
    @GetMapping
    public String hello() {
        return "Hello";
    }
}
