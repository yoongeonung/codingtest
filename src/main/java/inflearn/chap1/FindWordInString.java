package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindWordInString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    solutionOne(str);
    solutionTwo(str);
  }

  private static void solutionTwo(String str) {
    int maxLength = 0, whiteSpace = 0;
    String theWord = "";

    while ( (whiteSpace = str.indexOf(' ')) != -1) {
      String word = str.substring(0, whiteSpace);
      if (word.length() > maxLength) {
        maxLength = word.length();
        theWord = word;
      }
      str = str.substring(whiteSpace + 1);
    }
    if (str.length() > maxLength) {
      theWord = str;
    }
    System.out.println(theWord);
  }

  private static void solutionOne(String str) {
    int maxLength = 0;
    String maxWord = "";
    String[] words = str.split(" ");
    for (String word : words) {
      int wordLength = word.length();
      if (wordLength > maxLength) {
        maxLength = wordLength;
        maxWord = word;
      }
    }
    System.out.println(maxWord);
  }

}
