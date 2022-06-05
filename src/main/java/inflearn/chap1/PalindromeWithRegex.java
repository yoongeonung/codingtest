package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeWithRegex {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String replacedString = str.toUpperCase().replaceAll("[^A-Z]", "");
    StringBuilder sb = new StringBuilder(replacedString);
    if (!replacedString.equals(sb.reverse().toString())) {
      System.out.println("NO");
      return;
    }
    System.out.println("YES");
  }

}
