package com.js.generics.homework.resolve;

import java.util.ArrayList;
import java.util.List;

/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <E> boolean isBlank(List<E> list) {
        return list == null || list.isEmpty();
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <E> E getLastElem(List<E> list) {
        if (list == null) {
            throw new IllegalArgumentException();
        }

        return list.get(list.size() - 1);
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param list список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> E findElem(List<E> list, E elem) {
        validateParams(list, elem);

        int i = list.indexOf(elem);

        if (i == -1) {
            return null;
        }

        return list.get(i);
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы списка не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static <E> List<E> union(List<E> list1, List<E> list2) {
        validateParams(list1, list2);

        List<E> res = new ArrayList<>(list1);
        res.addAll(list2);

        return res;
    }

    /**
     * Удаляет все элементы из списка list1 всех элементов, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы списка не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static <E> List<E> removeAll(List<E> list1, List<E> list2) {
        validateParams(list1, list2);

        List<E> list = new ArrayList<>(list1);

        list.removeAll(list2);

        return list;
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы списка не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return сумма чисел.
     */
    public static <E> double sum(List<? extends Number> list1, List<? extends Number> list2) {
        validateParams(list1, list2);

        double res = 0;

        for (Number number : list1) {
            res += number.doubleValue();
        }

        for (Number number : list2) {
            res += number.doubleValue();
        }

        return res;
    }

    private static <T> void validateParams(T var1, T var2) {
        if (var1 == null || var2 == null) {
            throw new IllegalArgumentException();
        }
    }
}
