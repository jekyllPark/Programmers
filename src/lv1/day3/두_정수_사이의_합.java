package lv1.day3;

public class 두_정수_사이의_합 {

    /**
     * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
     * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
     */

    static class Solution {
        public long solution(int a, int b) {
            long answer = a+b;
            if (a < b) {
                for (int i = a; i < b; i++) {
                    answer += i;
                }
                answer -= a;
            } else {
                for(int i = b; i < a; i++) {
                    answer += i;
                }
                answer -= b;
            }
            return answer;
        }

        public long solution2(int a, int b) {
            long answer = 0;
            long max = Math.max(a, b);
            long min = Math.min(a, b);
            for(long i = min; i <= max; i++) {
                answer += i;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long solution1 = solution.solution(3, 5);
        System.out.println("solution1 = " + solution1);
    }
}
