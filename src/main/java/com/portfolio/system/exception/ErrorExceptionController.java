package com.portfolio.system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
/**
 * 전역 Exception 처리
 * @author 손세민
 * @version 1.0.0
 * @since 2018-12-20 오후 11:16
**/
@RestControllerAdvice
public class ErrorExceptionController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserException.class)
    public String dupException(UserException e) {
        return e.getMessage();
    }
}
