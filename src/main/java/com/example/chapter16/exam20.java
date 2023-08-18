package com.example.chapter16;

public class exam20 {
    public static void main(String[] args) {
//        String text = "korea";
//        System.out.println(text.transform(t -> t + "hello"));

        String num = "12";
        System.out.println(num.transform(Integer::parseInt) * 2);
    }
}
