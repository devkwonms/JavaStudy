package com.example.chapter16;

import java.time.LocalDate;
import java.time.LocalTime;

public class exam36 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초",
                today.getYear(),
                today.getMonthValue(),
                today.getDayOfMonth(),
                now.getHour(),
                now.getMinute(),
                now.getSecond());
    }
}
