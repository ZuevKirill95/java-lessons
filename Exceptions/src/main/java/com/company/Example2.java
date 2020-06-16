package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(asList(1, 2, 3));
        list.get(5);
    }
}
