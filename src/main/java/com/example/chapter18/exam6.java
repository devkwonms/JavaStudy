package com.example.chapter18;

public class exam6 {
    static <T> void print(T a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        exam6.<Integer>print(1234);
        exam6.<String>print("문자열");

    }
}
