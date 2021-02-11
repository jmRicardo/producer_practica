package com.jmr.producer.practica.producer_practica.controllers;


import com.jmr.producer.practica.producer_practica.exceptions.BassNotFoundException;
import com.jmr.producer.practica.producer_practica.models.Bass;
import com.jmr.producer.practica.producer_practica.services.BassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/bass")
@Slf4j
public class BassController {

    private final BassService bassService;

    @Autowired
    public BassController(BassService bassService) {
        this.bassService = bassService;
    }

    @GetMapping
    public List<Bass> getAll() {
        return new ArrayList<>(this.bassService.getAll());
    }

    @PostMapping
    public ResponseEntity<Bass> addBass(@RequestBody Bass bassModel) {
        Bass bass = this.bassService.addBass(bassModel);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bass.getId()).toUri();
        return ResponseEntity.created(location).body(bass);
    }

    @GetMapping("/{id}")
    public Bass getBass(@PathVariable Long id) throws BassNotFoundException {
        return this.bassService.findById(id);
    }



}
