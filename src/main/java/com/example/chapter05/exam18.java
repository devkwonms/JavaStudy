package com.example.chapter05;

public class exam18 {
    public static void main(String[]args){
        for(int end = 10; end <= 10000000; end = end *10){
            double pie = 0;
            for(long deno = 1; deno < end; deno ++){
                pie = pie +(1.0/(deno*deno));
            }
            pie = Math.sqrt(pie*6);
            System.out.println("pie = " + pie + "("+end+"회)");
        }
    }
}
