package com.example.chapter05;

public class exam17 {
    public static void main(String[]args){
        double pie = 0;
        for(int deno = 1; deno < 1000; deno++){
            pie = pie + (1.0/(deno * deno));
        }
        pie = Math.sqrt(pie*6);
        System.out.println("pie = " + pie);
    }
}
