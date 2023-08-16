package com.example.chapter16;

public class exam14 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < 1000; i++) {
            for (char ch = 'A'; ch <= 'z'; ch++) {
                str.append(ch);
            }
            str.append('\n');
        }
        System.out.println(str);
        System.out.println((System.currentTimeMillis() - start) / 1000.0 + "초");
    }
}
