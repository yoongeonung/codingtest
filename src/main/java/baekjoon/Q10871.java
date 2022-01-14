package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/*
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int number = parseInt(firstLine[1]);
        // stream이 확실히 일반 for문 보다 시간이 더 오래걸림.
//        List<Integer> list = Arrays.stream(br.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        for (int s : list) {
//            if (s < number) {
//                System.out.print(s + " ");
//            }
//        }
        String[] secondLine = br.readLine().split(" ");
        for (String s : secondLine) {
            if (Integer.parseInt(s) < number) {
                System.out.print(s + " ");
            }
        }
    }
}
