package com.example.chapter15;

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + "세의 " + name;
    }
}

public class exam1 {
    public static void main(String[] args) {
        int i = 1234;
        System.out.println(i);

        Human kim = new Human(29, "김상형");
        System.out.println(kim);

        String str = "범인 : " + kim;
        System.out.println(str);

    }
}
