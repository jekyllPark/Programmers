package lv1.day17;

import java.util.*;

public class 신고_결과_받기 {
    /*
     * https://school.programmers.co.kr/learn/courses/30/lessons/92334
     * */
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> idx = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            idx.put(id_list[i], i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            String reporter = str[0];
            String target = str[1];
            map.get(target).add(reporter);
        }

        for (int i = 0; i < id_list.length; i++) {
            Set<String> strings = map.get(id_list[i]);
            if(strings.size() >= k) {
                for (String s : strings) {
                    answer[idx.get(s)]++;
                }
            }
        }

        System.out.println("map = " + map);
        System.out.println("idx = " + idx);

        return answer;
    }

    /*
    *
    * 프로그래머스 정답
    *
    * class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
            HashMap<String, Integer> count = new HashMap<>();
            for (String s : list) {
                String target = s.split(" ")[1];
                count.put(target, count.getOrDefault(target, 0) + 1);
            }

            return Arrays.stream(id_list).map(_user -> {
                final String user = _user;
                List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
                return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
            }).mapToInt(Long::intValue).toArray();
        }
    }
    * */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2)));
    }
}
