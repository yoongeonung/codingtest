package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8393 {
    /**
     * 1~n sum
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int total = 0;
        for (int i = 1; i < count + 1; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
