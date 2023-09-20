package com.example.chapter20;

public class exam9 {
    public static void main(String[] args) {
        Memory mem = new Memory(16);
        DownLoad down = new DownLoad(mem);
        Play play = new Play(mem);

        down.start();
        play.start();
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
}

class DownLoad extends Thread {
    Memory mem;

    DownLoad(Memory amem) {
        mem = amem;
    }

    public void run() {
        for (int off = 0; off < mem.size; off += 2) {
            for (int chunk = 0; chunk < 2; chunk++) {
                mem.buffer[off + chunk] = off + chunk;
                mem.progress = off + chunk + 1;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    ;
                }
            }
        }
    }
}

class Play extends Thread {
    Memory mem;

    Play(Memory amem) {
        mem = amem;
    }

    public void run() {
        for (; ; ) {
            for (int off = 0; off < mem.progress; off++) {
                System.out.print(mem.buffer[off] + " ");
            }
            System.out.println();
            if (mem.progress == mem.size) break;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}