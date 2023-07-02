package com.example.chapter07;

public class exam15 {
    public static void main(String[] args) {
        int[] arDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 5;

        int days = arDays[month];
        System.out.println(month + "월은 " + days + "일 까지 있습니다.");
    }
}
