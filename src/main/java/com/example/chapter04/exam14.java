package com.example.chapter04;

public class exam14 {
    public static void main(String[]args){
        int ranking = 2;
        String medal =
                switch (ranking){
                case 1 ->"금메달";
                case 2 ->"은메달";
                case 3 ->"동메달";
                default ->"참가상";
                };
        System.out.println(medal + "을 수여합니다.");
    }
}
