package com.example.chapter05;

import java.util.Scanner;

public class exam22 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        do{
            System.out.print("숫자를 입력하세요(끝낼 때 0) :");
            num = scanner.nextInt();
            sum = sum + num;
        }while (num !=0);
            System.out.println("총 합계 = " + sum);
            scanner.close();

    }
}
