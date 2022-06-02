package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateChar {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str = reader.readLine();

    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
      if (str.indexOf(str.charAt(i)) == i) {
        answer += str.charAt(i);
      }
    }
    System.out.println(answer);

  }

}
