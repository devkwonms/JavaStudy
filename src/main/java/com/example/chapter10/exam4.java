package com.example.chapter10;

class Bus {
    static Station[] arInfo;

    static {
        arInfo = new Station[7];
        arInfo[0] = new Station("경희대학교", 0, 0);
        arInfo[1] = new Station("청량리", 4, 200);
        arInfo[2] = new Station("제기동", 7, 100);
        arInfo[3] = new Station("답십리", 12, 200);
        arInfo[4] = new Station("금호동", 16, 200);
        arInfo[5] = new Station("옥수", 18, 150);
        arInfo[6] = new Station("압구정", 23, 300);
    }

    void printFare(int from, int to) {
        int fare = 500;
        for (int i = from; i <= to; i++) {
            fare += arInfo[i].fare;
        }
        System.out.println(arInfo[from].name + " ~ " +
                arInfo[to].name + "까지의 요금은 " + fare + "원입니다.");
    }
}

class Station {
    String name;        // 정거장 이름
    int distance;       // 누적 거리
    int fare;           // 구간 요금

    Station(String name, int distance, int fare) {
        this.name = name;
        this.distance = distance;
        this.fare = fare;
    }
}

public class exam4 {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        bus1.printFare(1, 5);

        Bus bus2 = new Bus();
        bus2.printFare(2, 4);

    }
}
