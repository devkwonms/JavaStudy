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

        String str = "범인 : " + kim;
//        System.out.println(str);

        Human kwon = new Human(29, "권민서");
        Human lee = new Human(29, "이우림");

        Human kwonCopy = kwon;
        Human kwon2 = new Human(29, "권민서");

        // 참조형 객체에서의 == : 같은 참조형객체를 바라보는지 의 진위 여부 (객체의 모든 내부 필드 값이 서로 같아도 바라보는 대상이 다르면 false)
        System.out.println("kwon == lee : " + (kwon == lee ? "같다" : "다르다"));
        System.out.println("kwon == kwonCopy : " + (kwon == kwonCopy ? "같다" : "다르다"));
        System.out.println("kwon == kwon2 : " + (kwon == kwon2 ? "같다" : "다르다"));

        System.out.println("==============================");

        // 참조형 객체에서의 equals : 객체가 같은,다른 대상을 바라보는 지 따지지 않고 내부의 필드값이 모두 일치하는지 알맹이의 같고 다름 여부에 따라 진위따짐
        System.out.println("kwon.equals(lee) : " + (kwon.equals(lee) ? "같다" : "다르다"));
        System.out.println("kwon.equals(kwonCopy) : " + (kwon.equals(kwonCopy) ? "같다" : "다르다"));
        System.out.println("kwon.equals(kwon2) : " + (kwon.equals(kwon2) ? "같다" : "다르다"));


    }
}
