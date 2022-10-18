package lv1.day2;

public class 자연수_뒤집어_배열로_만들기 {

    /**
     * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
     */

    static class Solution {
        public int[] solution(long n) {

            long num = n;
            int cnt = 0;

            while (num != 0) {
                num /= 10;
                cnt++;
            }
            int[] answer = new int[cnt];

            num = n;
            for(int i = 0; num != 0; i++) {
                answer[i] = (int)(num%10);
                num /= 10;
            }

            return answer;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            int[] solution1 = solution.solution(12345);
            for (int s : solution1) {
                System.out.println("s = " + s);
            }
        }
    }
}
