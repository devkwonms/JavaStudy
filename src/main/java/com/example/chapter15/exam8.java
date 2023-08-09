package com.example.chapter15;

public class exam8 {
    public static void main(String[] args) {
        Integer wrapint = new Integer(629);
        int i = wrapint.intValue();
        System.out.println("i = " + i);

        Double wrapdouble = new Double("3.14");
        int di = wrapdouble.intValue();
        System.out.println("di = " + di);
    }
}
