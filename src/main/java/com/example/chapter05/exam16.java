package com.example.chapter05;

public class exam16 {
    public static void main(String[] args) {
        for (int end = 10; end <= 10000000; end = end * 10) {
            double pie = 0;
            for (int deno = 1; deno < end; deno = deno + 4) {
                pie = pie + (1.0 / deno) - (1.0 / (deno + 2));
            }
            System.out.println("pie = " + pie * 4 + "(" + end + " 회)");
        }
    }
}
