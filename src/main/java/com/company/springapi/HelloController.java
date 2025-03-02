package com.company.springapi;

//UC5
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @PutMapping("/put/{firstName}")
    public String putHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}
//curl -X PUT "http://localhost:8080/hello/put/Mark?lastName=Taylor" -w "\n" on cmd,terminal

// Alternative: Test in Browser (Postman)
//Open Postman.
//Set Method to PUT.
//Enter URL:
//bash
//Copy
//Edit
//http://localhost:8080/hello/put/Mark?lastName=Taylor
//Click Send.

//for powershell terminal
//Invoke-WebRequest -Uri "http://localhost:8080/hello/put/Mark?lastName=Taylor" `
//-Method Put `
//-UseBasicParsing


//UC4
//import org.springframework.web.bind.annotation.*;
//
//@RestController  // Marks this class as a REST Controller
//@RequestMapping("/hello")  // Base URL for all API calls
//public class HelloController {
//
//    @PostMapping("/post")  // Handles POST request
//    public String sayHello(@RequestBody UserDTO user) {
//        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
//    }
//}
//Invoke-WebRequest -Uri "http://localhost:8080/hello/post" `
//-Method POST `
//-Headers @{"Content-Type"="application/json"} `
//-Body '{"firstName": "Anshita", "lastName": "Agrawal"}' `
//-UseBasicParsing

//Using Postman
//Use Postman
//Open Postman.
//Set method to POST.
//Enter URL:
//bash
//Copy
//Edit
//http://localhost:8080/hello/post
//Go to Body → Raw → JSON.
//Paste:
//json
//Copy
//Edit
//{
//  "firstName": "Mark",
//  "lastName": "Taylor"
//}
//Click Send.
//Expected Output
//If your Spring Boot application is running, the response should be:
//
//css
//Copy
//Edit
//Hello Mark Taylor from BridgeLabz!
//Make sure your Spring Boot application is running before executing the command.

//UC3
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController  // Marks this class as a REST Controller
//@RequestMapping("/hello")  // Base URL for all API calls
//public class HelloController {
//
//    @GetMapping("/param/{name}")  // Handles GET request with a path variable
//    public String sayHello(@PathVariable String name) {
//        return "Hello " + name + " from BridgeLabz!";
//    }
//}
//curl localhost:8080/hello/param/Anshita -w "\n"


//UC2
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController  // Marks this class as a REST API Controller
//@RequestMapping("/hello")  // Base URL for all API calls
//public class HelloController {
//
//    @GetMapping("/query")  // Handles GET request with a query parameter
//    public String sayHello(@RequestParam String name) {
//        return "Hello " + name + " from BridgeLabz!";
//    }
//}
//http://localhost:8080/hello/query?name=Mark




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
//curl localhost:8080/api/hello -w "\n"
