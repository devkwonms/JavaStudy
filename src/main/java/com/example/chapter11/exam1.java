package com.example.chapter11;

class Notebook {
    final String CPU;
    int memory;
    int storage;

    Notebook(String CPU, int memory, int storage) {
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void printSpec() {
        System.out.print("CPU = " + CPU);
        System.out.print(" ,Memory = " + memory);
        System.out.println(" ,Storage = " + storage);
    }
}

class Human {
    int age;
    String name;
    Notebook book = new Notebook("", 0, 0);

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human(float birth, String name) {
        this(0, name);
        java.time.LocalDate now = java.time.LocalDate.now();
        this.age = now.getYear() - (int) birth + 1;
    }

    Human(int age, String name, String CPU, int memory, int storage) {
        book = new Notebook(CPU, memory, storage);
        this.age = age;
        this.name = name;
    }

    void intro() {
        System.out.println("안녕," + age + "살 " + name + "입니다.");
        System.out.print("나의 노트북 : ");
        book.printSpec();
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
        super.intro();      //  부모의 overriding한 메서드를 직접 호출하고 싶을 때 super.method
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

    @Override
    void intro() {
        System.out.println("충성. 군번 : " + milnum + "입니다.");
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

    @Override
    void intro() {
        System.out.println(item + " 전문 털이범 전과 " + star + "범입니다.");
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
//
//        Graduate park = new Graduate(35, "박대희", 95001122, "전산", "웹 보안에 대한 연구");
//        park.intro();
//        park.study();
//        park.research();
//
//        Student kim = new Student(39, "노정란", 9908123, "건축");
//        kim.intro();
//
//        Student bae = new Student(1989.10f, "배지영", 1125034, "간호");
//        bae.intro();
//
//        Student choi = new Student(35, "최현석", 150629, "주자학");
//        choi.study();
//        choi.intro();
//
//        Soldier kang = new Soldier(45, "강감찬", 12345);
//        kang.fight();
//
//        Thief hong = new Thief(15, "홍길동", "부잣집", 2);
//        hong.steal();
//
//        Human song = new Human(29, "송지훈", "i7 Core", 8, 2000);
//        song.intro();
//
//        Human baek = new Human(29, "백상형");
//        Student cho = new Student(42, "조승우", 9312345, "경영");
//
//        introHuman(baek);
//        introHuman(cho);
        Human[] arHuman = {
                new Human(29, "김상형"),
                new Student(42, "이승우", 9312345, "경영"),
                new Soldier(45, "강감찬", 12345),
                new Thief(15, "홍길동", "부잣집", 2),
        };

        dumpGroup(arHuman);

    }

    static void introHuman(Human who) {
        who.intro();
    }

    static void dumpGroup(Human[] group) {
        for (Human h : group) {
            h.intro();
        }
    }
}
