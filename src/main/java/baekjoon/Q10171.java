package baekjoon;

public class Q10171 {
    public static void main(String[] args) {
        // 첫번째 풀이 : textbox사용 이쪽이 빠르고, 용량이 적음
        String str =
                """
                        \\    /\\
                         )  ( ')
                        (  /  )
                         \\(__)|""";
        System.out.println(str);

        // 두번째 풀이 : println 연타보다는 빠르고 용량이 적음
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\    /\\\n");
        stringBuilder.append(" )  ( ')\n");
        stringBuilder.append("(  /  )\n");
        stringBuilder.append(" \\(__)|");
        System.out.println(stringBuilder);

    }
}
