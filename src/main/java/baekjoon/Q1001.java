package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1001 {
    public static void main(String[] args) {
        // 뺄셈
        minus();
    }

    private static void minus() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] strings = br.readLine().split(" ");
            Integer a = Integer.valueOf(strings[0]);
            Integer b = Integer.valueOf(strings[1]);
            System.out.println(a - b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
