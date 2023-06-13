package com.example.chapter05;

public class exam13 {
    public static void main(String[] args) {
        double pie = 0;
        boolean plus = true;
        for (int deno = 1; deno < 1000; deno = deno + 2) {
            if (plus) {
                pie = pie + 1.0 / deno;
                plus = false;
            } else {
                pie = pie - 1.0 / deno;
                plus = true;
            }
        }
        pie *= 4;
        System.out.println("pie = " + pie);
    }
}
