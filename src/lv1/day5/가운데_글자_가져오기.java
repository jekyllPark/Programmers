package lv1.day5;

public class 가운데_글자_가져오기 {

    /**
     * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
     * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
     */

    static class Solution {
        public String solution(String s) {
            String answer = "";

            int mid = s.length() / 2;

            System.out.println("mid = " + mid);
            char[] chars = s.toCharArray();

            if (s.length() % 2 == 0) {
                answer = String.valueOf(chars[mid - 1]) + String.valueOf(chars[mid]);
            } else {
                answer = String.valueOf(chars[mid]);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String abcde = solution.solution("abcde");
        System.out.println("abcde = " + abcde);
        String qwer = solution.solution("qwer");
        System.out.println("qwer = " + qwer);

    }
}
