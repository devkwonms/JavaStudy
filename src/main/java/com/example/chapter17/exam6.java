package com.example.chapter17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class exam6 {
    public static void main(String[] args) {
        ArrayList<Integer> arNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> arNum2 = new ArrayList<>(Arrays.asList(2, 3));

        System.out.print("차집합 => ");
        ArrayList<Integer> arNumRemove = new ArrayList<>(arNum);
        arNumRemove.removeAll(arNum2);
        for (Integer i : arNumRemove) {
            System.out.print(i + " ");
        }

        System.out.print("교집합 => ");
        ArrayList<Integer> arNumRetain = new ArrayList<>(arNum);
        arNumRetain.retainAll(arNum2);
        for (Integer i : arNumRetain) {
            System.out.print(i + " ");
        }

        System.out.print("부분집합 => ");
        if (arNum.containsAll(arNum2)) {
            System.out.println("부분집합임");
        } else {
            System.out.println("부분집합이 아님");
        }
    }
}
