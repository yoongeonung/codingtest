package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    String upperedString = s.toUpperCase();
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
      if (upperedString.charAt(left) != upperedString.charAt(right)) {
        System.out.println("NO");
        return;
      }
      left++;
      right--;
    }
    System.out.println("YES");
  }

}
