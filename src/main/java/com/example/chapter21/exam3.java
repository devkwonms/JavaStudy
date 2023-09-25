package com.example.chapter21;

import java.io.FileInputStream;

public class exam3 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("test.bin");
        int data;
        for (; ; ) {
            data = in.read();
            if (data == -1) break;
            System.out.print(data);
        }
        in.close();
    }
}
