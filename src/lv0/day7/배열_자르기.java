package lv0.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열_자르기 {
    /*
     * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
     * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
     * */
    public int[] solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            temp.add(numbers[i]);
        }
        return temp.stream().mapToInt(v->v).toArray();
//        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    public static void main(String[] args) {
        배열_자르기 배열_자르기 = new 배열_자르기();
        int[] solution = 배열_자르기.solution(new int[]{1, 2, 3, 4, 5}, 1, 3);
        System.out.println(Arrays.toString(solution));
    }
}
