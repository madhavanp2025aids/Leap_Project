package com.madhavan.madhavanspringboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("hello")
    public String get() {
        return "hello world!!!";
    }

    @PostMapping("create")
    public String create(@RequestBody String payload) {
        return payload + " Item created!!!";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable String id) {
        return "Deleted " + id;
    }
}