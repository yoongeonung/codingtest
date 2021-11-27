package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10950 {
    /**
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder strb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String[] strs = br.readLine().split(" ");
            strb.append(Integer.parseInt(strs[0]) + Integer.parseInt(strs[1])+"\n");
        }
        System.out.println(strb);
    }
}
