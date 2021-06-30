package com.js.io2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class Glob {
    public static void main(String[] args) {
        PathMatcher matcher =
                FileSystems.getDefault().getPathMatcher("glob:*.{java,class}");

        Path filename = Paths.get("IOStreams2/src/main/java/com/js/io2/AllBytesExample.java");
        if (matcher.matches(filename)) {
            System.out.println(filename);
        }
    }
}
