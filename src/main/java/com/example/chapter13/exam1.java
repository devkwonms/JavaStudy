package com.example.chapter13;

class Marine {

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

class Zealot {
    void move() {
        System.out.println("뒤뚱뒤뚱");
    }

    void attack() {
        System.out.println("우갸 우갸 챙챙");
    }
}

class Mutal {
    void move() {
        System.out.println("퍼득 퍼득");
    }

    void attack() {
        System.out.println("삼지창 휙휙");
    }
}

public class exam1 {
    public static void main(String[] args) {
        Marine marine = new Marine();
        marine.move();
        marine.attack();

        Zealot zealot = new Zealot();
        zealot.move();
        zealot.attack();

    }
}
