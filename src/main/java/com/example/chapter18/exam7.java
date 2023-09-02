package com.example.chapter18;

import java.util.*;

class JavaTest {
    static <T> void dumpArray(ArrayList<T> ar) {
        for (T a : ar) {
            System.out.println(a);
        }
    }
}

public class exam7 {
    public static void main(String[] args) {
        ArrayList<String> yoil = new ArrayList<>();
        yoil.add("일요일");
        yoil.add("월요일");
        JavaTest.<String>dumpArray(yoil);

        ArrayList<Integer> score = new ArrayList<>();
        score.add(98);
        score.add(72);
        JavaTest.<Integer>dumpArray(score);
    }
}
