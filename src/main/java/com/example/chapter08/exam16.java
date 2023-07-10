package com.example.chapter08;

public class exam16 {
    public static void main(String[] args) {
        System.out.println("[3,5] = " + getMax(3, 5));
        System.out.println("[3,5] = " + getMax(3.4, 5.6));
    }

    static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double getMax(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
