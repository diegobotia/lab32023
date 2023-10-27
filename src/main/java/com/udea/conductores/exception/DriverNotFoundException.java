package com.udea.conductores.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DriverNotFoundException extends RuntimeException{
    public DriverNotFoundException(String mensaje){
        super(mensaje);
    }
}
