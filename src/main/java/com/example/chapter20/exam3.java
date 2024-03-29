package com.example.chapter20;

public class exam3 {
    public static void main(String[] args) {
        Thread worker = new Thread(mRunnable);
        worker.start();

        for (int num = 0; num < 30; num++) {
            System.out.print("O");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                ;
            }
        }
    }

    static Runnable mRunnable = new Runnable() {
        @Override
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
    };
}
