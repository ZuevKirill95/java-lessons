package com.js.generics;

import java.util.ArrayList;
import java.util.List;

public class Reason {
    public static void main(String[] args) {
        List numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add('3');

        int num = (int) numbers.get(2);
    }
}
