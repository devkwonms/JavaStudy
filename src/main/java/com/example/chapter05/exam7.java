package com.example.chapter05;

import java.util.Scanner;

public class exam7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int grade;

        for(;;){
            System.out.println("몇 학년 입니까?(1~6)");
            grade = scanner.nextInt();
            if(grade>=1 && grade <=6) break;
            System.out.println("다시 입력하시오.");
        }
        System.out.println(grade + " 학년입니다.");
        scanner.close();
    }
}
