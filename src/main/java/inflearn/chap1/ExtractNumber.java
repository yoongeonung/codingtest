package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractNumber {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    solutionOne(s);
    solutionTwo(s);

  }

  private static void solutionTwo(String s) {
    int answer = 0;
    for (char c : s.toCharArray()) {
      if (c >= 48 && c <= 57) {
        answer = answer * 10 + (c - 48);
      }
    }
    System.out.println(answer);
  }

  private static void solutionOne(String s) {
    String replacedString = s.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
    System.out.println(Integer.parseInt(replacedString));
  }

}
