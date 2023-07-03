package com.example.chapter08;

public class exam8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            outChars(' ', 10 - i);
            outChars('*', i);
            System.out.println();
        }
    }

    static void outChars(char ch, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }
}
