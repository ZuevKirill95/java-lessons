package com.js.generics;

import java.util.ArrayList;
import java.util.List;

public class Reason {
    public static void main(String[] args) {
        List numbers = new ArrayList();

        int num1 = 1;
        int num2 = 2;
        String num3 = "3";

        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);

        int num = (int) numbers.get(2);
    }
}
