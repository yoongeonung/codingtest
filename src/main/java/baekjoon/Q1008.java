package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1008 {
    public static void main(String[] args) {
        // 나눗셈
        divide();
    }

    private static void divide() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] strings = br.readLine().split(" ");
            Double a = Double.valueOf(strings[0]);
            Double b = Double.valueOf(strings[1]);
            System.out.println( a / b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
