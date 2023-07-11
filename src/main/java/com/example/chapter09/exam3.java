package com.example.chapter09;

class Human {
    int age;
    String name;

    void intro() {
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
    }
}

public class exam3 {
    public static void main(String[] args) {
        Human kwon = new Human();
        kwon.age = 29;
        kwon.name = "권민서";

        kwon.intro();
    }
}
