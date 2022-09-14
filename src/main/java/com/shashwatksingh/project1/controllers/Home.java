package com.shashwatksingh.project1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class Home {

    @Value("${some.config}")
    private String configString;
    @GetMapping(path = "/")
//    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World with an update!" + configString;
    }

}
