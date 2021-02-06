package com.jmr.producer.practica.producer_practica.model;

import javax.persistence.*;

@Entity
public abstract class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "strings")
    private int strings;

    @Column(name = "length")
    private float length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public abstract String sound();



}
