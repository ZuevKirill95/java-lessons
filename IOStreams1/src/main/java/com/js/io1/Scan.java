package com.js.io1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("IOStreams1/src/main/java/com/js/io1/file/Borodino.txt")))) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        }
    }
}
