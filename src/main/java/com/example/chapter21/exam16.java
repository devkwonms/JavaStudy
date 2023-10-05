package com.example.chapter21;

import java.io.File;

public class exam16 {
    public static void main(String[] args) {
        File f = new File("c:\\Temp\\test.txt");
        if (f.exists()) {
            if (f.isFile()) {
                System.out.println("파일입니다.");
                System.out.println("파일경로 : " + f.getParent());
                System.out.println("파일경로 : " + f.getName());
                System.out.println("파일경로 : " + f.length());
                System.out.println("파일경로 : " + f.isHidden());
                System.out.println("파일경로 : " + f.isAbsolute());
            } else if (f.isDirectory()) {
                System.out.println("디렉터리입니다.");
            }
        } else {
            System.out.println("파일이 없습니다.");
        }
    }
}
