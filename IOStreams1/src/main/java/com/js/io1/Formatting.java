package com.js.io1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Formatting {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.print("Квадратный корень от ");
        System.out.print(i);
        System.out.print(" равен ");
        System.out.print(r);
        System.out.println(".");

        System.out.println("Квадратный корень от " + i + " равен " + r + ".");
    }
}
