package com.example.chapter13;

class HandPhone {
    void call() {
        System.out.println("전화를 건다.");
    }

    void receive() {
        System.out.println("전화를 받는다.");
    }
}

interface Camera {
    void takePicture();
}

interface Mp3 {
    void play();
}

class HandPhoneCamera extends HandPhone implements Camera {
    public void takePicture() {
        System.out.println("찰칵. 사진을 찍는다.");
    }
}

class SmartPhone extends HandPhone implements Camera, Mp3 {

    @Override
    public void takePicture() {
        System.out.println("찰칵. 사진을 찍는다");
    }

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
