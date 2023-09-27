package com.example.chapter21;

import java.io.IOException;

public class exam12 {
    public static void main(String[] args) {
        int name;
        System.out.println("이름을 입력한 후 Enter를 누르시오(끝낼 때는 Ctrl + Z).");
        for (; ; ) {
            try {
                name = System.in.read();
                if (name == -1) break;
                System.out.print((char) name);
            } catch (IOException e) {
                System.out.println("input error");
            }
        }
        System.out.println("입력완료");
    }
}
