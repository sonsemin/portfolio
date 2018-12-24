package com.portfolio.system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserException extends RuntimeException{

    String message;

    public UserException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }
}
