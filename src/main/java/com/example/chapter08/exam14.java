package com.example.chapter08;

public class exam14 {
    public static void main(String[] args) {
        int[] num = {2, 8, 6};
        getDouble(num);

        System.out.println("num[0] = " + num[0]);
    }

    static void getDouble(int[] value) {
        value[0] += 2;
    }
}
