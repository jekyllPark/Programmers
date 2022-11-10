package lv0.day7;

import java.util.Arrays;

public class 중앙값_구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        중앙값_구하기 중앙값_구하기 = new 중앙값_구하기();
        int solution = 중앙값_구하기.solution(new int[]{9,-1,0});
        System.out.println("solution = " + solution);
    }
}
