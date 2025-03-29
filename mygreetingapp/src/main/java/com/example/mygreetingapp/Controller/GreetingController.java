package com.example.mygreetingapp.Controller;


import com.example.mygreetingapp.Service.GreetingService;


import com.example.mygreetingapp.Service.GreetingService;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

 UC-3


 master
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
 UC-3
    public String getGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {

        return greetingService.getGreetingMessage(firstName, lastName);
    }


    public String getGreeting() {
        return greetingService.getGreetingMessage();
    }

    @GetMapping
    public String getGreeting(){
        return "Hello,this is a GET Request";
    }
 master


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
