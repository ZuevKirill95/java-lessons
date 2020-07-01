package com.js.generics.best.practics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Не возвращайте null в методе, а возвращайте пустую коллекцию
 */
public class BP2 {
    public static List<String> getStudent(String name) {
        List<String> list = null;

        if ("Иван".equals(name)) {
            list = new ArrayList<>(Arrays.asList(name));
        }

        return list;
    }

    public static void main(String[] args) {
        List<String> student = BP2.getStudent("Василий");

        String name = student.get(0);
    }
}
