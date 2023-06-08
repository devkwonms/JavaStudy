package com.example.chapter04;

public class exam17 {
    public static void main(String[]args){

        boolean card =  false;
        int money = 6000;

        if (card) {
            System.out.println("탕수육을 먹습니다.");
        } else {
            if (money >= 5000) {
                System.out.println("짬뽕을 먹습니다.");
            } else {
                System.out.println("짜장면을 먹습니다.");
            }
        }
    }
}
