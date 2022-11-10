package lv0.day4;

import java.util.LinkedList;
import java.util.Queue;

public class 숨어있는_숫자의_덧셈2 {
    /*
     * 문자열 my_string이 매개변수로 주어집니다.
     * my_string은 소문자, 대문자, 자연수로만 구성되어있습니다.
     * my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     * */
    public int solution(String my_string) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();
        char[] chars = my_string.toCharArray();
        for (char c : chars) {
            q.add(c);
        }
        while (!q.isEmpty()) {
            char a = q.poll();
            System.out.println("a = " + a);
            if (isNumeric(a)) {
                if(q.peek() != null) {
                    char b = q.poll();
                    System.out.println("b = " + b);
                    if (isNumeric(b)) {
                        if (q.peek() != null) {
                            char c = q.poll();
                            System.out.println("c = " + c);
                            if (isNumeric(c)) {
                                answer += Integer.parseInt(String.valueOf(a)) * 100 + Integer.parseInt(String.valueOf(b)) * 10 + Integer.parseInt(String.valueOf(c));
                            } else {
                                answer += Integer.parseInt(String.valueOf(a)) * 10 + Integer.parseInt(String.valueOf(b));
                            }
                        } else {
                            answer += Integer.parseInt(String.valueOf(a)) * 10 + Integer.parseInt(String.valueOf(b));
                        }
                    } else {
                        answer += Integer.parseInt(String.valueOf(a));
                    }
                } else {
                    answer += Integer.parseInt(String.valueOf(a));
                }
            } else {
                continue;
            }
            System.out.println("answer : " + answer);
        }
        return answer;
    }

    public boolean isNumeric(char c) {
        if ((c - 0) >= 65 && (c - 0) <= 122) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        숨어있는_숫자의_덧셈2 숨어있는_숫자의_덧셈2 = new 숨어있는_숫자의_덧셈2();
        System.out.println("('z'-'0') = " + ('z' - 0));
        System.out.println("('Z'-'0') = " + ('Z' - 0));
        int aAb1B2cC34oOp = 숨어있는_숫자의_덧셈2.solution("aAb1B2cC34oOp");
        System.out.println("aAb1B2cC34oOp = " + aAb1B2cC34oOp);
    }
}
