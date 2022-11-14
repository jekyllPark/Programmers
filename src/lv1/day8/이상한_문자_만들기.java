package lv1.day8;

import java.util.Arrays;

public class 이상한_문자_만들기 {
    /*
     * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
     * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
     * 각 단어의 짝수번째 알파벳은 대문자로,
     * 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
     * , solution을 완성하세요.
     * */
    public String solution(String s) {
        String[] split = s.split("");
        int cnt = 1;

        for (int i = 0; i < split.length; i++) {
            if (cnt % 2 == 0) {
                split[i] = split[i].toLowerCase();
            } else {
                split[i] = split[i].toUpperCase();
            }
            if (split[i].equals(" ")) {
                cnt = 0;
            }
            cnt++;
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(split).forEach(v -> sb.append(v));
        return sb.toString();
    }

    public static void main(String[] args) {
        이상한_문자_만들기 이상한_문자_만들기 = new 이상한_문자_만들기();
        String try_hello_world = 이상한_문자_만들기.solution("try hello world");
        System.out.println("try_hello_world = " + try_hello_world);
    }
}
