package com.js.io1;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamsInput {
    public static void main(String[] args) throws IOException {
        final String dataFile = "invoicedata.txt";

        final double[] prices = {19.99, 9.99, 15.99, 3.99, 4.99};
        final int[] units = {12, 8, 13, 29, 50};
        final String[] descs = {
                "Футболка",
                "Кружка",
                "Игрушка",
                "Ручка",
                "Чехол"
        };

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(dataFile)))) {

            for (int i = 0; i < prices.length; i++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        }
    }
}
