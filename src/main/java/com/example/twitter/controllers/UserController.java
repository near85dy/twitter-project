package com.example.twitter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @GetMapping("/users")
    public String getUser()
    {
        return "users";
    }
}
