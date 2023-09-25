package com.example.chapter21;

import java.io.*;

public class exam2 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test.bin");
        int avail = in.available();
        byte[] data = new byte[avail];
        in.read(data);
        in.close();
        for (byte b : data) {
            System.out.print(b);
        }
    }
}
