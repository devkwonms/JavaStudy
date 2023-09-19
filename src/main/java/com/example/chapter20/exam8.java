package com.example.chapter20;

public class exam8 {
    public static void main(String[] args) {
        PrintThread5 worker = new PrintThread5();
        worker.setDaemon(true);
        worker.start();

        for (int i = 0; i < 20; i++) {
            System.out.print(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}

class PrintThread5 extends Thread {
    public void run() {
        while (true) {
            System.out.print("save");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}
