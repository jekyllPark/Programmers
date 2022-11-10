package lv0.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 등수_매기기 {
    /*
     * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
     * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때,
     * 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * */
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> avgs = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            int avg = (score[i][0] + score[i][1]);
            avgs.add(avg);
        }
        Object clone = avgs.clone();
        Collections.sort((List<Integer>) clone);

        for(int i = 0; i < ((List<?>) clone).size(); i++) {
            int idx = score.length + 1;
            for(int j = 0; j < ((List) clone).size(); j++) {
                idx--;
                if(avgs.get(i).equals(((List<?>) clone).get(j))) {
                    answer[i] = idx;
                }
            }
        }

        System.out.println("avgs = " + avgs);

        return answer;
    }

    public static void main(String[] args) {
        등수_매기기 등수_매기기 = new 등수_매기기();
//        int[] solution = 등수_매기기.solution(new int[][]{{80, 70}, {70, 80}, {40, 70}, {50, 80}, {90, 100}, {100, 90}, {100, 100}, {0, 0}});
        int[] solution = 등수_매기기.solution(new int[][]{{1, 2}, {1, 1}, {1, 1}});
        for(int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
