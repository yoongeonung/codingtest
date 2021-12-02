package baekjoon;

import java.io.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        // 백준 네트워크속도에 따라 차이가 남.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder strb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        for (int i = count; i > 0; i--) {
            strb.append(i).append("\n");
        }
        br.close();
        bw.write(strb.toString());
        bw.flush();
    }
}
