package com.example.mission;

public class problem1 {
    public static void main(String[] args) {
//        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
//        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
//
//        thread2.run();
//        // 쓰레드 수행
//        thread1.start();
//        thread2.start();
//
//        // 기타 작업을 수행할 수 있습니다.
//
//        try {
//        // 다른 스레드의 실행이 끝날 때까지 현재 스레드를 일시 정지
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("모든 스레드가 종료되었습니다.");

        final int THREAD_COUNT = 100000;

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable("Thread" + i));
            thread.start();
        }
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "이(가) 실행 중입니다.");

        try {
            // 일시 정지 상태로 스레드를 유지합니다.
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + "이(가) 실행을 종료합니다.");
    }
}
