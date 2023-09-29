package com.example.chapter21;

import java.io.*;

public class exam12 {
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(r);
        try {
            String str = b.readLine();
            System.out.println(str);
            System.out.println("입력완료");
        } catch (IOException e) {
            System.out.println("input error");
        }
    }
}
