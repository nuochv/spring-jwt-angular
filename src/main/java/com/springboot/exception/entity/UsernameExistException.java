package com.springboot.exception.entity;

public class UsernameExistException extends Exception{
    public UsernameExistException(String message) {
        super(message);
    }
}
