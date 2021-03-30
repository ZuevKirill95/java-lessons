package com.js.generics.best.practics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Старайтесь не использовать классический цикл при работе с коллекциями.
 */
public class BP3 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList("Анна", "Василий", "Петр", "Иван"));

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
