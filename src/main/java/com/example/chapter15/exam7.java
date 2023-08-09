package com.example.chapter15;

public class exam7 {
    public static void main(String[] args) {
        String a = "12", b = "34";
        System.out.println(a + b);
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        Integer c = 10000;
        Integer d = 10000;
        System.out.println(c == c.intValue() ? "같다" : "다르다");
        System.out.println(c.equals(c.intValue()) ? "같다" : "다르다");
        System.out.println(c == d.intValue() ? "같다" : "다르다");
        System.out.println(c.equals(d) ? "같다" : "다르다");
    }
}
