package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q18108 {

    private static final int YEAR_GAP_WITH_AD = 543;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int buddhistEra = Integer.parseInt(bufferedReader.readLine());
        getAnnoDominiYear(buddhistEra);
    }

    private static void getAnnoDominiYear(int buddhistEra) {
        System.out.println(buddhistEra - YEAR_GAP_WITH_AD);
    }
}
