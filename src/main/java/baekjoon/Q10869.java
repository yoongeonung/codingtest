package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        Integer a = Integer.valueOf(strings[0]);
        Integer b = Integer.valueOf(strings[1]);
        arithmetic(a, b);
    }

    private static void arithmetic(Integer a, Integer b) {
        System.out.printf("%d\n%d\n%d\n%d\n%d", a + b, a - b, a * b, a / b, a % b);
    }
}
