package com.example.chapter15;

public class exam14 {
    public static void main(String[] args) {
        int i = 123;
        double d = 3.14;
        String str = "문자열";
        System.out.printf(" i = %d, d = %f, str = %s\n", i, d, str);
        System.out.printf(" i = %3$d, d = %2$f, str = %1$s\n", str, d, i);
        System.out.printf(" 정수 = %1$d, i = %1$d", i);
    }
}
