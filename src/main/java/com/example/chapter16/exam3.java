package com.example.chapter16;

public class exam3 {
    public static void main(String[] args) {
        String str1 = "KOREA";
        String str2 = "korea";

        System.out.println(str1.equals(str2) ? "같다" : "다르다");
        System.out.println(str1.equalsIgnoreCase(str2) ? "같다" : "다르다");

        String apple = "Apple";
        String orange = "Orange";
        int Result = apple.compareTo(orange);
        if (Result == 0) {
            System.out.println("같다");
        } else if (Result < 0) {
            System.out.println("Apple이 더 앞쪽");
        } else if (Result > 0) {
            System.out.println("Apple이 더 뒤쪽");
        }
    }
}
