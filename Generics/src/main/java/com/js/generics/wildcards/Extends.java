package com.js.generics.wildcards;

import com.js.generics.wildcards.animals.Animal;
import com.js.generics.wildcards.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;

        List<Cat> cats = new ArrayList<>();
        //  List<Animal> animals = cats;

        //  Animal firstAnimal = animals.get(0);

        // Не скомпилируется
        //animals.add(new Cat());
    }
}
