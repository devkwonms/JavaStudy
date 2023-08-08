package com.example.chapter15;

public class exam5 {
    public static void main(String[] args) {
        int i = 1234;
        String str1 = String.valueOf(i);
        String str2 = Integer.toString(i);

        System.out.println("str1 = " + str1);
        System.out.println(str1.getClass().getName());
        System.out.println("str2 = " + str2);
        System.out.println(str2.getClass().getName());
    }
}
