package com.example.chapter20;

public class exam10 {
    public static void main(String[] args) {
        CalcThread worker = new CalcThread();
        worker.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            ;
        }
        worker.interrupt();
    }
}

class CalcThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("\n계산 취소");
            return;
        }
        System.out.println("\n계산 완료");
    }
}
