package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseSpecialChar {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = stringToCharArray(reader);
    int leftSide = 0;
    int rightSide = chars.length - 1;
    while (leftSide < rightSide) {
      if (isSpecialChar(chars[leftSide])) {
        leftSide++;
      } else if (isSpecialChar(chars[rightSide])) {
        rightSide--;
      } else {
        reverseChar(chars, leftSide, rightSide);
        leftSide++;
        rightSide--;
      }
    }
    System.out.println(String.valueOf(chars));
  }

  private static char[] stringToCharArray(BufferedReader reader) throws IOException {
    return reader.readLine().toCharArray();
  }

  private static void reverseChar(char[] chars, int leftSide, int rightSide) {
    char tmp = chars[leftSide];
    chars[leftSide] = chars[rightSide];
    chars[rightSide] = tmp;
  }

  private static boolean isSpecialChar(char chars) {
    return !Character.isAlphabetic(chars);
  }

}
