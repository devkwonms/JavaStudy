package com.example.chapter19;

public class exam10 {
    public static void main(String[] args) {
        System.out.println("접속");
        try {
            System.out.println("전송");
            System.out.println("해제");
        } catch (Exception e) {
            System.out.println("예외 처리");
            System.out.println("해제");
        }
    }
}
