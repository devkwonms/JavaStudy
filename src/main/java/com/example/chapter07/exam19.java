package com.example.chapter07;

public class exam19 {
    static double[] root = new double[100];

    public static void main(String[] args) {

        System.out.println("2의 제곱근: " + getRoot(2));
        System.out.println("5의 제곱근: " + getRoot(5));
        System.out.println("2의 제곱근: " + getRoot(2));

    }

    static double getRoot(int i) {
        if (root[i] == 0) {
            root[i] = Math.sqrt(i);
        }
        return root[i];
    }
}
