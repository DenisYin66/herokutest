package com.example.herokutest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "/")
    public String sayHello(){
        return "hello12mndscn";
    }
}
