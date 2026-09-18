package com.madhavan.madhavanspringboot.controller;


import java.util.List;
    
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madhavan.madhavanspringboot.model.User;

@RestController 
@RequestMapping ("/api/users")
public class UserController {
    @GetMapping("{userId}")
    public User getById(@PathVariable String userId) {
        return new User(userId,"Madhavan", "Palanisamy", "madhavan@gmail.com");
    }
    

@GetMapping
    public List<User> getUsers() {

        List<User> users =  List.of(
            new User("101", "Madhan", "Palanisamy", "madhan@example.com"),
            new User("102", "Madhavan", "Palanisamy", "madhav@example.com"),
            new User("103", "Kiki", "Palanisamy", "kiki@example.com"),
            new User("104", "Keshav", "Palanisamy", "itskeshav2008@gmail.com")
        );

        return users;
    }

        
    }
