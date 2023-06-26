package com.example.chapter07;

public class exam11 {
    public static void main(String[]args){
        int[] ar = { 1, 2, 3 };
        int[] ar2 = ar;

        ar2[0] = 1000;

        System.out.println("ar[0] = " + ar[0]);
        System.out.println("ar2[0] = " + ar2[0]);
    }
}
