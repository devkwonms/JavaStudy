package com.example.chapter09;

class Time {
    boolean am;
    int hour;
    int minute;
    int second;

    // 인수가 4개인 생성자
    Time(boolean am, int hour, int minute, int second) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 인수가 3개인 생성자
    Time(boolean am, int hour, int minute){
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    // 인수가 2개인 생성자
    Time(int hour24, int minute){
        this.am = hour24 < 12;
        this.hour = hour24 % 12;
        this.minute = minute;
        this.second = 0;
    }

    void whatTime() {
        System.out.print(am ? "오전 " : "오후 ");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}

public class exam2 {
    public static void main(String[] args) {

        Time now1 = new Time(true, 12, 34, 56); // 오전 12시 34분 56초
        now1.whatTime();

        Time now2 = new Time(true, 12, 34); // 오전 12시 34분 0초
        now2.whatTime();

        Time today = new Time(18, 30);  // 오후 6시 30분 0초
        today.whatTime();
    }
}
