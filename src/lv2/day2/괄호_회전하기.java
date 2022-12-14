package lv2.day2;

import java.util.EmptyStackException;
import java.util.Stack;

public class 괄호_회전하기 {
    /*
     * 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
     * (), [], {} 는 모두 올바른 괄호 문자열입니다.
     * 만약 A가 올바른 괄호 문자열이라면,
     * (A), [A], {A} 도 올바른 괄호 문자열입니다.
     * 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
     * 만약 A, B가 올바른 괄호 문자열이라면,
     * AB 도 올바른 괄호 문자열입니다.
     * 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
     * 대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
     * 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때
     * s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public static int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++){
            if(isCorrect(s)) answer++;
            s = s.substring(1) + s.charAt(0);
            System.out.println("s = " + s);
        }
        return answer;
    }

    static boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            try {
                char c = s.charAt(i);
                switch (c) {
                    case '[':
                    case '{':
                    case '(':
                        stack.add(c);
                        break;
                    case ']':
                        if(stack.peek() != '[') return false;
                        stack.pop();
                        break;
                    case '}':
                        if(stack.peek() != '{') return false;
                        stack.pop();
                        break;
                    case ')':
                        if(stack.peek() != '(') return false;
                        stack.pop();
                        break;
                }
            } catch (EmptyStackException e) {
                return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
    }
}
