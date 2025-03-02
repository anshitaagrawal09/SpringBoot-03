package com.company.springapi;

//UC2
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/hello")  // Base URL for all API calls
public class HelloController {

    @GetMapping("/query")  // Handles GET request with a query parameter
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz!";
    }
}




//UC1
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController  // Marks this class as a REST Controller
//@RequestMapping("/api")  // Base URL for all API calls
//public class HelloController {
//
//    @GetMapping("/hello")  // Handles HTTP GET request to /api/hello
//    public String sayHello() {
//        return "Hello from Spring API!";
//    }
//}
