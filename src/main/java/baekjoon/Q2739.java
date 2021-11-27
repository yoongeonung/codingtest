package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2739 {
    /**
     * 구구단
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer num = Integer.valueOf(br.readLine());
            multiplication(num);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void multiplication(Integer num) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }

}
