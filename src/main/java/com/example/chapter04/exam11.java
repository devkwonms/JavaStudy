package com.example.chapter04;

public class exam11 {
    public static void main(String[]args){
        String country = "CHINA";

        switch (country.toLowerCase()){
            case "korea":
                System.out.println("Seoul!");
                break;
            case "china":
                System.out.println("BeiJing!");
                break;
            case "japan":
                System.out.println("ToKyo!");
                break;
        }
    }
}
