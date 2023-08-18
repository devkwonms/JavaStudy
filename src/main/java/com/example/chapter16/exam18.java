package com.example.chapter16;

import java.util.stream.Stream;

public class exam18 {
    public static void main(String[] args) {
        String text = "apple\norange\nbanana";
        Stream<String> fruits = text.lines();
        fruits.forEach(System.out::println);
    }
}
