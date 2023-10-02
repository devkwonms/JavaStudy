package com.example.chapter21;

import java.io.*;

class Car implements Serializable {
    String name;
    String color;
    boolean gasoline;

    Car(String name, String color, boolean gasoline) {
        this.name = name;
        this.color = color;
        this.gasoline = gasoline;
    }

    void outInfo() {
        System.out.printf("이름 = %s, 색상 = %s, 연료 = %s\n", name, color, gasoline ? "휘발유" : "경유");
    }
}

public class exam14 {
    public static void main(String[] args) throws Exception {
        Car pride = new Car("프라이드", "파랑", true);

        // 파일로 출력
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pride.car"));
        out.writeObject(pride);
        out.close();
        System.out.println("파일로 기록");

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pride.car"));
        Car pride2 = (Car) in.readObject();
        in.close();
        pride2.outInfo();
    }
}
