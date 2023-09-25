package com.example.chapter21;

import java.io.FileInputStream;

public class exam3 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test.bin");
        byte[] data = new byte[2];
        int len;
        for (; ; ) {
            len = in.read(data);
            if (len == -1) break;
            for (byte b : data) {
                System.out.print(b);
            }
        }
        in.close();
    }
}
