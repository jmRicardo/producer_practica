package com.jmr.producer.practica.producer_practica.services;

import com.jmr.producer.practica.producer_practica.exceptions.BassNotFoundException;
import com.jmr.producer.practica.producer_practica.models.Bass;
import com.jmr.producer.practica.producer_practica.repositories.BassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BassService {

    private final BassRepository bassRepository;

    @Autowired
    public BassService(BassRepository bassRepository)
    {
        this.bassRepository = bassRepository;
    }

    public List<Bass> getAll()
    {
        return bassRepository.findAll();
    }

    public Bass addBass(Bass bass)
    {
        return bassRepository.save(bass);
    }

    public Bass findById(long id)
    {
        Optional<Bass> bass = this.bassRepository.findById(id);
        if (bass.isPresent()) {
            return bass.get();
        }
        throw new BassNotFoundException("El Bajo con el id = " + id + " no existe!");
    }


}
