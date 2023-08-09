package com.example.chapter15;

import java.util.Arrays;

public class exam20 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar, ar.length);

        for (int a : ar2) {
            System.out.print(a + " ");
        }
        System.out.println();

        int[] ar3 = Arrays.copyOfRange(ar, 1, 3);

        for (int a : ar3) {
            System.out.print(a + " ");
        }

        System.out.println();
//        System.out.println(ar.hashCode());
//        System.out.println(ar2.hashCode());
//        System.out.println(ar3.hashCode());

//        System.out.println(ar.equals(ar2));
//        System.out.println(ar.equals(ar3));
//        System.out.println(ar2.equals(ar3));

        System.out.println(Arrays.equals(ar,ar2));
        System.out.println(Arrays.equals(ar,ar3));
        System.out.println(Arrays.equals(ar2,ar3));
    }
}
