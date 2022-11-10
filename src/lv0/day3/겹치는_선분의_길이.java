package lv0.day3;

import java.util.HashMap;
import java.util.Map;

public class 겹치는_선분의_길이 {
    /*
    * 빨간색, 초록색, 파란색 선분이 x축 위에 있습니다.
    * 세 선분의 x좌표 시작과 끝이 [[start, end], [start, end], [start, end]] 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때,
    * 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
        lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
        스크린샷 2022-08-08 오후 5.08.46.png
    * */
    public int solution(int[][] lines) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int[] line : lines) {
            int min = Math.min(line[0], line[1]);
            int max = Math.max(line[0], line[1]);
            for (int i = min + 1; i < max + 1; i++) {
                String str = (i - 1) + "/" + i;
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        for (Integer value : map.values()) {
            if (value > 1) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        겹치는_선분의_길이 겹치는_선분의_길이 = new 겹치는_선분의_길이();
        int solution = 겹치는_선분의_길이.solution(new int[][]{{0, 1}, {2, 5}, {3, 9}});
        System.out.println("solution = " + solution);
    }
}
