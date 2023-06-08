package com.example.chapter04;

public class exam15 {
    public static void main(String[]args){
        int ranking = 1;
        
        switch(ranking){
            case 1 -> System.out.println("축하합니다. 금메달이에요.");
            case 2 -> System.out.println("은메달을 수여합니다.");
            case 3 -> System.out.println("동메달입니다.");
            default -> System.out.println("참가상을 드립니다.");
        }
    }
}
