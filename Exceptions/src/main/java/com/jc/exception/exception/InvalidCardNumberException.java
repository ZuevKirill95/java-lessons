package com.jc.exception.exception;

public class InvalidCardNumberException extends RuntimeException {
    public InvalidCardNumberException(String msg) {
        super(msg);
    }
}
