package com.jmr.producer.practica.producer_practica.model;


import javax.persistence.*;

@Entity
public class Bass extends Instrument{

    @Override
    public String sound() {
        return "Low frequencies sounding...";
    }

}
