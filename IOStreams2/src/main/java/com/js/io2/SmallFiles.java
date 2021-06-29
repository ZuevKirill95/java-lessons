package com.js.io2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class SmallFiles {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("IOStreams2/src/main/java/com/js/io2/file/Borodino.txt");
        Path file2 = Paths.get("IOStreams2/src/main/java/com/js/io2/file/Borodino2.txt");
        byte[] fileArray = Files.readAllBytes(file);

        Files.write(file, fileArray, APPEND);
    }
}
