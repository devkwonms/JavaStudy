package com.example.chapter12;

class Transport {
    void ride() {
        System.out.print("이동한다");
    }
}

class Bike extends Transport {
    @Override
    void ride() {
        System.out.print("따르릉 따르릉");
    }
}

class AutoBike extends Transport {
    @Override
    void ride() {
        System.out.print("빠라바라 빠라밤");
    }

    void bikeShow() {
        System.out.println("앞 바퀴 들고 부르릉...");
    }
}

class SkyKongKong extends Transport {
    @Override
    void ride() {
        System.out.print("콩콩콩콩");
    }

    void rotate() {
        System.out.println("공중회전 묘기");
    }
}

class DeliveryMan {
    void delivery(Transport tran, String food) {
        tran.ride();
        System.out.println("타고 가서 " + food + "를 배달합니다!");
    }
}

public class exam2 {
    public static void main(String[] args) {
        DeliveryMan kang = new DeliveryMan();
        kang.delivery(new Bike(), "짜장면");
        kang.delivery(new AutoBike(), "피자");
        kang.delivery(new SkyKongKong(), "햄버거");
    }
}
