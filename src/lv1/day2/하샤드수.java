package lv1.day2;

public class 하샤드수 {

    /**
     * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
     * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
     * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
     * */
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;

            char[] chars = String.valueOf(x).toCharArray();
            int temp = 0;
            for(int i = 0; i < chars.length; i++){
                temp += Character.getNumericValue(chars[i]);
            }

            answer = x % temp == 0;

            return answer;
        }
    }
}
