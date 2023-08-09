package com.example.chapter15;

public class exam13 {
    public static void main(String[] args) {
        double d = Math.sqrt(-2);
        if (Double.isNaN(d)) {
            System.out.println("숫자가 아님");
        } else {
            System.out.println("숫자가 맞음");
        }
    }
}
