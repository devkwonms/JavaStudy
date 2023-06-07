package com.example.chapter04;

public class exam5 {
    public static void main(String[]args){
        int age = 25;
        boolean man = true;

        if(age >= 19) {
            if (man) {
                System.out.println("성인남성 : 25000원");
            } else {
                System.out.println("성인여성 : 21000원");
            }
        }else{
            System.out.println("청소년 : 15000원");
        }
    }
}
