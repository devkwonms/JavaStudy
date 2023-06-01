package com.example.chapter03;

public class exam10 {
    public static void main(String[]args){
        float f = 0f;
        
        for(int i=0; i<1000; i++){
            f += 0.1f;
        }
        System.out.println("f = " + f);
    }
}
