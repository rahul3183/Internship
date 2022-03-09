package com.spring.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld{

    @GetMapping("/")
    public String HelloWord(){
        return "Hello World";
    }

}