package com.example.chapter06;

public class exam4 {
    public static void main(String[]args){
        int value = 2;
        int a = ++value;
        System.out.println("value = " + value + ", a = " + a);

        value = 2;
        a = value++;
        System.out.println("value = " + value + ", a = " + a);
    }
}
