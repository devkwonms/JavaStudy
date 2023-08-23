package com.example.chapter17;

import java.util.ArrayList;
import java.util.Arrays;

public class exam5 {
    public static void main(String[] args) {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(4, 5, 2));

        arNum.addAll(arNum2);
        for (Integer i : arNum) {
            System.out.print(i + " ");
        }
    }
}
