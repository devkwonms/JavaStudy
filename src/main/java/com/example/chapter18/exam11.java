package com.example.chapter18;

public class exam11 {
    static void printMan(Box<? extends Human> box) {
        box.get().intro();
    }

    public static void main(String[] args) {
        Human h = new Human();
        Box<Human> bh = new Box<Human>(h);
        printMan(bh);

        Student s = new Student();
        Box<Student> bs = new Box<Student>(s);
        printMan(bs);
    }
}
