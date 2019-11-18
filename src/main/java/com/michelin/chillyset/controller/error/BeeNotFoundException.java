package com.michelin.chillyset.controller.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;
@ResponseStatus(NOT_FOUND)
public class BeeNotFoundException extends RuntimeException {

    public BeeNotFoundException () {
        super ("This cake does not exist");
    }
}
