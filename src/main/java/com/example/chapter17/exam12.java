package com.example.chapter17;

import java.util.*;

public class exam12 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("호랑이");
        stack.push("사자");
        stack.push("코끼리");

        while (stack.empty() == false) {
            System.out.println(stack.pop());
        }
    }
}
