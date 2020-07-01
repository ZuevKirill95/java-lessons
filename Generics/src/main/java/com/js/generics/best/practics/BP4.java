package com.js.generics.best.practics;

import java.util.ArrayList;
import java.util.List;

/**
 * Не используйте сырые типы
 */
public class BP4 {
    public static void main(String[] args) {
        List nums = new ArrayList();

        String five = "Пять";

        nums.add(five);

        int num = (int) nums.get(0);
    }
}
