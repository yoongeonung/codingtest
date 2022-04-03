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
        int[] dices = new int[3];
        for (int i = 0; i < dices.length; i++) {
            dices[i] = getSpotOnADice(tokenizer);
        }
        int firstSpotOnADice = dices[0];
        int secondSpotOnADice = dices[1];
        int thirdSpotOnADice = dices[2];

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
            Arrays.sort(dices);
            System.out.println(dices[2] * 100);
        }
    }

    private static int getSpotOnADice(StringTokenizer tokenizer) {
        return tokenizer.nextToken().charAt(0) - '0';
    }
}
