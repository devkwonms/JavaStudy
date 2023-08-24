package com.example.chapter17;

import java.util.*;

public class exam14 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("호랑이");
        queue.offer("사자");
        queue.offer("코끼리");

        while (queue.isEmpty() == false) {
            System.out.println(queue.poll());
        }
    }
}
