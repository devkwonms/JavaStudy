package com.example.chapter16;

public class exam26 {
    public static void main(String[] args) {
        System.out.println(rountNth(123.456789, 0));
        System.out.println(rountNth(123.456789, 1));
        System.out.println(rountNth(123.456789, 2));
        System.out.println(rountNth(123.456789, 3));
        System.out.println(rountNth(123.456789, 4));
    }

    public static double rountNth(double value, int n) {
        double multi = Math.pow(10, n);
        return Math.round(value * multi)/multi;
    }
}
