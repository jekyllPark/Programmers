package lv2.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 최댓값과_최솟값 {
    /*
     * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
     * str에 나타나는 숫자 중 최소값과 최대값을 찾아
     * 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
     * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
     * */
    public static String solution(String s) {
        String[] s1 = s.split(" ");
        List<Integer> collect = Arrays.stream(s1).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
        Collections.sort(collect);
        String answer = collect.get(0) + " " + collect.get(collect.size() - 1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("-1 -1"));
    }
}
