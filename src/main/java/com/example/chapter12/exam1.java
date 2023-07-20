package com.example.chapter12;

class Animal {
    void move() {
        System.out.println("왔다리 갔다리");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("멍멍멍");
    }
}

class Dove extends Animal {
    void fly() {
        System.out.println("퍼득 퍼득");
    }
}

public class exam1 {
    public static void main(String[] args) {
//        // 좌우의 타입이 맞는 경우
//        Animal animal = new Animal();
//        animal.move();
//
//        // 부모 타입에 자식 객체 대입
//        Animal dog = new Dog();
//        dog.move();

//        // dog.bark();

//        // 자식 타입에 부모 객체 대입
//        Dove dove = new Animal();
//        dove.fly();

//        Animal animal = new Animal();
//        Dog dog = new Dog();
//
//        // upCasting
//        Animal up = (Animal) dog;
//        up.move();

//        // downCasting
//        Dog down = (Dog)animal;
//        down.move();
//        down.bark();
        Dog happy = new Dog();
        testAnimal(happy);

        Dove donald = new Dove();
        testAnimal(donald);
    }

    static void testAnimal(Animal animal) {
        animal.move();
        if (animal instanceof Dog) {
            Dog mydog = (Dog) animal;
            mydog.bark();
        }
        if (animal instanceof Dove) {
            Dove mydove = (Dove) animal;
            mydove.fly();
        }

    }
}
