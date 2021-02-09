package com.jmr.producer.practica.producer_practica.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BassNotFoundException extends RuntimeException{
    public BassNotFoundException(String message) {
        super(message);
    }
}
