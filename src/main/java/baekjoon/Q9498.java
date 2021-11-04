package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 시험 점수를 입력받아 90 ~ 100점은 A,
 * 80 ~ 89점은 B,
 * 70 ~ 79점은 C,
 * 60 ~ 69점은 D,
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
public class Q9498 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // version1 : 84ms
//        try {
//            int num = Integer.parseInt(br.readLine());
//            if (num > 89 && num < 101) {
//                System.out.println("A");
//            } else if (num > 79 && num < 90) {
//                System.out.println("B");
//            } else if (num > 69 && num < 80) {
//                System.out.println("C");
//            } else if (num > 59 && num < 70) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // version 2 : 76ms
        try {
            int num = Integer.parseInt(br.readLine());
            if (num > 100 || num < 60) {
                System.out.println("F");
            } else if (num > 89) {
                System.out.println("A");
            } else if (num > 79) {
                System.out.println("B");
            } else if (num > 69) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
