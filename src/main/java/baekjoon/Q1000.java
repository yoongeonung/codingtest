package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1000 {
    public static void main(String[] args) {
//        System.out.println("정수 a와 b를 입력해주세요. "); // 쓸때없는 프린트하면 백준에서는 틀렸다고 함.
        // 덧셈
        add();
    }

    private static void add() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] list = br.readLine().split(" ");
            int a = Integer.parseInt(list[0]);
            int b = Integer.parseInt(list[1]);
            System.out.println(a + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
