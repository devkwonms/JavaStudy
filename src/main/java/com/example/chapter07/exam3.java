package com.example.chapter07;

public class exam3 {
    public static void main(String[]args){

        // 간편한 초기화
        int[] score = {88,99,75,55,100};
        for(int i = 0; i < score.length; i++){
            if(i == score.length-1){
                System.out.print(score[i]);
            }else{
                System.out.print(score[i] + ", ");
            }
        }
        System.out.println();

        // 재초기화
        score = new int[]{1,2,3,4,5,6,7,8};

        for(int i = 0; i < score.length; i++){
            if(i == score.length-1){
                System.out.print(score[i]);
            }else{
                System.out.print(score[i] + ", ");
            }
        }
    }
}
