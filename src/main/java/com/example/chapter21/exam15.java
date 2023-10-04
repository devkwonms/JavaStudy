package com.example.chapter21;

import java.io.*;

class Bitmap implements Serializable {
    byte[] raster;

    public Bitmap(int width) {
        raster = new byte[width];
        int i;
        for (i = 0; i < 100; i++) raster[i] = 1;
        for (i = 100; i < width / 2; i++) raster[i] = 8;
        for (i = width / 2; i < width; i++) raster[i] = 7;
    }
}

public class exam15 {
    public static void main(String[] args) throws Exception {
        Bitmap girl = new Bitmap(32000);

        // 파일로 출력
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl.bitmap"));
        out.writeObject(girl);
        out.close();

        // 파일로부터 입력
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl.bitmap"));
        Bitmap girl2 = (Bitmap) in.readObject();
        in.close();
    }
}
