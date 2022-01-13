package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1330 {
    public static void main(String[] args) throws IOException {
        // 비교
        compare();
    }

    private static void compare() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        // 일반적인 if문: 76ms
        if (a > b) {
            System.out.println(">");
        } else if (b > a) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
        // 삼항연산자:  84ms 코드의 길이는 짧아지나 속도는 느려지고 가독성도 좋아진다고 보기 어려움.
        // System.out.println(a > b ? ">" : a < b ? "<" : "==");
    }
}
