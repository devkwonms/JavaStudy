package com.example.chapter07;

public class exam8 {
    public static void main(String[] args) {
        int[] score = {88, 94, 72, 75, 23};
        int sum = 0;
        for (int s : score) {
            sum += s;
        }
        System.out.println("score[0] = " + score[0]);
    }
}
