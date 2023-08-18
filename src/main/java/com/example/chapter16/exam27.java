package com.example.chapter16;

public class exam27 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        double c = Math.hypot(x, y);
//        double c = Math.sqrt(x * x + y * y);
        System.out.println("빗변 = " + c);
    }
}
