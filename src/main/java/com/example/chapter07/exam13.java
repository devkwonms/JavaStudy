package com.example.chapter07;

public class exam13 {
    public static void main(String[]args){

        int[] ar = {1, 2, 3};
        System.out.println(ar[0]);

        ar = null;

        if( ar != null) {
            System.out.println(ar[0]);
        }
    }
}
