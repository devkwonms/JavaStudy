package com.example.chapter09;

class InitTest {
    int field = 1;      // 명시적 초기화

    {
        field = 2;      // 초기화 블록
    }

    InitTest() {
        field = 3;      // 생성자
    }
}

public class exam4 {
    public static void main(String[] args) {
        InitTest init = new InitTest();
        System.out.println(init.field);
    }
}
