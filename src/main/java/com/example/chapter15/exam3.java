package com.example.chapter15;

public class exam3 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = ar.clone();

        ar2[0] = 1000;

        System.out.println("ar[0] = " + ar[0]);
        System.out.println("ar2[0] = " + ar2[0]);
    }
}
