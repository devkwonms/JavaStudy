package com.example.chapter04;

public class exam7 {
    public static void main(String[]args){
        int ranking = 2;

        switch (ranking){
            case 1:
                System.out.println("금메달 축하합니다");
                break;
            case 2:
                System.out.println("은메달 축하합니다");
                break;
            case 3:
                System.out.println("동메달 축하합니다");
                break;
            default:
                System.out.println("참가상을 드립니다");
                break;
        }
    }
}
