package com.example.chapter13;

interface Unit {
    void move();

    void attack();
}

class Marine implements Unit {

    public void move() {
        System.out.println("아장아장");
    }

    public void attack() {
        System.out.println("두두두두두");
    }

    public void bunker() {
        System.out.println("쏙~ 숨었지롱");
    }
}

class Zealot implements Unit {
    public void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    public void attack() {
        System.out.println("우갸 우갸 챙챙");
    }
}

class Mutal implements Unit {
    public void move() {
        System.out.println("퍼득 퍼득");
    }

    public void attack() {
        System.out.println("삼지창 휙휙");
    }
}

class SuperMan implements Unit {
    public void move() {
        System.out.println("슈우우웅~~~");
    }

    public void attack() {
        System.out.println("빠직빠직");
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
                new SuperMan(),
        };
        for (Unit u : arUnit) {
            u.move();
            u.attack();
        }

    }
}
