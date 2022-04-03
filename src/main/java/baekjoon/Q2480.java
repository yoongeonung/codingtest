package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int firstSpotOnADice = tokenizer.nextToken().charAt(0) - '0';
        int secondSpotOnADice = tokenizer.nextToken().charAt(0) - '0';
        int thirdSpotOnADice = tokenizer.nextToken().charAt(0) - '0';

        // X->Y, Y->Z, X->Z
        if (firstSpotOnADice == secondSpotOnADice && secondSpotOnADice == thirdSpotOnADice) {
            System.out.println(10000 + (firstSpotOnADice * 1000));
        } else if (firstSpotOnADice == secondSpotOnADice) {
            System.out.println(1000 + (firstSpotOnADice * 100));
        } else if (firstSpotOnADice == thirdSpotOnADice) {
            System.out.println(1000 + (firstSpotOnADice * 100));
        } else if (secondSpotOnADice == thirdSpotOnADice) {
            System.out.println(1000 + (secondSpotOnADice * 100));
        } else {
            int[] dices = new int[]{firstSpotOnADice, secondSpotOnADice, thirdSpotOnADice};
//            Arrays.sort(dices);
//            System.out.println(dices[2] * 100);
            int max = dices[0];
            for (int i = 1; i < dices.length; i++) {
                if (max < dices[i]) {
                    max = dices[i];
                }
            }
            System.out.println(max * 100);
        }
    }
}
