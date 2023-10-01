package com.example.chapter21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exam13 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(r);

        try {
            String str = b.readLine();
            int i = Integer.parseInt(str);
            System.out.println("입력값의 2배 = " + i * 2);
        } catch (IOException e) {
            System.out.println("input error");
        }
    }
}
