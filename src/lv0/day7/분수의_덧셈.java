package lv0.day7;

import java.util.Arrays;

public class 분수의_덧셈 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        int max = Math.max(denum, num);
        int min = Math.min(denum, num);
        while(min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }
        return new int[]{(denum1 * num2 + denum2 * num1) / max, (num1 * num2) / max};
    }

    public static void main(String[] args) {
        분수의_덧셈 분수의_덧셈 = new 분수의_덧셈();
        int[] solution = 분수의_덧셈.solution(9, 2, 1, 3);
        System.out.println(Arrays.toString(solution));
    }
}
