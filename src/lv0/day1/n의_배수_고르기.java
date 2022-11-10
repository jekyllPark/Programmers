package lv0.day1;

import java.util.ArrayList;

public class n의_배수_고르기 {
    /*
    정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.
    * */
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                temp.add(num);
            }
        }

        answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }

        return answer;
        /*
        * return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
        * */
    }

    public static void main(String[] args) {
        n의_배수_고르기 n의_배수_고르기 = new n의_배수_고르기();
        int[] solution = n의_배수_고르기.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        for (int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
