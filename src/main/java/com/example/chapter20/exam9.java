package com.example.chapter20;

public class exam9 {
    public static void main(String[] args) {
        Memory mem = new Memory(16);
        DownLoad down = new DownLoad(mem);
        Play play = new Play(mem);

        down.start();
        play.start();

        try {
            down.join();
            play.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("다운로드가 완료되었습니다. 전송을 시작합니다.");
    }
}

class Memory {
    int[] buffer;
    int size;
    int progress;

    Memory(int asize) {
        size = asize;
        buffer = new int[asize];
        progress = 0;
    }

    synchronized void DownChunk(int off) {
        for (int chunk = 0; chunk < 2; chunk++) {
            buffer[off + chunk] = off + chunk;
            progress = off + chunk + 1;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                ;
            }
        }
    }

    synchronized void PlayDowned() {
        for (int off = 0; off < progress; off++) {
            System.out.print(buffer[off] + " ");
        }
        System.out.println();
    }
}

class DownLoad extends Thread {
    Memory mem;

    DownLoad(Memory amem) {
        mem = amem;
    }

    public void run() {
        for (int off = 0; off < mem.size; off++) {
            mem.buffer[off] = off;
            mem.progress = off + 1;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                ;
            }
        }
        synchronized (mem) {
            mem.notify();
        }
    }
}

class Play extends Thread {
    Memory mem;

    Play(Memory amem) {
        mem = amem;
    }

    public void run() {
        synchronized (mem) {
            try {
                mem.wait();     // 완성될 때까지 대기
            } catch (InterruptedException e) {
                ;
            }
        }
        for (int off = 0; off < mem.progress; off++) {
            System.out.print(mem.buffer[off] + " ");
        }
        System.out.println();
    }
}