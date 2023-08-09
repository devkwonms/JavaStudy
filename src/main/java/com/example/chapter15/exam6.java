package com.example.chapter15;

public class exam6 {
    public static void main(String[] args) {
//        Integer wrapint = new Integer("629"); // 사라질 방법이며, wrapper클래스를 생성자를 통해 만드는 것은 권장x
        Integer wrapint = 629;
        String str = wrapint.toString();
        int i = Integer.parseInt(str);
        System.out.println(i);
    }
}
