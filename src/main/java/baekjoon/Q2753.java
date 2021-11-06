package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {
    public static void main(String[] args) throws IOException {
        // version 1 : 80ms
//        try {
//            int num = Integer.parseInt(br.readLine());
//            System.out.println(num % 4 == 0 && num % 100 != 0 || num % 4 == 0 && num % 400 == 0 ? 1 : 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // version 2 : 76ms
        // 윤달구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        intercalation(num);
    }

    private static void intercalation(int num) {
        System.out.println(num % 4 == 0 && num % 100 != 0 || num % 400 == 0 ? 1 : 0);
    }
}