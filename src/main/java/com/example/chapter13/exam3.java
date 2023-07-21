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

class HandPhoneCamera extends HandPhone implements Camera {
    public void takePicture() {
        System.out.println("찰칵. 사진을 찍는다.");
    }
}

public class exam3 {
    public static void main(String[] args) {
        HandPhoneCamera myphone = new HandPhoneCamera();
        myphone.call();
        myphone.takePicture();
    }
}
