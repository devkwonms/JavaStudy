package com.example.chapter08;

public class exam2 {
    public static void main(String[] args) {
        System.out.println("1 ~ 10 = " + calcSum(1, 10));
        System.out.println("15 ~ 100 = " + calcSum(15, 100));
    }

    static int calcSum(int from, int to) {
        int sum = 0;

        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
