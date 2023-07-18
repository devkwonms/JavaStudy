package com.example.chapter11;

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("안녕," + age + "살 " + name + "입니다.");
    }
}

class Student extends Human {
    int stnum;
    String major;

    Student(int age, String name, int stnum, String major) {
        super(age, name);   // 부모의 생성자에게 초기화 위임
        this.stnum = stnum;
        this.major = major;
    }

    void study() {
        System.out.println("공부를 합니다.");
    }
}

class Graduate extends Student {

    String thesis;

    Graduate(int age, String name, int stnum, String major, String thesis) {
        super(age, name, stnum, major);
        this.thesis = thesis;
    }

    void research() {
        System.out.println("뭘 연구해야 떼돈을 벌까?");
    }
}

public class exam1 {
    public static void main(String[] args) {
//        Human kwon = new Human(29, "권민서");
//        kwon.intro();
//
//        Student lee = new Student(29, "이우림", 950403, "컴공");
//        lee.intro();
//        lee.study();

        Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구");
        park.intro();
        park.study();
        park.research();
    }
}
