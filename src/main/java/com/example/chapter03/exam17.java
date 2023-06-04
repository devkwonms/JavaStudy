package com.example.chapter03;

public class exam17 {
    public static void main(String[]args){
        String name = "권민서";
        String str = """
                안녕하세요.
                제 이름은\s""" + name + """
                입니다.
                잘 부탁 드립니다!
                """;
        System.out.println(str);
    }
}
