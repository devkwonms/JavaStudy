package com.example.chapter18;

class Human {
    void intro() {
        System.out.println("나 사람");
    }
}

class Student extends Human {
    @Override
    void intro() {
        System.out.println("나 학생");
    }
}

class Box1<T extends Human> {
    T value;

    Box1(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }

    void set(T value) {
        this.value = value;
    }

    void intro() {
        value.intro();
    }
}

public class exam9 {
    public static void main(String[] args) {
        Human h = new Human();
        Box1<Human> bh = new Box1<>(h);
        bh.intro();

        Student s = new Student();
        Box1<Human> bs = new Box1<>(s);
        bs.intro();
    }
}
