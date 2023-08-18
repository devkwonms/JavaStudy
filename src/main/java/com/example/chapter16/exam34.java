package com.example.chapter16;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class exam34 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        System.out.printf("오늘 날짜 : %d월 %d일\n",
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE));
        today.add(Calendar.DATE, 100);
        System.out.printf("100일 후는 %d월 %d일입니다.\n",
                today.get(Calendar.MONTH) + 1,
                today.get(Calendar.DATE));
    }
}
