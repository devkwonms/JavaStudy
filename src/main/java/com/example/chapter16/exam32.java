package com.example.chapter16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class exam32 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
                today.get(Calendar.YEAR),
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE),
                today.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후",
                today.get(Calendar.HOUR),
                today.get(Calendar.MINUTE),
                today.get(Calendar.SECOND));
    }
}
