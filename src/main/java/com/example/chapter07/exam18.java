package com.example.chapter07;

public class exam18 {
    public static void main(String[] args) {
        double[] root = new double[100];

        for (int i = 0; i < 100; i++) {
            root[i] = Math.sqrt(i);
//            System.out.println(i + "의 제곱근: " + Math.sqrt(i));
        }
        System.out.println("2의 제곱근: " + root[2]);
    }
}
