package com.company;

public class Example1 {

    public static void main(String[] args) {
        BankOnline bankOnline = new BankOnline();

        try {
            bankOnline.send("1231 2312 3123", 100.00);
        } catch (InvalidCardNumberException e) {
            e.printStackTrace();
        }

        System.out.println("Продолжение работы программы");
    }
}
