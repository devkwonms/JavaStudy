package com.example.chapter09;

class Car {
    String name;
    boolean gasoline;

    Car(String aName, boolean aGasoline) {
        name = aName;
        gasoline = aGasoline;
    }

    void run() {
        if (gasoline) {
            System.out.println("부릉부릉");
        } else {
            System.out.println("덜컹덜컹");
        }
    }

    void stop() {
        System.out.println("끼이익");
    }
}

public class exam1 {
    public static void main(String[] args) {

        Car korando = new Car("코란도C", false);

        korando.run();
        korando.stop();

        Car equus = new Car("에꿍스", true);

        equus.run();
        equus.stop();
    }
}
