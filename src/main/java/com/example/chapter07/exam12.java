package com.example.chapter07;

public class exam12 {
    public static void main(String[] args) {
        int i = 123, i2 = 123;
        int[] ar = {1, 2, 3}, ar2 = {1, 2, 3};
        int[] ar3 = ar;

        System.out.println("i와 i2 : " + (i == i2 ? "같다" : "다르다"));
        System.out.println("ar와 ar2 : " + (ar == ar2 ? "같다" : "다르다"));
        System.out.println("ar와 ar3 : " + (ar == ar3 ? "같다" : "다르다"));
    }
}
