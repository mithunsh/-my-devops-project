package com.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return "SUCCESS: CI/CD with Jenkins + Docker Working!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
