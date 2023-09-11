package com.example.chapter19;

public class exam7 {
    public static void main(String[] args) {
        String name = null;
        printScore(name);
    }

    static void printScore(String name) {
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("이름이 무효합니다.");
        }
    }
}
