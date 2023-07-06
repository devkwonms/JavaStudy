package com.example.chapter08;

public class exam12 {
    public static void main(String[]args){
        outBox("Hello");
        outBox("Congratulation");
        outBox("Good Morning");
    }
    static void outBox(String message){
        outCharsln('-', message.length() + 4);
        System.out.println("| " + message + " |");
        outCharsln('-', message.length() + 4);
    }
    static void outChars(char ch, int num){
        for (int i = 0; i < num; i++){
            System.out.print(ch);
        }
    }
    static void outCharsln(char ch, int num){
        outChars(ch, num);
        System.out.println();
    }
}
