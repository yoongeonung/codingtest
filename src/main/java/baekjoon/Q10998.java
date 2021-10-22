package baekjoon;

import java.util.Scanner;

public class Q10998 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(strings[0]) * Integer.parseInt(strings[1]));
    }
}
