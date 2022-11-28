package lv1.day10;

import java.lang.reflect.AnnotatedWildcardType;
import java.util.*;

public class 모의고사 {
    /*
     * 수포자는 수학을 포기한 사람의 준말입니다.
     * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
     * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
     * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
     * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
     * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     * */
    public int[] solution(int[] answers) {
        int[] a = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int max = 0;
        Map<String, Integer> cnt = new HashMap<>();
        cnt.put("1", 0);
        cnt.put("2", 0);
        cnt.put("3", 0);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                cnt.put("1", cnt.getOrDefault("1", 0) + 1);
            }
            if (answers[i] == b[i % b.length]) {
                cnt.put("2", cnt.getOrDefault("2", 0) + 1);
            }
            if (answers[i] == c[i % c.length]) {
                cnt.put("3", cnt.getOrDefault("3", 0) + 1);
            }
        }

        for (String key : cnt.keySet()) {
            max = max < cnt.get(key) ? cnt.get(key) : max;
        }
        List<Integer> list = new ArrayList<>();
        int idx = 1;
        for (String key : cnt.keySet()) {
            if (max == cnt.get(key)) {
                list.add(idx);
            } else if (max == 0) {
                list.add(idx);
            }
            idx++;
        }

        if (max == 0) {
            return new int[]{1, 2, 3};
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        모의고사 모의고사 = new 모의고사();
        int[] solution = 모의고사.solution(new int[]{1, 3, 2, 4, 2});
        System.out.println(Arrays.toString(solution));
    }
}
