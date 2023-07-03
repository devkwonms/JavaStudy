package com.example.chapter08;

public class exam9 {
    public static void main(String[]args){
        for(int i = 1; i <= 10; i++){
            outChars(' ', 10 - i, false);
            outChars('*', i, true);
        }
    }
    static void outChars(char ch, int num, boolean newline){
        for(int i = 0; i < num; i++){
            System.out.print(ch);
        }
        if(newline){
            System.out.println();
        }
    }
}
