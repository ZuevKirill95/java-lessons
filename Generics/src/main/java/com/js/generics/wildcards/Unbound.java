package com.js.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unbound {
    public static void main(String[] args) {
        Integer integer = 1;

        Number number = integer;

        List<String> strings = new ArrayList<>();

        List<Integer> integers = Arrays.asList(1, 2, 3);
         List<?> numbers = integers;
    }
}
