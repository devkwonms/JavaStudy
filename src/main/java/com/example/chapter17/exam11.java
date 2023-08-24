package com.example.chapter17;

import java.util.*;

public class exam11 {
    public static void main(String[] args) {
        ArrayList<String> arName = new ArrayList<>();
        arName.add("장보고");
        arName.add("김유신");
        arName.add("강감찬");
        arName.add("을지문덕");

        for (String name : arName) {
            System.out.print(name + " ");
        }

        System.out.println();

        Collections.sort(arName);
//        역순정렬
//        Collections.reverse(arName);

        for (String name : arName) {
            System.out.print(name + " ");
        }
    }
}
