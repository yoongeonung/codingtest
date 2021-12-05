package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11021 {
    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            strb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(stk.nextToken()) + Integer.parseInt(stk.nextToken())).append("\n");
        }
        System.out.println(strb);
    }
}
