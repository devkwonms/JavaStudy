package com.example.chapter17;

import java.util.*;

public class exam13 {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("호랑이");
        stack.push("사자");
        stack.push("코끼리");
        stack.addLast("기린");

        while (stack.isEmpty() == false) {
            System.out.println(stack.pop());
        }
    }
}
