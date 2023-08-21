package com.example.chapter16;

public class exam39 {
    public static void main(String[] args) {
        Point pt = new Point(100, 150);
        Point pt2 = GetMidPoint(pt);
        System.out.println(pt2);

        Point pt3 = new Point(-123, 456);
        System.out.println(pt3);
    }

    public static Point GetMidPoint(Point pt) {
        return new Point(pt.x() / 2, pt.y() / 2);
    }
}
