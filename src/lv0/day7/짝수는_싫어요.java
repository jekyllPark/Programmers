package lv0.day7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 짝수는_싫어요 {
    /*
     * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
     * */
    public int[] solution(int n) {
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                temp.add(i);
//            }
//        }
//        Collections.sort(temp);
//        return temp.stream().mapToInt(v->v).toArray();

        return IntStream.rangeClosed(0, n).filter(v -> v % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        짝수는_싫어요 짝수는_싫어요 = new 짝수는_싫어요();
        int[] solution = 짝수는_싫어요.solution(15);
        System.out.println(Arrays.toString(solution));
    }
}
