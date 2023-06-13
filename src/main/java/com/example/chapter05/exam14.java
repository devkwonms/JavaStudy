package com.example.chapter05;

public class exam14 {
    public static void main(String[]args){
        double pie = 0;
        int sign = 1;
        for(int deno = 1; deno < 1000 ; deno = deno +2){
            pie = pie + (1.0/deno)*sign;
            sign = -sign;
        }
        pie *=4;
        System.out.println("pie = " + pie);
    }
}
