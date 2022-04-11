package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        // 3, 29, 38, 12, 57, 74, 40, 85, 61
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;
        for(int i = 0 ; i < 9 ; i++) {

            int val = Integer.parseInt(br.readLine());

            if(val > max) {
                max = val;
                index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
