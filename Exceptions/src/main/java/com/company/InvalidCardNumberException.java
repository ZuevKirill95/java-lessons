package com.company;

public class InvalidCardNumberException extends Exception {
    InvalidCardNumberException(String msg) {
        super(msg);
    }
}
