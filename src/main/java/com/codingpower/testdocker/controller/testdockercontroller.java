package com.codingpower.testdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testdockercontroller {
    @GetMapping("/message")
    public String getMessage(){
        return "TEST Dockerrization";
    }

}
