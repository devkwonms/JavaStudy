package com.example.chapter13;

abstract sealed class Language permits Java, Cpp, CSharp {
}

final class Java extends Language {
}

final class Cpp extends Language {
}

final class CSharp extends Language {
}

public class exam2 {
    public static void main(String[] args) {
        Language lang_java = new Java();
        outLanguageName(lang_java);

    }

    public static void outLanguageName(Language lang) {
        if (lang instanceof Java) {
            System.out.println("자바");
        } else if (lang instanceof Cpp) {
            System.out.println("C++");
        } else if (lang instanceof CSharp) {
            System.out.println("C#");
        }
    }
}