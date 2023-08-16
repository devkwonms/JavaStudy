package com.example.chapter16;

import java.util.Arrays;
import java.util.List;

public class exam12 {
    public static void main(String[] args) {
        String path = String.join("/", "user", "data", "app", "local");
        System.out.println(path);

        String seoul = "서울", daejun = "대전", daegu = "대구", busan = "부산";
        String city = String.join(",", seoul, daejun, daegu, busan);
        System.out.println(city);

        List<String> subway = Arrays.asList("서울역", "남영", "용산", "노량진");
        System.out.println(String.join("->", subway));

    }
}
