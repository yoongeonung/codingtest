package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        /*
         * Integer.parseInt(), Integer.valueOf() 둘간의 의미있는 속도 차이는 없음.
         * 자바에서는 Integer와 Integer.valueOf() 사용을 권장하지만
         * 왠지 IDE는 parseInt와 int를 권장, 연산하기 쉽기때문인가?
         */
        int count = Integer.parseInt(br.readLine());
        for (int i = 1; i <= count ; i++) {
            // + 연산이 발생해서인가 append()를 사용하는것보다 느림
            // strb.append(i + "\n");
            strb.append(i).append("\n");
        }
        br.close();
        System.out.println(strb);
    }
}
