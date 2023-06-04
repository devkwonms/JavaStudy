package com.example.chapter04;

public class exam2 {
    public static void main(String[]args){
        int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("너 몇살이니?"));

        if(age >= 19){
            System.out.println("성인입니다!");
        }else if(age < 19){
            System.out.println("미성년자입니다!");
        }
    }
}
