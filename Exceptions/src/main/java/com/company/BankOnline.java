package com.company;

public class BankOnline {
    void send(String cardNumber, Double money) throws InvalidCardNumberException {
        if (cardNumber.replaceAll(" ", "").length() != 16) {
            throw new InvalidCardNumberException("Карта введена неверно");
        }

        System.out.println("Операция прошла успешно");
    }
}
