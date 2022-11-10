package lv0.day6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 배열_회전시키기 {
    /*
     * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
     * 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
     * */
    public int[] solution(int[] numbers, String direction) {
        int[] answer;
        if (direction.equals("right")) {
            Stack<Integer> stack = new Stack<>();
            for (int n : numbers) {
                stack.add(n);
            }
            int temp = stack.pop();
            stack.add(0, temp);
            answer = stack.stream().mapToInt(v -> v).toArray();
        } else {
            Queue<Integer> q = new LinkedList<>();
            for (int n : numbers) {
                q.add(n);
            }
            int temp = q.poll();
            q.add(temp);
            answer = q.stream().mapToInt(v -> v).toArray();
        }
        return answer;
    }

    public static void main(String[] args) {
        배열_회전시키기 배열_회전시키기 = new 배열_회전시키기();
        int[] rights = 배열_회전시키기.solution(new int[]{1, 2, 3}, "right");
        System.out.println(Arrays.toString(rights));
    }
}
