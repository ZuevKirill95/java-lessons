package com.js.generics.wildcards;

import com.js.generics.wildcards.animals.Animal;
import com.js.generics.wildcards.animals.Cat;
import com.js.generics.wildcards.animals.Phone;

import java.util.ArrayList;
import java.util.List;

public class Extends {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = cat;
        List<Phone> phones = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

          List<? extends Animal> animals = cats;

          Animal firstAnimal = animals.get(0);

      //  animals.add(new Cat());
    }
}
