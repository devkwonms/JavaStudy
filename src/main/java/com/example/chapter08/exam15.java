package com.example.chapter08;

public class exam15 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3, 4));
        System.out.println(getSum(8, 9, 6, 2, 9));

        // 배열 자체를 형식인수에 넘겨줘도 정상동작
        int[] ar = {1, 2};
        System.out.println(getSum(ar));

        // 임시 배열은 형식 인수에 잠시 대입되어 사용되고 메서드가 리턴하면 회수
        System.out.println(getSum(new int[]{1,2}));

        System.out.println(getSum1(new int[]{1, 2, 3}));

//        // 형식 인수가 배열 타입이면 진짜 배열만 전달할 수 있음,(요소 나열 불가)
//        System.out.println(getSum1(1,2,3));
    }

    static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    // 형식인수자체를 배열로 선언해도 getSum과 동일하게 동작한다.(가변인수를 받는 부분에서)
    static int getSum1(int[]a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
