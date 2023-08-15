package com.example.chapter16;

public class exam6 {
    public static void main(String[] args) {
        String str = "Kim Sang Hyung";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // 문자열 자체를 변경하는 것은 아니다.
        str.toUpperCase();
        System.out.println(str);

        // 문자열을 변경하려면 다시 대입 받아야 한다.
        str = str.toUpperCase();
        System.out.println(str);
    }
}
