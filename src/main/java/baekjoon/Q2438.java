package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2438 {
    /**
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder strb = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                strb.append("*");
            }
            strb.append("\n");
        }
        System.out.println(strb);
    }
}
