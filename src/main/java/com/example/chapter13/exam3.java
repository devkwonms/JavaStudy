package com.example.chapter13;

interface HandPhone {
    default void call() {
        System.out.println("전화를 건다.");
    }

    default void receive() {
        System.out.println("전화를 받는다.");
    }
}

interface Camera {
    default void takePicture(){ System.out.println("찰칵. 사진을 찍는다."); };
}

interface Mp3 {
    void play();
}

class HandPhoneCamera implements HandPhone,Camera {
}

class SmartPhone implements HandPhone, Camera, Mp3 {

    @Override
    public void play() {
        System.out.println("띵가띵가. 음악재생");
    }
}

public class exam3 {
    public static void main(String[] args) {
        HandPhoneCamera myphone = new HandPhoneCamera();
        myphone.call();
        myphone.takePicture();

        SmartPhone galaxy = new SmartPhone();
        galaxy.call();
        galaxy.takePicture();
        galaxy.play();
    }
}
