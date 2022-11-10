package lv0.day7;

import java.util.HashMap;

public class 중복된_숫자_개수 {
    public int solution(int[] array, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        return map.get(n);
//        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }

    public static void main(String[] args) {
        중복된_숫자_개수 중복된_숫자_개수 = new 중복된_숫자_개수();
        int solution = 중복된_숫자_개수.solution(new int[]{1, 1, 2, 3, 4, 5}, 1);
        System.out.println("solution = " + solution);
    }
}
