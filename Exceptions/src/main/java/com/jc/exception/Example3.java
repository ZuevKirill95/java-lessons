package com.jc.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("text.txt")) {
            //какая-то работа
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
