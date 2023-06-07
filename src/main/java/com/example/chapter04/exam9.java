package com.example.chapter04;

public class exam9 {
    public static void main(String[]args){

        int days;
        int month = 9;

        switch (month){
            case 2 :
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        System.out.println(month + "월은 " + days + "일까지 있습니다.");
    }
}
