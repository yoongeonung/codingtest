package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    solutionOne(br);
  }

  private static void solutionOne(BufferedReader br) throws IOException {
    int totalCount = Integer.parseInt(br.readLine());
    String[] strs = new String[totalCount];
    for (int i = 0; i < totalCount; i++) {
      String str = br.readLine();
      strs[i] = new StringBuilder(str).reverse().toString();
    }
    for (String str : strs) {
      System.out.println(str);
    }
  }

}
