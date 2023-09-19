package com.example.chapter20;

public class exam7 {
    public static void main(String[] args) {
        PrintThread3 worker1 = new PrintThread3();
        PrintThread4 worker2 = new PrintThread4();
        worker1.start();
        worker2.setPriority(Thread.MAX_PRIORITY);
        worker2.start();
    }
}

class PrintThread3 extends Thread {
    public void run() {
        double sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += Math.cos(i);
        }
        System.out.println("cos = " + sum);
    }
}

class PrintThread4 extends Thread {
    public void run() {
        double sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += Math.sin(i);
        }
        System.out.println("sin = " + sum);
    }
}

