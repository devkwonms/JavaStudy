package com.example.chapter15;

class Network {
    void connect() {
        System.out.println("연결되었습니다.");
    }

    void disconnect() {
        System.out.println("연결이 끊어졌습니다.");
    }
}

public class exam4 {
    public static void main(String[] args) {

        communication();
    }

    static void communication() {
        Network net = new Network();
        net.connect();
        net.disconnect();
    }
}
