package com.js.io2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        //Метаданные
        File file = new File("IOStreams2/src/main/java/com/js/io2/file/Borodino.txt");
        file.exists();
        boolean b = !file.exists();
        file.canRead();
        file.isFile();
        file.isDirectory();
        file.canExecute();
        file.canWrite();

        Path path = Paths.get("IOStreams2/src/main/java/com/js/io2/file/Borodino.txt");

        Files.exists(path);
        Files.notExists(path);
        Files.isReadable(path);
        Files.isRegularFile(path);
        Files.isDirectory(path);
        Files.isExecutable(path);
        Files.isWritable(path);

        System.out.println(Files.isSameFile(path, file.toPath()));

        BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("creationTime: " + attr.creationTime());
        System.out.println("lastAccessTime: " + attr.lastAccessTime());
        System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
        System.out.println("isDirectory: " + attr.isDirectory());
        System.out.println("isOther: " + attr.isOther());
        System.out.println("isRegularFile: " + attr.isRegularFile());
        System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        System.out.println("size: " + attr.size());
    }
}
