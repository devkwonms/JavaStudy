package com.example.chapter05;

public class exam24 {
    public static void main(String[]args){
        for(int i = 1; i<=9; i++){
            for(int j =1; j <=9; j++){
                if(i == 2 && j == 3)break;
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println("");
        }
    }
}
