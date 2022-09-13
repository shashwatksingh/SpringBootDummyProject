package com.shashwatksingh.project1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping(path = "/")
//    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

}
