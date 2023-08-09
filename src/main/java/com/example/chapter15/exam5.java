package com.example.chapter15;

public class exam5 {
    public static void main(String[] args) {
        int i = 1234;
        int a = Integer.valueOf(i);
        Integer wrapint = new Integer(i);
        String str = wrapint.toString();
        System.out.println(str);
    }
}
