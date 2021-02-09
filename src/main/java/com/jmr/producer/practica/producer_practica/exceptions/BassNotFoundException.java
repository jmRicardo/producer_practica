package com.jmr.producer.practica.producer_practica.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@Slf4j
public class BassNotFoundException extends RuntimeException{
    public BassNotFoundException(String message) {
        super(message);
        log.error(message);
    }
}
