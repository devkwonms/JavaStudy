package com.example.chapter09;

class Car {
    String name;
    boolean gasoline;

    Car(String name, boolean gasoline) {
        init(name, gasoline);
    }

    void init(String name, boolean gasoline) {
        this.name = name;
        this.gasoline = gasoline;
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

        korando.init("제네시스", true);

        korando.run();
        korando.stop();
    }
}
