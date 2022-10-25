package lv1.day5;

public class 문자열_다루기_기본 {
    /**
     * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
     * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다
     */

    static class Solution {
        public boolean solution(String s) {
            boolean answer = true;

            if (s.length() != 4 && s.length() != 6) {
                return false;
            } else {
                char[] chars = s.toCharArray();
                for (char c : chars) {
                    if ((int) c - 48 < 10) {
                        answer = true;
                    } else {
                        answer = false;
                        break;
                    }
                }
            }
            return answer;
        }

        public boolean solution2(String s) {
            if (s.length() == 4 || s.length() == 6) {
                try {
                    int x = Integer.parseInt(s);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            } else return false;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean solution1 = solution.solution("1234");
        System.out.println("solution1 = " + solution1);
    }
}
