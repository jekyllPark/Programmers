package lv1.day1.day2;

import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {

    /**
     *함수 solution은 정수 n을 매개변수로 입력받습니다.
     * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     * */
    static class Solution {
        public long solution(long n) {
            long answer = 0;
            char[] chars = String.valueOf(n).toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < chars.length; i++) {
                sb.append(chars[i] - 48);
            }
            return Long.parseLong(sb.reverse().toString());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(118372);
    }
}
