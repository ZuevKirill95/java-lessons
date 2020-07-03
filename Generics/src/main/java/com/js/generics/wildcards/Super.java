package com.js.generics.wildcards;

import com.js.generics.wildcards.animals.Animal;
import com.js.generics.wildcards.animals.Cat;
import com.js.generics.wildcards.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Super {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        List<?> catsAndUpper = objects;

        // catsAndUpper.add(new Cat());

        // Cat cat = catsAndUpper.get(0);
    }
}
