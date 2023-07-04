package com.example.chapter08;

public class exam12 {
    public static void main(String[] args) {
        outCharsln('-', 5 + 4);
        System.out.println("| Hello |");
        outCharsln('-', 5 + 4);

        outCharsln('-', 14 + 4);
        System.out.println("| Congratulation |");
        outCharsln('-', 14 + 4);
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
