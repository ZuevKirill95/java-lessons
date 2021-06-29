package com.js.io1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {

    public static void main(String[] args) {
        System.out.println(1.03 - .42);

//        System.out.println(new BigDecimal(1.03).subtract(new BigDecimal(.42))
//                .setScale(2, RoundingMode.HALF_EVEN));
    }
}
