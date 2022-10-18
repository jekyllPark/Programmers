package lv1.day4;

import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    /**
     * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
     * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
     */
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[j++] = arr[i];
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    public int[] advancedSolution(int[] arr, int divisor) {
        return Arrays.stream(arr).filter(f -> f % divisor == 0).toArray();
    }

    public static void main(String[] args) {
        나누어_떨어지는_숫자_배열 나누어_떨어지는_숫자_배열 = new 나누어_떨어지는_숫자_배열();
        int[] test = {5, 9, 7, 10};
        int[] solution = 나누어_떨어지는_숫자_배열.solution(test, 5);
        for (int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
