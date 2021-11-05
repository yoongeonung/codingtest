package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // version 1 : 76ms
//        try {
//            int x = Integer.parseInt(br.readLine());
//            int y = Integer.parseInt(br.readLine());
//            if (x < 0 && y < 0) {
//                System.out.println(3);
//            } else if (x > 0 && y > 0) {
//                System.out.println(1);
//            } else if (x > 0 && y < 0) {
//                System.out.println(4);
//            } else {
//                System.out.println(2);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // version 2 : 76ms
        try {
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());
            if (x > 0) {
                if (y > 0) {
                    System.out.println(1);
                } else {
                    System.out.println(4);
                }
            } else {
                if (y > 0) {
                    System.out.println(2);
                } else {
                    System.out.println(3);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
