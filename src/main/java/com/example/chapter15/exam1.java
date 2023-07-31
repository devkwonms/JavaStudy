package com.example.chapter15;

import java.lang.reflect.*;

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() {
        return new Human(age, name);
    }

    void intro() {
        System.out.println("안녕, " + age + "살 " + name + "입니다.");
    }

    public String toString() {
        return age + "세의 " + name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Human) {
            Human other = (Human) obj;
            return (age == other.age && name.equals(other.name));
        } else {
            return false;
        }
    }
}

public class exam1 {
    public static void main(String[] args) {
        int i = 1234;
//        System.out.println(i);

        Human kim = new Human(29, "김상형");
//        System.out.println(kim);
        Human kim2 = (Human) kim.clone();
        kim2.name = "이순신";

        System.out.println("kim.name = " + kim.name);
        System.out.println("kim2.name = " + kim2.name);

        Class cls = kim.getClass();
        System.out.println("클래스 이름 = " + cls.getName());
        System.out.println("슈퍼 클래스 = " + cls.getSuperclass().getName());

        System.out.print("필드 : ");
        Field[] fields = cls.getDeclaredFields();
        for (Field F : fields) {
            System.out.print(F.getName() + " ");
        }

        System.out.println();

        System.out.print("메서드 : ");
        Method[] methods = cls.getDeclaredMethods();
        for (Method M : methods) {
            System.out.print(M.getName() + " ");
        }

//        String str = "범인 : " + kim;
//        System.out.println(str);

//        Human kwon = new Human(29, "권민서");
//        Human lee = new Human(29, "이우림");
//
//        Human kwonCopy = kwon;
//        Human kwon2 = new Human(29, "권민서");
//
//        // 참조형 객체에서의 == : 같은 참조형객체를 바라보는지 의 진위 여부 (객체의 모든 내부 필드 값이 서로 같아도 바라보는 대상이 다르면 false)
//        System.out.println("kwon == lee : " + (kwon == lee ? "같다" : "다르다"));
//        System.out.println("kwon == kwonCopy : " + (kwon == kwonCopy ? "같다" : "다르다"));
//        System.out.println("kwon == kwon2 : " + (kwon == kwon2 ? "같다" : "다르다"));
//
//        System.out.println("==============================");
//
//        // 참조형 객체에서의 equals : 객체가 같은,다른 대상을 바라보는 지 따지지 않고 내부의 필드값이 모두 일치하는지 알맹이의 같고 다름 여부에 따라 진위따짐
//        System.out.println("kwon.equals(lee) : " + (kwon.equals(lee) ? "같다" : "다르다"));
//        System.out.println("kwon.equals(kwonCopy) : " + (kwon.equals(kwonCopy) ? "같다" : "다르다"));
//        System.out.println("kwon.equals(kwon2) : " + (kwon.equals(kwon2) ? "같다" : "다르다"));


    }
}
