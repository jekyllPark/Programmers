package lv0.day6;

import java.util.*;

public class 소인수_분해 {
    /*
    * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
    * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
    * 따라서 12의 소인수는 2와 3입니다.
    * 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    * */
    public int[] solution(int n) {
        Set<Integer> temp = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                temp.add(i);
                n /= i;
            }
        }
        ArrayList<Integer> integers = new ArrayList<>(temp);
        Collections.sort(integers);
        return integers.stream().mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        소인수_분해 소인수_분해 = new 소인수_분해();
        int[] solution = 소인수_분해.solution(12);
        System.out.println(Arrays.toString(solution));
    }
}
