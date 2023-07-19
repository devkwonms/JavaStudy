package com.example.chapter11;

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human(float birth, String name) {
        this(0, name);
        java.time.LocalDate now = java.time.LocalDate.now();
        this.age = now.getYear() - (int) birth + 1;
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

    Student(float birth, String name, int stnum, String major) {
        super(birth, name);
        this.stnum = stnum;
        this.major = major;
    }
    @Override
    void intro() {
        System.out.println(major + "학과" + stnum + "학번" + name + "입니다.");
    }

    void study() {
        System.out.println("공부를 합니다.");
    }
}

class Soldier extends Human {
    int milnum;

    Soldier(int age, String name, int milnum) {
        super(age, name);
        this.milnum = milnum;
    }

    void fight() {
        System.out.println("따콩 따콩. 앞으로 전진!!");
    }
}

class Thief extends Human {
    String item;
    int star;

    Thief(int age, String name, String item, int star) {
        super(age, name);
        this.item = item;
        this.star = star;
    }

    void steal() {
        System.out.println("살금살금~~ 후다닥~~");
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
        Human kwon = new Human(29, "권민서");
        kwon.intro();

        Student lee = new Student(29, "이우림", 950403, "컴공");
        lee.intro();
        lee.study();

        Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구");
        park.intro();
        park.study();
        park.research();

        Student kim = new Student(39, "노정란", 9908123, "건축");
        kim.intro();

        Student bae = new Student(1989.10f, "배지영", 1125034, "간호");
        bae.intro();

        Student choi = new Student(35, "최현석", 150629, "주자학");
        choi.study();
        choi.intro();

        Soldier kang = new Soldier(45, "강감찬", 12345);
        kang.fight();

        Thief hong = new Thief(15, "홍길동", "부잣집", 2);
        hong.steal();
    }
}
