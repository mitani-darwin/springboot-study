package com.daisuke2.springboot.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloApplicationController {

    @GetMapping("/hello")
    public String test() {
        return "Hello World";
    }
}
