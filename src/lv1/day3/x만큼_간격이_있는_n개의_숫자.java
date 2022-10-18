package lv1.day3;

public class x만큼_간격이_있는_n개의_숫자 {
    /**
    * 함수 solution은 정수 x와 자연수 n을 입력 받아,
    * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
    * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
    * */
    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            long temp = x;
            for (int i = 0; i < n; i++) {
                answer[i] = temp;
                temp += x;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        long[] solution = s.solution(2, 5);
        for(long i : solution) {
            System.out.println("i = " + i);
        }
    }
}
