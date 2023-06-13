package com.example.chapter05;

public class exam15 {
    public static void main(String[]args){
        double pie = 0;
        for(int deno = 1; deno < 1000; deno = deno +4){
            pie = pie + (1.0/deno) - (1.0/(deno +2));
        }
        System.out.println("pie = " + pie * 4);
    }
}
