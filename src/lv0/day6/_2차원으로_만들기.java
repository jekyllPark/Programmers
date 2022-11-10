package lv0.day6;

import java.util.Arrays;

public class _2차원으로_만들기 {
    /*
     * 정수 배열 num_list와 정수 n이 매개변수로 주어집니다.
     * num_list를 다음 설명과 같이 2차원 배열로 바꿔 return하도록 solution 함수를 완성해주세요.
     * */
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        for (int i = 0; i < num_list.length / n; i++) {
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = num_list[i * n + j];
            }
            answer[i] = arr;
        }
        return answer;
    }

    public static void main(String[] args) {
        _2차원으로_만들기 차원으로_만들기 = new _2차원으로_만들기();
        int[][] solution = 차원으로_만들기.solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33}, 2);
        String s = Arrays.toString(solution);
        for (int[] iArr : solution) {
            System.out.println(Arrays.toString(iArr));
        }
    }
}
