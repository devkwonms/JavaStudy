package com.example.chapter15;

public class exam19 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.arraycopy(ar, 2, ar, 4, 3);

        for (int a : ar) {
            System.out.println(a + " ");
        }
    }
}
