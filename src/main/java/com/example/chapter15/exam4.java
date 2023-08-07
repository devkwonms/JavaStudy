package com.example.chapter15;

class Network {
    void connect() {
        System.out.println("연결되었습니다.");
    }

    void disconnect() {
        System.out.println("연결이 끊어졌습니다.");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        disconnect();
    }
}

public class exam4 {
    public static void main(String[] args) {

        communication();
        System.gc();    //  쓰레기 수집 강제지시 => 객체 즉시 제거
        System.runFinalization();
    }

    static void communication() {
        Network net = new Network();
        net.connect();

    }
}
