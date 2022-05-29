package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindWordInString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

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
