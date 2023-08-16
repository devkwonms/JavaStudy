package com.example.chapter16;

public class exam13 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1000; i++) {
            for (char ch = 'A'; ch <= 'z'; ch++) {
                str += ch;
            }
            str += '\n';
        }
        System.out.println(str);
        System.out.println((System.currentTimeMillis() - start) / 1000.0 + "초");
    }
}
