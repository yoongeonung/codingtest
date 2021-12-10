package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2439 {
    /*
    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder strb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            strb.append(copyString(" ", count - i)).append(copyString("*", i)).append("\n");
        }
        System.out.println(strb);

    }

    /*
    짜증나게 자바스크립트나 파이썬은 String에 곱하기 연산자 쓰면 팝콘튀기듯이 문자열이 나오는데 자바는 그게 안되서...아우
    메서드를 하나 만들어준다
     */
    public static String copyString(String str, int num) {
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            strb.append(str);
        }
        return String.valueOf(strb);
    }
}
