package com.jc.exception.bank;

import com.jc.exception.exception.InvalidCardNumberException;

public class BankOnline {
    public void send(String cardNumber, Double money) throws InvalidCardNumberException {
        if (cardNumber.replaceAll(" ", "").length() != 16) {
            throw new InvalidCardNumberException("Карта введена неверно");
        }

        System.out.println("Операция прошла успешно");
    }
}
