package com.example.chapter21;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class exam9 {
    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("test.dat"));
        out.writeInt(1234);
        out.writeDouble(3.14159265);
        out.writeUTF("String 문자열");
        out.close();
        System.out.println("Write success");

        DataInputStream in = new DataInputStream(new FileInputStream("test.dat"));
        int i = in.readInt();
        double d = in.readDouble();
        String str = in.readUTF();
        System.out.printf("i = %d, d = %f, str = %s", i, d, str);
    }
}
