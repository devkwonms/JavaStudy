package com.example.chapter15;

public class exam6 {
    public static void main(String[] args) {
        Integer wrapint = new Integer("629");

        String str = wrapint.toString();
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}
