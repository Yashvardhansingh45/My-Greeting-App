package com.example.mygreetingapp.Service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

UC-3
    public String getGreetingMessage(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        } else {
            return "Hello World";
        }

    public String getGreetingMessage() {
        return "Hello World";
 master
    }
}
