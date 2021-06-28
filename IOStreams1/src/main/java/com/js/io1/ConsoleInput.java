package com.js.io1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ConsoleInput {
    public static void main(String[] args) throws IOException {
        Console console = System.console();

        if (console == null) {
            System.out.println("Не консоль");
            System.exit(1);
        }

        String name = console.readLine("Введите логин: ");

        boolean noMatch;
        do {
            char[] password = console.readPassword("Введите пароль: ");
            char[] passwordAgain = console.readPassword("Введите пароль ещё раз: ");

            noMatch = !Arrays.equals(password, passwordAgain);
            if (noMatch) {
                System.out.println("Пароли не совпадают. Попробуйте ещё раз.%n");
            }

        } while (noMatch);

        System.out.printf("Привет %s!", name);
    }
}
