package com.js.io1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ByteStreams {
    public static void main(String[] args) throws IOException {

        try (BufferedReader fileInputStream = new BufferedReader(new FileReader("IOStreams1/src/main/java/com/js/io1/file/Borodino.txt"));
             BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter("IOStreams1/src/main/java/com/js/io1/file/CopyBorodino.txt"))) {

            int c;
            while ((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        }
    }
}
