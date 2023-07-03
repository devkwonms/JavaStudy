package com.example.chapter08;

public class exam10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            outChars(' ', 10 - i);
            outCharsln('*', i);
        }
    }

    static void outChars(char ch, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }

    static void outCharsln(char ch, int num) {
        outChars(ch, num);
        System.out.println();
    }
}
