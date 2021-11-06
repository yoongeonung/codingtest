package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        // 80ms
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String fLine = br.readLine();
//        String sLine = br.readLine();
//        int tLine = Integer.parseInt(fLine) * Integer.parseInt(sLine.split("")[2]);
//        int fourthLine = Integer.parseInt(fLine) * Integer.parseInt(sLine.split("")[1]);
//        int fifthLine = Integer.parseInt(fLine) * Integer.parseInt(sLine.split("")[0]);
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(tLine).append("\n");
//        stringBuilder.append(fourthLine).append("\n");
//        stringBuilder.append(fifthLine).append("\n");
//        stringBuilder.append(tLine + (fourthLine * 10) + (fifthLine * 100));
//        System.out.println(stringBuilder);


        // 4ms 빠른 버전 (76ms)
        // 세자릿수 곱셈
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fLine = br.readLine();
        String sLine = br.readLine();
        multiply(fLine, sLine);
    }

    private static void multiply(String fLine, String sLine) {
        int tLine = Integer.parseInt(fLine) * Integer.parseInt(sLine.split("")[2]);
        int fourthLine = Integer.parseInt(fLine) * Integer.parseInt(sLine.split("")[1]);
        int fifthLine = Integer.parseInt(fLine) * Integer.parseInt(sLine.split("")[0]);
        String stringBuilder = tLine + "\n" +
                fourthLine + "\n" +
                fifthLine + "\n" +
                (tLine + (fourthLine * 10) + (fifthLine * 100));
        System.out.println(stringBuilder);
    }
}
