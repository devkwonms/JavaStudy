package com.example.chapter08;

public class exam13 {
    public static void main(String[] args) {
        int num = 2;
        getDouble(num);
        System.out.println("num = " + num);
    }

    static int getDouble(int value) {
        value *= 2;
        return value;
    }
}
