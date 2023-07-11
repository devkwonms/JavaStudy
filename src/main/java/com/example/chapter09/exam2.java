package com.example.chapter09;

class Time {
    boolean am;
    int hour;
    int minute;
    int second;

    void whatTime() {
        System.out.print(am ? "오전 " : "오후 ");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}

public class exam2 {
    public static void main(String[] args) {
        Time now = new Time();
        now.am = true;
        now.hour = 12;
        now.minute = 34;
        now.second = 56;

        now.whatTime();
    }
}
