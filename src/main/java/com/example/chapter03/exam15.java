package com.example.chapter03;

public class exam15 {
    public static void main(String[]args){
        String str = """
                아름다운 이땅에 금수강산에
                단군 할아버지가 "터" 잡으시고
                '홍익인간' 뜻으로 나라 세우니
                대대손손 훌륭한 인물도 많아.
                """;
        System.out.println(str);

        String human = """
                이름 : 권민서
                나이 : 29
                직업 : 프로그래머
                """;
        System.out.println(human);

        String human1 = """
                이름 : 권민서    \s
                나이 : 29       \s
                직업 : 프로그래머 \s
                """;
        System.out.println(human1);
    }
}
