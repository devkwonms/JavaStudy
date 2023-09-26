package com.example.chapter21;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class exam5 {
    public static void main(String[] args) throws Exception {
        byte[] data = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        FileOutputStream fout = new FileOutputStream("test.buf");
        BufferedOutputStream out = new BufferedOutputStream(fout);
//        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("test.buf"));
        out.write(data);
        out.close();
        System.out.println("Write success");

        BufferedInputStream in = new BufferedInputStream(new FileInputStream("test.buf"));
        byte[] indata = new byte[15];
        in.read(indata, 0, 15);
        in.close();
        for (byte b : indata) {
            System.out.print(b);
        }
    }
}
