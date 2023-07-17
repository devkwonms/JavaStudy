package com.example.chapter10;

class Hello {
    static void morining() {
        System.out.println("좋은 아침");
    }

    static void lunch() {
        System.out.println("점심 먹었어?");
    }

    static void evening() {
        System.out.println("술 한잔 어때");
    }
}

public class exam5 {
    public static void main(String[] args) {
        Hello.morining();
        Hello.lunch();
        Hello.evening();
    }
}
