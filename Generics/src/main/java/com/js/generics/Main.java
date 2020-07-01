package com.js.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericClass<String, Integer> genericClass = new GenericClass<>();

        genericClass.setValue1("1");
        String value = genericClass.getValue1();

        genericClass.setValue2(1);
        Integer value2 = genericClass.getValue2();
    }
}
