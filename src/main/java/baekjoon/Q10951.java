package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10951 {
    /*
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    입력이 몇회인지 알 수 없다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder strb = new StringBuilder();
        String str = "";
        while ((str = br.readLine()) != null) {
            /*
            입력숫자가 0이상 10이하일때 유용 Integer.parseInt(st.nextToke())보다 조금 빠르다.
            str.charAt()-48 ASCII코드로 48은 '0' 49는 '1'
            입력이 1, 2일때
            char -> int 형변환
            49-48 = 1, 50-48 = 2
            result = 3

            하지만 결국에 이녀석도 null이외에 ""공북 문자열이 들어올경우 예외(StringIndexOutOfBoundsException)가 터진다.
             */
            int result = (str.charAt(0)-48) + (str.charAt(2)-48);
            strb.append(result).append("\n");
        }
        System.out.print(strb);
    }
}
