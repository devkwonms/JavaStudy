package com.example.chapter20;

import java.awt.*;

public class exam5 {
    public static void main(String[] args) {
        PrintThread1 worker1 = new PrintThread1('X');
        worker1.start();
        PrintThread1 worker2 = new PrintThread1('.');
        worker2.start();
        BeepThread beep = new BeepThread(5, 1000);
        beep.start();

        for (int num = 0; num < 30; num++) {
            System.out.print("O");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}

class PrintThread1 extends Thread {
    char ch;

    PrintThread1(char ch) {
        super();
        this.ch = ch;
    }

    public void run() {
        for (int num = 0; num < 30; num++) {
            System.out.print(ch);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}

class BeepThread extends Thread {
    int count;
    int gap;
    Toolkit tool = Toolkit.getDefaultToolkit();

    BeepThread(int count, int gap) {
        this.count = count;
        this.gap = gap;
    }

    public void run() {
        for (int num = 0; num < 30; num++) {
            tool.beep();
            try {
                Thread.sleep(gap);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}