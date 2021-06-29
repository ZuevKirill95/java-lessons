package com.js.io1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(cin);

        System.out.println("Введите логин");
        String name = bufferedReader.readLine();

        boolean noMatch;
        do {
            System.out.println("Введите пароль");
            String password = bufferedReader.readLine();
            System.out.println("Введите пароль ещё раз");
            String passwordAgain = bufferedReader.readLine();

            noMatch = !password.equals(passwordAgain);
            if (noMatch) {
                System.out.println("Пароли не совпадают. Попробуйте ещё раз.%n");
            }

        } while (noMatch);

        System.out.printf("Привет %s!", name);
    }
}
