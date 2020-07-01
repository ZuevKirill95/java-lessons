package com.js.generics.best.practics;

import java.util.ArrayList;

/**
 * Всегда используйте интерфейс, когда декларируете коллекцию.
 */
public class BP1 {
    public static <T> void foo(ArrayList<T> list) {
        // do something
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        BP1.foo(list);
    }
}
