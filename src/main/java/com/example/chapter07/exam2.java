package com.example.chapter07;

public class exam2 {
    public static void main(String[] args) {
        int[] score = new int[]{88, 99, 77, 55, 100};

        for (int i = 0; i < score.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적 = " + score[i]);
        }
    }
}
