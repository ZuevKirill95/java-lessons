package com.js.io1.game;

import com.js.io1.game.Hero;
import com.js.io1.game.armor.SteelArmor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveGame {
    public static void main(String[] args) throws IOException {
        Hero hero = new Hero("Jack");

        System.out.println(hero);

        hero.setLvl(10);
        hero.setArmor(new SteelArmor());

        System.out.println(hero);

        try (FileOutputStream outputStream = new FileOutputStream("IOStreams1/src/main/java/com/js/io1/file/save.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            objectOutputStream.writeObject(hero);
        }
    }
}
