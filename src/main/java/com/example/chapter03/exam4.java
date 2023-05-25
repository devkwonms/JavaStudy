package com.example.chapter03;

public class exam4 {
    public static void main(String[]args){
        final double RATE = 3.28;
        System.out.println("이자율 = " + RATE + "%");
        int deposit = 10000;
        System.out.println("1년후 이자 = " + deposit * RATE/100 + "원");

    }
}
