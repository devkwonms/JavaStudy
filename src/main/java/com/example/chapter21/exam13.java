package com.example.chapter21;

import java.util.Scanner;

public class exam13 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        System.out.println("입력값의 2배 = " + i * 2);
    }
}
