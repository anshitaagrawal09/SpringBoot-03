package com.company.springapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST Controller
@RequestMapping("/api")  // Base URL for all API calls
public class HelloController {

    @GetMapping("/hello")  // Handles HTTP GET request to /api/hello
    public String sayHello() {
        return "Hello from Spring API!";
    }
}
