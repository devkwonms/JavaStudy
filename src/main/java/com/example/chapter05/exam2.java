package com.example.chapter05;

public class exam2 {
    public static void main(String[]args){
        int sum = 0;

        for(int i =1; i<=100; i = i+2){
            sum = sum + i;
        }
        System.out.println("합계 = " + sum);
    }
}
