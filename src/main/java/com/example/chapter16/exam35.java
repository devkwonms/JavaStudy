package com.example.chapter16;

import java.util.GregorianCalendar;

public class exam35 {
    public static void main(String[] args) {
        GregorianCalendar birth = new GregorianCalendar(1995, 5, 11);
        GregorianCalendar today = new GregorianCalendar();
        long diff = today.getTimeInMillis() - birth.getTimeInMillis();
        System.out.println("diff = " + diff);
        long days = diff / (24 * 60 * 60 * 1000);
        System.out.println("오늘은 태어난 지 " + days + "일 째");
    }
}
