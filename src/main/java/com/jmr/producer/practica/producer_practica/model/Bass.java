package com.jmr.producer.practica.producer_practica.model;


import javax.persistence.*;

@Entity
@Inheritance
@Table(name = "bass")
public class Bass extends Instrument{

    @Override
    public String sound() {
        return "Low frequency sounding...";
    }
}
