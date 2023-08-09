package com.example.chapter15;

public class exam18 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = new int[5];

        System.arraycopy(ar, 0, ar2, 0, ar.length);

        for (int a : ar2) {
            System.out.print(a + " ");
        }
    }
}
