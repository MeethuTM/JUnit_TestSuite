package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class HelloWorldController {

    @Autowired
    HelloService helloService;

    String events;
    @RequestMapping("/")
    public String hello() throws IOException {
        //System.out.println("hiiiiii"+helloService.readFile());
        helloService.readFile();
        helloService.writeFile();
        helloService.addFiled();
        return "Welcome to the application......";
    }

}
