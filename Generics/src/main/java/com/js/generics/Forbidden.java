package com.js.generics;

import java.util.ArrayList;
import java.util.List;

public class Forbidden<T> {
    /**
     * 1. Нельзя объявлять параметризованное поле как static.
     */
    // private static T value;

    /**
     * 2. Нельзя инициализировать параметризованный объект.
     */
    public void createValue() {
        //  new T();
    }

    /**
     * 3. Нельзя параметризовать примитивными типами.
     */
    // final List<int> ids = new ArrayList<>();
}

/**
 * 4. Нельзя создавать параметризованные исключения.
 */
// class GenericException<T> extends Exception {}
