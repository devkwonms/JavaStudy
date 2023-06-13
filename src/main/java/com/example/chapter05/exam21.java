package com.example.chapter05;

public class exam21 {
    public static void main(String[]args){
        int filesize = 720;
        for(int download = 0; download < filesize;){
            download += 120;
            System.out.println(download + "K 다운로드중...");
        }
        System.out.println("다운로드 완료");
    }
}
