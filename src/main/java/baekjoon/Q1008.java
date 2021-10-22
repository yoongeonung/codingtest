package baekjoon;

import java.util.Scanner;

public class Q1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        Double a = Double.valueOf(strings[0]);
        Double b = Double.valueOf(strings[1]);
        System.out.println( a / b);
    }
}
