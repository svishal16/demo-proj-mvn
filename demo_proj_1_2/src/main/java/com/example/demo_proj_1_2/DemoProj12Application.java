package com.example.demo_proj_1_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoProj12Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoProj12Application.class, args);
    }
}

@RestController
@RequestMapping("/api")
class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Secure World!";
    }
}
