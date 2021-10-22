package baekjoon;

import java.util.Scanner;

public class Q1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        Integer a = Integer.valueOf(strings[0]);
        Integer b = Integer.valueOf(strings[1]);
        System.out.println(a - b);
    }
}
