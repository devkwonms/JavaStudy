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

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(raster.length);
        int num = 1;
        byte value = raster[0];
        for (int i = 1; i < raster.length; i++) {
            if (value == raster[i]) {
                num++;
            } else {
                out.writeByte(value);
                out.writeInt(num);
                num = 1;
                value = raster[i];
            }
        }
        // 데이터의 끝을 나타내는 마커 추가
        out.writeByte((byte)-1); // 마커로 -1을 사용
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        int length = in.readInt();
        raster = new byte[length];
        int offset = 0;
        while (offset < length) {
            byte value = in.readByte();
            if (value == -1) { // 마커를 만나면 종료
                break;
            }
            int num = in.readInt();
            for (int i = 0; i < num; i++) {
                if (offset >= length) {
                    throw new IOException("Data corruption: Expected length does not match actual length.");
                }
                raster[offset] = value;
                offset++;
            }
        }
    }
}

public class exam15 {
    public static void main(String[] args) throws Exception {
        Bitmap girl = new Bitmap(32000);

        // 파일로 출력
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("girl2.bitmap"));
        out.writeObject(girl);
        out.close();

        // 파일로부터 입력
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("girl2.bitmap"));
        Bitmap girl2 = (Bitmap) in.readObject();
        in.close();
    }
}
