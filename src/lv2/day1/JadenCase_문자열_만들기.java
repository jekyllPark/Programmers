package lv2.day1;

import java.util.Locale;
import java.util.StringTokenizer;

public class JadenCase_문자열_만들기 {
    /*
     * JadenCase란 모든 단어의 첫 문자가 대문자이고,
     * 그 외의 알파벳은 소문자인 문자열입니다.
     * 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
     * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
     * */
    public static String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            System.out.println("str = " + str);
            if(str.startsWith(" ")) {
                sb.append(str);
                continue;
            }
            if(Character.isDigit(str.charAt(0))) {
                sb.append(str.charAt(0));
            } else if (Character.isLowerCase(str.charAt(0))) {
                sb.append(String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT));
            } else {
                sb.append(str.charAt(0));
            }
            sb.append(str.substring(1).toLowerCase(Locale.ROOT));
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(solution("for the last week"));
    }
}
