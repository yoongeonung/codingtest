package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class FindChar {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    char ch = Character.toLowerCase(br.readLine().charAt(0));
    System.out.println(solution(str, ch));
  }

  public static int solution(String str, char ch) {
    int count = 0;
    String lowerCase = str.toLowerCase(Locale.ROOT);
    for (int i = 0; i < lowerCase.length(); i++) {
      if (lowerCase.charAt(i) == ch) {
        count++;
      }
    }
    System.out.println(count);
    return count;
  }
}
