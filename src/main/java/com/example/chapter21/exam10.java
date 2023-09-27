package com.example.chapter21;

import java.io.FileReader;
import java.io.LineNumberReader;

public class exam10 {
    public static void main(String[] args) throws Exception {
        LineNumberReader in = new LineNumberReader(new FileReader("애국가-Utf8nb.txt"));
        for (; ; ) {
            String Line = in.readLine();
            if (Line == null) break;
            int Num = in.getLineNumber();
            System.out.printf("%4d : %s\n", Num, Line);
        }
        in.close();
    }
}
