package com.example.mygreetingapp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting(){
        return "Hello,this is a GET Request";
    }

    @PostMapping
    public String postGreeting(@RequestBody(required = false) String name) {
        return "Hello, this is a POST request! Received: " + (name != null ? name : "No name provided");
    }

    @PutMapping
    public String putGreeting(@RequestBody(required = false) String name) {
        return "Hello, this is a PUT request! Updated: " + (name != null ? name : "No name provided");
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "Hello, this is a DELETE request!";
    }

}
