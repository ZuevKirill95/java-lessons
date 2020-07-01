package com.js.generics.best.practics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Используете вместо простых массивов списки.
 */
public class BP5<T> {
    public static void main(String[] args) {
        /**
         * 1. Фиксированный размер.
         * 2. Поддерживает примитивные типы
         * 3. Нельзя использовать generics.
         * 4. Не имеет потокобезопасной реализаций
         */
        String[] arr = new String[10];

        /**
         * 1. Переменный размер.
         * 2. Не поддерживает примитивные типы.
         * 3. Типобезопасный.
         * 4. Есть потокобезопасные релизации.
         */
        List<String> list = new ArrayList<>();
    }
}
