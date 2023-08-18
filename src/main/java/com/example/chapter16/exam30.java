package com.example.chapter16;

import java.util.Random;

public class exam30 {
    public static void main(String[] args) {
        Random R = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(R.nextInt(10));
        }
    }
}
