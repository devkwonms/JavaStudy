package com.example.chapter05;

public class exam27 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
//                System.out.print((char)(i+96));
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print((char) (i + 96));

            }
            System.out.println();
        }
    }
}
