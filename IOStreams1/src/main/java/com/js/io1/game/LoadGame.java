package com.js.io1.game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadGame {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (
                FileInputStream fileInputStream = new FileInputStream("IOStreams1/src/main/java/com/js/io1/file/save.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            Hero hero = (Hero) objectInputStream.readObject();

            System.out.println(hero);
        }
    }
}
