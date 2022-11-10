package lv0.day2;

import java.util.ArrayList;
import java.util.Collections;

public class 가까운_수 {
    /*
     * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
     * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int[] array, int n) {
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(n);
        for (int a : array) {
            temp.add(a);
        }
        Collections.sort(temp);
        temp.forEach(System.out::println);

        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i) == n) {
                if (i > 0) {
                    if(i == temp.size() - 1) {
                        answer = temp.get(i - 1);
                    } else {
                        answer = temp.get(i - 1) > temp.get(i + 1) ? temp.get(i + 1) : temp.get(i - 1);
                    }
                } else {
                    answer = temp.get(i + 1);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가까운_수 가까운_수 = new 가까운_수();
        int solution = 가까운_수.solution(new int[]{10, 11, 12}, 13);
        System.out.println("solution = " + solution);
    }
}
