package com.example.chapter04;

public class exam8 {
    public static void main(String[]args){
        int ranking = 3;

        switch (ranking){
            case 1:
                System.out.println("대상입니다!");
                break;
            case 2:
            case 3:
                System.out.println("우수상입니다!");
                break;
            case 4:
            case 5:
                System.out.println("장려상입니다!");
                break;
        }
    }
}
