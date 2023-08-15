package com.example.chapter16;

public class exam5 {
    public static void main(String[] args) {
        String[] files = {
                "girl.jpg",
                "boy.png",
                "chiild.avi",
                "school.jpg",
                "book.gif"
        };
        for (String s : files) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
            }
        }
    }
}
