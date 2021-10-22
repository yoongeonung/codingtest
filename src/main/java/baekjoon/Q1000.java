package baekjoon;

import java.util.Scanner;

public class Q1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input a, b
//        System.out.println("정수 a와 b를 입력해주세요. "); // 쓸때없는 프린트하면 백준에서는 틀렸다고 함.
        String[] list = scanner.nextLine().split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);
        System.out.println(a + b);
    }
}
