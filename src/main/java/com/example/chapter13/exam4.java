package com.example.chapter13;

interface A {
    default void print() {
        System.out.println("인쇄한다.");
    }
}

interface B {
    default void print() {
        System.out.println("출력한다.");
    }
}

class C implements A, B {
    public void print() {
        A.super.print();
    }
}

public class exam4 {
    public static void main(String[] args) {
        C c = new C();
        c.print();

    }
}
