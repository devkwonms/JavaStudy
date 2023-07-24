package com.example.chapter13;

interface Unit {
    void move();

    void attack();

    default void die() {
        System.out.println("꽥꼬닥");
    }
}

interface Hideable extends Unit {
    void hide();
}

interface Healing extends Unit {
    void heal();
}

class DarkTempler implements Hideable {

    public void move() {
        System.out.println("스믈 스믈");
    }

    public void attack() {
        System.out.println("슉슉 낫질");
    }

    public void hide() {
        System.out.println("안보이지롱");
    }
}

class Medic implements Healing {

    public void move() {
        System.out.println("쫄래 쫄래");
    }

    public void attack() {
        System.out.println("치지지직");
    }

    public void heal() {
        System.out.println("마린씨 일루와");
    }
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

class Firebat extends Marine {

    public void attack() {
        System.out.println("화르르르~~");
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
//        Unit[] arUnit = {
//                new Marine(),
//                new Zealot(),
//                new Mutal(),
//                new SuperMan(),
//                new Firebat(),
//        };
//        for (Unit u : arUnit) {
//            u.move();
//            u.attack();
//        }
        DarkTempler dt = new DarkTempler();
        dt.hide();

        Medic medic = new Medic();
        medic.heal();

        new Marine().die();

        new Zealot().die();

    }
}
