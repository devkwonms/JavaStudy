package com.example.chapter19;

public class exam4 {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 0;
        try {
            c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
