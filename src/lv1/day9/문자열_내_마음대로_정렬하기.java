package lv1.day9;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    /*
     * 문자열로 구성된 리스트 strings와,
     * 정수 n이 주어졌을 때,
     * 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
     * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
     * */
    public String[] solution(String[] strings, int n) {
        String[] answer = Arrays.copyOf(Arrays.stream(strings).sorted((o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            }
            return o1.charAt(n) - o2.charAt(n);
        }).toArray(), strings.length, String[].class);
        return answer;
    }

    public static void main(String[] args) {
        문자열_내_마음대로_정렬하기 문자열_내_마음대로_정렬하기 = new 문자열_내_마음대로_정렬하기();
        String[] solution = 문자열_내_마음대로_정렬하기.solution(new String[]{"cdx", "abce", "abcd"}, 2);
//        String[] solution = 문자열_내_마음대로_정렬하기.solution(new String[]{"cdx", "abce", "abcd"}, 1);
        System.out.println(Arrays.toString(solution));
    }
}
