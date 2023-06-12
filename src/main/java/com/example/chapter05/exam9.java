package com.example.chapter05;

import java.util.Scanner;

public class exam9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            int num = (int) (Math.random() * 10) + 1;
            System.out.println("num = " + num);

            boolean playAgain = true;
            for (;;) {
                System.out.println("숫자를 맞춰보세요(1~10)");
                int input = scanner.nextInt();
                if (input == num) {
                    System.out.println("정답입니다!");
                    System.out.println("한판 더 하시겠습니까?");
                    String yn = scanner.next();

                    System.out.println("yn = " + yn);
                    if (yn.equalsIgnoreCase("N")) {
                        playAgain = false;
                        break;
                    } else {
                        num = (int) (Math.random() * 10) + 1; // 새로운 num 값 생성
                        System.out.println("num = " + num);
                    }
                } else if (input < num) {
                    System.out.println(input + "보다 더 큰 숫자입니다");
                } else {
                    System.out.println(input + "보다 더 작은 숫자입니다");
                }
            }

            if (!playAgain) {
                break;
            }
        }
        System.out.println("종료..");
        scanner.close();
    }
}
