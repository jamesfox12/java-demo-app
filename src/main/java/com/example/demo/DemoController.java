package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class DemoController {
    public String hello() {
        return "Hello World";
    }
}