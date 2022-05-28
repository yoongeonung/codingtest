package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertCharToString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str = br.readLine();
    char[] chars = str.toCharArray();
    for (char ch : chars) {
      if (isUpperCase(ch)) {
        sb.append(toLowerCase(ch));
      } else {
        sb.append(toUpperCase(ch));
      }
    }
    System.out.println(sb);
  }

  private static char toUpperCase(char ch) {
    return (char) (ch - 32);
  }

  private static char toLowerCase(char ch) {
    return (char) (ch + 32);
  }

  private static boolean isUpperCase(char ch) {
    return ch >= 65 && ch <= 90;
  }

}
