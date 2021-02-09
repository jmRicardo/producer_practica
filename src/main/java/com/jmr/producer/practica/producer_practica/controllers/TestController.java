package com.jmr.producer.practica.producer_practica.controllers;

import com.jmr.producer.practica.producer_practica.models.Bass;
import com.jmr.producer.practica.producer_practica.repositories.BaseRepository;
import com.jmr.producer.practica.producer_practica.repositories.BassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    BassRepository bassRepository;

    @Autowired
    BaseRepository baseRepository;

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

    @PostMapping("/post")
    public String testPost()
    {
        return "TEST COMPLETED!";
    }

    @PostMapping("/saveBass")
    public String save(Bass bass)
    {
        bassRepository.save(bass);
        return bass.sound();
    }



}
