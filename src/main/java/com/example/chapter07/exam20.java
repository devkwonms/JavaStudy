package com.example.chapter07;

public class exam20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("총합계 = " + sum);
    }
}
