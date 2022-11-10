package lv0.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열_뒤집기 {
    /*
     * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
     * */
    public int[] solution(int[] num_list) {
        List<Integer> collect = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(collect);
        int[] ints = collect.stream().mapToInt(v -> v).toArray();
        return ints;
    }

    public static void main(String[] args) {
        배열_뒤집기 배열_뒤집기 = new 배열_뒤집기();
        int[] solution = 배열_뒤집기.solution(new int[]{1, 0, 1, 1, 1, 3, 5});
        System.out.println(Arrays.toString(solution));
    }
}
