package com.example.chapter16;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class exam33 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 a hh:mm:ss");
        String result = sdf.format(today.getTime());
        System.out.println(result);
    }
}
