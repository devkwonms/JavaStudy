package com.example.chapter05;

import java.util.Scanner;

public class exam8 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int)(Math.random()*10)+1;
        for(;;){
            System.out.println("숫자를 맞춰보세요(1~10):");
            int input = scanner.nextInt();
            if(input == num){
                System.out.println("정답입니다.");
                break;
            }else if(input > num){
                System.out.println(input + " 보다 더 작은 숫자입니다.");
            }else{
                System.out.println(input + " 보다 더 큰 숫자입니다.");
            }
        }
        scanner.close();
    }
}
