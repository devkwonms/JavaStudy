package com.example.chapter09;

class Time {
    boolean am = true;
    int hour = 12;
    int minute = 0;
    int second = 0;

    // 디폴트 생성자
    Time(){}

    // 인수가 4개인 생성자
    Time(boolean am, int hour, int minute, int second) {
        this.am = am;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 인수가 3개인 생성자
    Time(boolean am, int hour, int minute) {
        this(am, hour, minute, 0);
    }

    // 인수가 2개인 생성자
    Time(int hour24, int minute) {
        this(hour24 < 12, hour24 % 12, minute);
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

        Time midnight = new Time();
        midnight.whatTime();

        Time now3 = new Time(false, 3, 23, 0);
        now3.whatTime();
    }
}
