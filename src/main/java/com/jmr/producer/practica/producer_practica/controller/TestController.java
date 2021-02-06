package com.jmr.producer.practica.producer_practica.controller;

import com.jmr.producer.practica.producer_practica.model.Bass;
import com.jmr.producer.practica.producer_practica.repository.BassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    BassRepository bassRepository;

    @GetMapping("/test")
    public String test(@RequestParam(value = "name")String name)
    {
        return "Hello! ".concat(name);
    }

    @GetMapping("/getAll")
    public List<Bass> getAll()
    {
        return bassRepository.findAll();

    }



}
