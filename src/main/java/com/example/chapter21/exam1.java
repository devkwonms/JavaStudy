package com.example.chapter21;

import java.io.*;

public class exam1 {
    public static void main(String[] args) {
        byte[] data = {8, 9, 0, 6, 2, 9, 9};
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("test.bin");
            out.write(data);
            System.out.println("Write success");
        } catch (IOException e) {
            System.out.println("File output error");
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                ;
            }
        }
    }
}
