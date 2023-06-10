package com.example.chapter05;

public class exam5 {
    public static void main(String[]args){
        int sum = 0;
        int i;
        for(i=1; i<100; i++){
            sum = sum +i;
            if(sum>100)break;
        }
        System.out.println("100이 넘는 시점은 " + i + " 입니다.");
    }
}
