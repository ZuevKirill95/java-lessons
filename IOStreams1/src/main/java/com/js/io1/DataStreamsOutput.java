package com.js.io1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamsOutput {
    public static void main(String[] args) throws IOException {
        final String dataFile = "invoicedata.txt";

        double price;
        int unit;
        String desc;
        double total = 0.0;

        try (DataInputStream in = new DataInputStream(new
                BufferedInputStream(new FileInputStream(dataFile)))) {


            try {
                while (true) {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();
                    System.out.format("Ваш заказ %s. %d штук за $%.2f%n", desc, unit, price);
                    total += unit * price;
                }
            } catch (EOFException e) {
                System.out.format("Всего $%.2f%n", total);
            }
        }
    }
}
