package com.example.chapter20;

public class exam6 {
    public static void main(String[] args) {
        PrintThread2 worker = new PrintThread2();
        worker.start();

        for (int num = 0; num > 30; num++) {
            System.out.print("O");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                ;
            }
            if (num == 5) worker.suspend();
            if (num == 25) worker.resume();
        }
    }
}

class PrintThread2 extends Thread {
    public void run() {
        for (int num = 0; num < 30; num++) {
            System.out.print("X");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}
