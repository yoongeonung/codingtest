package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10430 {
    public static void main(String[] args) throws IOException {
        // Scanner는 성능이 느리다.
        // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        print(a, b, c);
    }

    private static void print(int a, int b, int c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((a + b) % c).append("\n");
        stringBuilder.append(((a % c) + (b % c)) % c).append("\n");
        ;
        stringBuilder.append((a * b) % c).append("\n");
        ;
        stringBuilder.append(((a % c) * (b % c)) % c);
        System.out.println(stringBuilder);
    }
}
