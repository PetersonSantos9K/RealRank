package com.peterson.realrankapi.services.exceptions;

import java.io.Serial;
import java.io.Serializable;

public class ResourceNotFoundException extends RuntimeException implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }

}
