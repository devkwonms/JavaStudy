package com.example.chapter21;

import java.io.BufferedReader;
import java.io.FileReader;

public class exam6 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("애국가-Utf8nb.txt"));
        char[] text = new char[1000];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 = " + num);
        System.out.println(text);
        in.close();
    }
}
