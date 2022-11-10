package lv0.day7;

import java.util.Arrays;

public class 배열_두배_만들기 {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(v -> v * 2).toArray();
    }

    public static void main(String[] args) {
        배열_두배_만들기 배열_두배_만들기 = new 배열_두배_만들기();
        int[] solution = 배열_두배_만들기.solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(solution));
    }
}
