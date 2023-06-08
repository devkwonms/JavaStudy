package com.example.chapter04;

public class exam16 {
    public static void main(String[]args) {
        int ranking = 1;
        String medal =
                switch (ranking) {
                    case 1 ->  {
                        System.out.println("축하합니다.");
                        yield "금메달";
                    }
                    case 2 -> "은메달";
                    case 3 -> "동메달";
                    default -> "참가상";
                };
        System.out.println(medal + "을 수여합니다.");
    }
}
