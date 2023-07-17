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
    static void resetNum(){
        carNum = 0;
    }
    static void printNum(){
        System.out.println("현재 출고 대수 : " + carNum);
    }
    
    void run(){
        if(gasoline){
            System.out.println("부릉부릉");
        }else{
            System.out.println("덜컹덜컹");
        }
    }
}

public class exam3 {
    public static void main(String[] args) {

        System.out.println("생성전 : " + Car.carNum);

        Car.printNum();

        Car korando = new Car("코란도C", false);
        System.out.println(korando.name + " : " + Car.carNum);

        Car equus = new Car("에꿍스", true);
        System.out.println(equus.name + " : " + Car.carNum);

        Car.printNum();
        Car.resetNum();

        Car pride = new Car("프라이드", true);
        System.out.println(pride.name + " : " + Car.carNum);

        Car.printNum();
    }
}
