package lv0.day6;

import java.util.LinkedList;
import java.util.Queue;

public class 숨어있는_숫자의_덧셈 {
    /*
     * 문자열 my_string이 매개변수로 주어집니다.
     * my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     * */
    public int solution(String my_string) {
        int answer = 0;
        Queue<Character> q = new LinkedList<>();
        for (char c : my_string.toCharArray()) {
            q.add(c);
        }
        while (!q.isEmpty()) {
            char val = q.poll();
            if (isNumeric(val)) {
                answer += Integer.parseInt(String.valueOf(val));
            } else {
                continue;
            }
        }
        return answer;
//        return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }

    public boolean isNumeric(char c) {
        if ((c - 0) >= 65 && (c - 0) <= 122) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        숨어있는_숫자의_덧셈 숨어있는_숫자의_덧셈 = new 숨어있는_숫자의_덧셈();
        int aAb1B2cC34oOp = 숨어있는_숫자의_덧셈.solution("aAb1B2cC34oOp");
        System.out.println("aAb1B2cC34oOp = " + aAb1B2cC34oOp);
    }
}
