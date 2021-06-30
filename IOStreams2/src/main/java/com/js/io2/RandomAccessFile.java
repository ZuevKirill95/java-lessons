package com.js.io2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class RandomAccessFile {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("IOStreams2/src/main/java/com/js/io2/file/Borodino.txt");

        String s = "Здесь был Вася!\n";
        byte[] data = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);

        try (FileChannel fc = (FileChannel.open(file, READ, WRITE))) {
            ByteBuffer copy = ByteBuffer.allocate((int) fc.size());
            int nread;
            do {
                nread = fc.read(copy);
            } while (nread != -1 && copy.hasRemaining());

            fc.position(0);
            while (out.hasRemaining())
                fc.write(out);
            copy.flip();
            while (copy.hasRemaining())
                fc.write(copy);
            out.rewind();

            long length = fc.size();
            fc.position(length-1);

            while (out.hasRemaining())
                fc.write(out);
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        }
    }
}
