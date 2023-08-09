package com.example.chapter15;

public class exam16 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println((i + 1) + "번째 줄");
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0 + " 초 걸림");
    }
}
