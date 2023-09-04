package com.example.chapter18;

import java.util.*;

class Human1 {
}

class Student1 extends Human1 {
}

public class exam10 {
    public static void main(String[] args) {
        ArrayList<Human1> ah = new ArrayList<>();
        ArrayList<Student1> as = new ArrayList<>();

        ah.add(new Human1());
        as.add(new Student1());
        ah.add(new Student1());

//        ah = as;
        ah.add(new Human1());
        Student1 k = as.get(1);
    }
}
