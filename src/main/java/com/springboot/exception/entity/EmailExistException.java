package com.springboot.exception.entity;

public class EmailExistException extends Exception{
    public EmailExistException(String message) {
        super(message);
    }
}
