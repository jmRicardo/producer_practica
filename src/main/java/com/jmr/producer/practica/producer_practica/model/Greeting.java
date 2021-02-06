package com.jmr.producer.practica.producer_practica.model;

public class Greeting {

    private String name;
    private String last;

    public Greeting(String name, String last) {
        this.name = name;
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
