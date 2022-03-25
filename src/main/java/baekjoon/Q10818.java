package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        /**
         * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");

        List<Integer> collect = Arrays.stream(strings).map(Integer::parseInt).sorted().collect(Collectors.toList());
        System.out.print(collect.get(0) + " " + collect.get(collect.size() - 1));
    }
}
