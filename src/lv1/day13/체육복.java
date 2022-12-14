package lv1.day13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class 체육복 {
    /*
     * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다.
     * 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
     * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
     * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
     * 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
     * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost,
     * 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
     * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
     * 제한사항
     * 전체 학생의 수는 2명 이상 30명 이하입니다.
     * 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     * 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
     * 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
     * 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며,
     * 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
     * */
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Boolean> lostMap = new HashMap<>();
        Map<Integer, Boolean> reserveMap = new HashMap<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        Arrays.stream(lost).forEach(v -> lostMap.put(v, false));
        Arrays.stream(reserve).forEach(v -> reserveMap.put(v, true));
        for (int i = 0; i < reserveMap.size(); i++) {
            for (int j = 0; j < lostMap.size(); j++) {
                if (reserve[i] == lost[j]) {
                    lostMap.put(lost[j], true);
                    reserveMap.put(reserve[i], false);
                }
            }
        }
        for (int i = 0; i < reserveMap.size(); i++) {
            for (int j = 0; j < lostMap.size(); j++) {
                if ((reserve[i] + 1) == lost[j] || (reserve[i] - 1) == lost[j]) {
                    if (reserveMap.get(reserve[i]).equals(true) && lostMap.get(lost[j]).equals(false)) {
                        lostMap.put(lost[j], true);
                        reserveMap.put(reserve[i], false);
                    }
                }
            }
        }
        System.out.println("lostMap = " + lostMap);
        System.out.println("reserveMap = " + reserveMap);
        int answer = n - lostMap.entrySet().stream().filter(v -> v.getValue().equals(false)).collect(Collectors.toList()).size();
        return answer;
    }

    public static void main(String[] args) {
        체육복 체육복 = new 체육복();
        int solution = 체육복.solution(8, new int[]{5,6,7}, new int[]{4,5});
        System.out.println("solution = " + solution);
    }

}
