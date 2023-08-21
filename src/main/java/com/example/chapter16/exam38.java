package com.example.chapter16;

record Point(int x, int y) {
    Point {
        if(x <0) x = 0;
        if(y <0) y = 0;
    }
}

//class Point {
//    // 좌표를 저장할 변수
//    private final int x;
//    private final int y;
//
//    // 기본 생성자
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    // 변수를 읽어줄 액세서
//    int x() {
//        return x;
//    }
//
//    int y() {
//        return y;
//    }
//
//    // 상등 비교
//    public boolean equals(Object other) {
//        if (other instanceof Point == false) return false;
//        return ((Point) other).x == x && ((Point) other).y == y;
//    }
//
//    // 해시 코드
//    public int hashCode() {
//        return y * 10000 + x;
//    }
//
//    // 문자열화
//    public String toString() {
//        return "Point(" + x + "," + y + ")";
//    }
//}

public class exam38 {
    public static void main(String[] args) {
        // 생성
        Point pt = new Point(123, 456);

        // 문자열화여 출력
        System.out.println(pt);

        // 개별 멤버값 읽기
        int x = pt.x();
        int y = pt.y();
        System.out.println("x = " + x + ",y = " + y);

        // 상등 비교
        Point pt2 = new Point(123, 456);
        System.out.println(pt.equals(pt2));
    }
}
