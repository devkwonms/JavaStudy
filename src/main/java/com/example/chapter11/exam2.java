package com.example.chapter11;

class Car {
    String name;
    boolean gasoline;

    Car(String name, boolean gasoline) {
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
}

class Truck extends Car {
    int ton;

    Truck(String name, int ton) {
        super(name, false);
        this.ton = ton;
    }

    void load() {
        System.out.println("짐을 싣는다.");
    }
}

public class exam2 {
    public static void main(String[] args) {
        Truck porter = new Truck("포터", 1);
        porter.run();
        porter.load();
    }
}
