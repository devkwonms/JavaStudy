package com.example.chapter17;

import java.util.*;

public class exam8 {
    public static void main(String[] args) {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> sub = arNum.subList(1, 4);
        for (Integer i : sub) {
            System.out.print(i + " ");
        }
        System.out.println();

        arNum.set(2, 100);
        for (Integer i : sub) {
            System.out.print(i + " ");
        }
        System.out.println();

        sub.set(1, 200);
        for (Integer i : arNum) {
            System.out.print(i + " ");
        }
        System.out.println();

        sub.clear();
        for (Integer i : arNum) {
            System.out.print(i + " ");
        }
    }
}
