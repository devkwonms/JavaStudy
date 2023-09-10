package com.example.chapter19;

public class exam3 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("예외 발생");
        }
        System.out.println("프로그램 끝");
    }
}
