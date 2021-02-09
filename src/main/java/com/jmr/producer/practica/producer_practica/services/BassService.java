package com.jmr.producer.practica.producer_practica.services;

import com.jmr.producer.practica.producer_practica.exceptions.BassNotFoundException;
import com.jmr.producer.practica.producer_practica.models.Bass;
import com.jmr.producer.practica.producer_practica.repositories.BassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void addBass(Bass bass)
    {
        bassRepository.save(bass);
    }

    public Bass save(Bass bass)
    {
        return bassRepository.save(bass);
    }

    public Bass findById(long id) throws BassNotFoundException
    {
        return bassRepository.findById(id).orElseThrow( ()-> new BassNotFoundException("Ese Bajo no existe con el id: " + id));
    }


}
