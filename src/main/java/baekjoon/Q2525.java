package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] splitStrings = reader.readLine().split(" ");

        int currentTime = Integer.parseInt(splitStrings[0]) * 60 + Integer.parseInt(splitStrings[1]);
        int cookingTime = Integer.parseInt(reader.readLine());
        int finishTime = currentTime + cookingTime;

        printHourAndMinutes(finishTime);


    }

    private static void printHourAndMinutes(int finishTime) {
        int hour = finishTime / 60 >= 24 ? finishTime / 60 - 24 : finishTime / 60;
        int minute = finishTime % 60;
        System.out.println(hour + " " + minute);
    }
}
