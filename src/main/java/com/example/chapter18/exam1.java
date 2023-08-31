package com.example.chapter18;

import java.util.*;

public class exam1 {
    public static void main(String[] args) {
        ArrayList arNum = new ArrayList();
        arNum.add(1);
        arNum.add("문자열");

        int value = (int)arNum.get(0);
//        int temp = (int)arNum.get(1);
        System.out.println(value);
    }
}
