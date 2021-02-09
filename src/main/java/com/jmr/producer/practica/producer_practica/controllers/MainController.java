package com.jmr.producer.practica.producer_practica.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class MainController {

    @GetMapping
    public String test()
    {
        return "Just a test";
    }
}
