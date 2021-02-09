package com.jmr.producer.practica.producer_practica.models;


import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class Bass extends Instrument{

    @Override
    public String sound() {
        return "Low frequencies sounding...";
    }



}
