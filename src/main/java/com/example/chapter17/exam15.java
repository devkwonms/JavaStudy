package com.example.chapter17;

import java.util.*;

public class exam15 {
    public static void main(String[] args) {
        HashMap<String, Integer> Snack = new HashMap<>();
        Snack.put("오징어 땅콩", 2500);
        Snack.put("죠리퐁", 1900);
        Snack.put("핫브레이크", 450);
        Snack.put("빼빼로", 900);

        String MySnack = "죠리퐁";
        System.out.println(MySnack + "의 가격은 " + Snack.get(MySnack));
    }
}
