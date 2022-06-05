package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String upperedString = br.readLine().toUpperCase();
    solution1(upperedString);
    solution2(upperedString);
  }

  private static void solution1(String upperedString) {
    int left = 0;
    int right = upperedString.length() - 1;
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

  private static void solution2(String upperedString) {
    String reversedString = new StringBuilder(upperedString).reverse().toString();
    if (!upperedString.equals(reversedString)) {
      System.out.println("NO");
      return;
    }
    System.out.println("YES");
  }

}
