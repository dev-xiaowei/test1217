package cn.itcast.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private Environment environment;

    @GetMapping("/info")
    public String sayHello(){
        return "Hello SpringBoot." + environment.getProperty("url");
    }
}
