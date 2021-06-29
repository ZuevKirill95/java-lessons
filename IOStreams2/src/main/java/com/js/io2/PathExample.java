package com.js.io2;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        File file = new File("IOStreams2/src/main/java/com/js/io2/PathExample.java");

       // Path path = Paths.get(URI.create("file:///F:\\Projects\\java-lessons\\IOStreams2\\src\\main\\java\\com\\js\\io2\\file\\Borodino.txt"));
        Path path = Paths.get("IOStreams2/src/main/java/com/js/io2/PathExample.java");

        System.out.format("toString: %s%n", path);
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

    }
}
