package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // version 1 : 밀리초를 쓰면 안되는 문제인듯 통과안됨.

        // version 2 : 76ms
        try {
            String[] strings = br.readLine().split(" ");
            int hour = Integer.parseInt(strings[0]);
            int min = Integer.parseInt(strings[1]);
            if (min < 45) {
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour--;
                }
                min = (min + 60) - 45;
                System.out.println(hour + " " + min);
            } else {
                System.out.println(hour + " " + (min - 45));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
