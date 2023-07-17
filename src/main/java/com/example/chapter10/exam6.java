package com.example.chapter10;

class Notebook {
    final String CPU;
    int memory;
    int storage;

    Notebook(String CPU, int memory, int storage) {
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void upgrade(int memory, int storage) {
        this.memory = memory;
        this.storage = storage;
        // this.CPU = "SUPER Strong 16 Core 8.5GHz";
    }

    void printSpec() {
        System.out.print("CPU = " + CPU);
        System.out.print(" ,Memory = " + memory);
        System.out.println(" ,Storage = " + storage);
    }
}

public class exam6 {
    public static void main(String[] args) {
        Notebook Sens = new Notebook("Intel Core i7", 4, 500);
        Notebook XNote = new Notebook("AMD 라이젠", 2, 320);
        Sens.printSpec();
        XNote.printSpec();
        Sens.upgrade(8, 750);
        Sens.printSpec();

    }
}
