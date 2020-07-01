package com.js.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Unbound {
    public static void main(String[] args) {
        String str = "str";

        Object object = str;

        List<String> strings = new ArrayList<>();
        // List<Object> objects = strings;
    }
}
