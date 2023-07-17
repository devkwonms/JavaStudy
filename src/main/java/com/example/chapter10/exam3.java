package com.example.chapter10;

class Car {
    String name;
    boolean gasoline;
    static int carNum;

    Car(String aName, boolean aGasoline) {
        name = aName;
        gasoline = aGasoline;
        carNum++;
    }
}

public class exam3 {
    public static void main(String[] args) {

        System.out.println("생성전 : " + Car.carNum);

        Car korando = new Car("코란도C", false);
        System.out.println(korando.name + " : " + korando.carNum);

        Car equus = new Car("에꿍스", true);
        System.out.println(equus.name + " : " + equus.carNum);

        Car pride = new Car("프라이드", true);
        System.out.println(pride.name + " : " + pride.carNum);
    }
}
