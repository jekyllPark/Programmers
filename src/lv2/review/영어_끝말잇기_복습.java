package lv2.review;

import java.util.*;

public class 영어_끝말잇기_복습 {
    public static int[] solution(int n, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                String history = words[i - 1];
                String now = words[i];

                if (map.containsKey(now) || history.charAt(history.length() - 1) != now.charAt(0)) {
                    return new int[]{(i % n) + 1, (i / n) + 1};
                }
            }
            map.put(words[i], 1);
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
