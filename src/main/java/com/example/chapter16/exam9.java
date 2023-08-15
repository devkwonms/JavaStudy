package com.example.chapter16;

public class exam9 {
    public static void main(String[] args) {
        String str = "0123456789";
        System.out.println(str.substring(3, 7));

        String name = "제 이름은 <권민서>입니다.";
        int st, ed;
        st = name.indexOf('<');
        ed = name.indexOf('>');
        System.out.println(name.substring(st + 1, ed));
    }
}
