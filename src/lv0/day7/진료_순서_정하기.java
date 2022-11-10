package lv0.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 진료_순서_정하기 {
    /*
     * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
     * 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
     * */
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        List<Integer> clone = Arrays.stream(emergency.clone()).boxed().collect(Collectors.toList());
        Collections.sort(clone, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 < o2 ? 1 : -1;
            }
        });
        for (int i = 0; i < clone.size(); i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(clone.get(i) == emergency[j]) {
                    answer[j] = i + 1;
                }
            }
        }
        return answer;
//        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }

    public static void main(String[] args) {
        진료_순서_정하기 진료_순서_정하기 = new 진료_순서_정하기();
        int[] solution = 진료_순서_정하기.solution(new int[]{30, 10, 23, 6, 100});
        System.out.println(Arrays.toString(solution));
    }
}
