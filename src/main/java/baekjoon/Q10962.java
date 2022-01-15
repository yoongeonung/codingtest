package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10962 {
    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        boolean flag = true;
        while (flag) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstValue = Integer.parseInt(st.nextToken());
            int secondValue = Integer.parseInt(st.nextToken());
            int result = firstValue + secondValue;
            if (result != 0) {
                strb.append(result).append("\n");
            }else {
                flag = false;
            }
        }
        System.out.println(strb);
    }
}
