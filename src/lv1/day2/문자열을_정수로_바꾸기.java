package lv1.day2;

public class 문자열을_정수로_바꾸기 {
    /**
     * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
     * */
    static class Solution {
        public int solution(String s) {
            int answer = Integer.parseInt(s);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution("-1234");
        System.out.println("solution1 = " + solution1);
    }
}
