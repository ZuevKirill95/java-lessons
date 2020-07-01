package com.js.generics;

import java.util.List;

public class GenericMethod {
    public <T> T getLastValue(List<T> list) {
        return list.get(list.size() - 1);
    }
}
