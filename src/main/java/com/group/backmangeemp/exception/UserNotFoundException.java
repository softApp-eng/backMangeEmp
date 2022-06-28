package com.group.backmangeemp.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mesg) {
        super(mesg);
    }
}
