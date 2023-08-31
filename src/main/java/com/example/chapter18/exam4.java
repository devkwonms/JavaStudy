package com.example.chapter18;

class ObjectBox {
    Object value;

    ObjectBox(Object value) {
        this.value = value;
    }

    Object get() {
        return value;
    }

    void set(Object value) {
        this.value = value;
    }
}

public class exam4 {
    public static void main(String[] args) {
        ObjectBox bi = new ObjectBox(1234);
        int biv = (int) bi.get();
        System.out.println(biv);

        ObjectBox bd = new ObjectBox(56.78);
        double bdv = (double) bd.get();
        System.out.println(bdv);
    }
}
