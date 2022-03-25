package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1001 {
    public static void main(String[] args) throws IOException {
        // 뺄셈
        minus();
    }

    private static void minus() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = br.read() - '0'; // '0' -> 47(unicode)
            br.read();
            int b = br.read() - '0';
            System.out.println(a - b);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
