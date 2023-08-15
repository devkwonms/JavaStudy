package com.example.chapter16;

public class exam11 {
    public static void main(String[] args) {
        String city = "서울,대전,대구,부산";
        String[] token = city.split(",");

        for (String s : token){
            System.out.println(s);
        }
    }
}
