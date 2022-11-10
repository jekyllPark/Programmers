package lv0.day7;

import java.util.Arrays;

public class 배열의_평균값 {
    /*
     * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
     * */
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).mapToDouble(v -> v).sum() / numbers.length;
//        return Arrays.stream(numbers).average().orElse(0);
    }

    public static void main(String[] args) {
        배열의_평균값 배열의_평균값 = new 배열의_평균값();
        double solution = 배열의_평균값.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("solution = " + solution);
    }
}
