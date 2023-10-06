package com.example.chapter21;

import java.io.*;

public class exam17 {
    public static void main(String[] args) throws Exception {
        File folder = new File("c:\\TestFolder");
        if (folder.mkdir()) {
            File file = new File("c:\\TestFolder\\MyFile.txt");
            if (file.createNewFile()) {
                FileWriter out = new FileWriter(file);
                out.write("테스트 파일");
                out.close();
            }
        }
    }
}
