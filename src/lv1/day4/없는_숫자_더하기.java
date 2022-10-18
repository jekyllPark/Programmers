package lv1.day4;

import java.util.Arrays;

public class 없는_숫자_더하기 {
    /**
     * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
     * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
     */

    public static int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 6, 7, 8, 0};

        int solution = solution(test);
        System.out.println("solution = " + solution);
    }
}
