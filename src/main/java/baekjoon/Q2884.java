package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int hour = Integer.parseInt(strings[0]);
        int min = Integer.parseInt(strings[1]);
        // version 1 : 밀리초를 쓰면 안되는 문제인듯 통과안됨.

        // version 2 : 76ms
        // 지정된 시간 45분전에 타이머설정
        setTimer(hour, min);

    }

    private static void setTimer(int hour, int min) {
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
    }
}
