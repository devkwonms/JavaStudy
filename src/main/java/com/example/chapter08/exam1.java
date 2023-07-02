package com.example.chapter08;

public class exam1 {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1 ~ 10 = " + sum);

        sum = 0;
        for (int i = 15; i <= 100; i++) {
            sum += i;
        }
        System.out.println("15 ~ 100 = " + sum);
    }
}
