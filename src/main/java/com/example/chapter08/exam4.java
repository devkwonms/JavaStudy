package com.example.chapter08;

public class exam4 {
    public static void main(String[]args){
        System.out.println("오늘은 " + getDate() + "일입니다.");
    }

    static int getDate(){

        java.time.LocalDate today = java.time.LocalDate.now();
        int day = today.getDayOfMonth();

        return day;
    }
}
