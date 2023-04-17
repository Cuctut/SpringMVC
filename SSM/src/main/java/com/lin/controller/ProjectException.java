package com.lin.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException{

    @ExceptionHandler(Exception.class)
    public Result doException(){
        return new Result(null, Code.ERR, "Something wrong!");
    }
}
