package com.example.chapter13;

abstract class Unit {
    abstract void move();

    abstract void attack();
}

class Marine extends Unit {

    void move() {
        System.out.println("아장아장");
    }

    void attack() {
        System.out.println("두두두두두");
    }

    void bunker() {
        System.out.println("쏙~ 숨었지롱");
    }
}

class Zealot extends Unit {
    void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    void attack() {
        System.out.println("우갸 우갸 챙챙");
    }
}

class Mutal extends Unit {
    void move() {
        System.out.println("퍼득 퍼득");
    }

    void attack() {
        System.out.println("삼지창 휙휙");
    }
}

public class exam1 {
    public static void main(String[] args) {
//        Marine marine = new Marine();
//        marine.move();
//        marine.attack();
//
//        Zealot zealot = new Zealot();
//        zealot.move();
//        zealot.attack();
        Unit[] arUnit = {
                new Marine(),
                new Zealot(),
                new Mutal(),
        };
        for (Unit u : arUnit) {
            u.move();
            u.attack();
        }

    }
}
