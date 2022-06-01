package inflearn.chap1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReverseString {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    solutionOne(br);
    solutionTwo(br);


  }

  private static void solutionTwo(BufferedReader br) throws IOException {
    List<String> reversedString = new ArrayList<>();
    int cnt = Integer.parseInt(br.readLine());
    String[] strings = new String[cnt];
    for (int i = 0; i < cnt; i++) {
      strings[i] = br.readLine();
    }
    for (String string : strings) {
      char[] chars = string.toCharArray();
      int lt = 0;
      int rt = chars.length - 1;
      while (lt < rt) {
        char tmp = chars[lt];
        chars[lt] = chars[rt];
        chars[rt] = tmp;
        lt++;
        rt--;
      }
      reversedString.add(String.valueOf(chars));
    }
    for (String s : reversedString) {
      System.out.println(s);
    }
  }

  private static void solutionOne(BufferedReader br) throws IOException {
    int totalCount = Integer.parseInt(br.readLine());
    String[] strs = new String[totalCount];
    for (int i = 0; i < totalCount; i++) {
      String str = br.readLine();
      strs[i] = new StringBuilder(str).reverse().toString();
    }
    for (String str : strs) {
      System.out.println(str);
    }
  }

}
