package com.jc.exception;

import com.jc.exception.bank.BankOnline;

public class Example1 {

    public static void main(String[] args) {
        BankOnline bankOnline = new BankOnline();

        bankOnline.send("1231 2312 3123 2120", 100.00);

        System.out.println("Продолжение работы программы");
    }
}
