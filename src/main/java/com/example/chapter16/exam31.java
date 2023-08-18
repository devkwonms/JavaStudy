package com.example.chapter16;

public class exam31 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(getRandom(5, 10));
        }
    }

    static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }
}
