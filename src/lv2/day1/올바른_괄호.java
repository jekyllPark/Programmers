package lv2.day1;

public class 올바른_괄호 {
    /*
    * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다.
    * 예를 들어 "()()" 또는 "(())()" 는 올바른 괄호입니다.
    * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
    * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때,
    * 문자열 s가 올바른 괄호이면 true를 return 하고,
    * 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
    * */
    static boolean solution(String s) {
        int cnt = 0;
        for (char c : s.toCharArray()) {
            cnt += c == '(' ? 1 : -1;
            if(cnt < 0) return false;
        }
        return cnt == 0;
    }
    /*
    * 효율성 탈락 코드
    * */
//    if(s.charAt(0) == ')') return false;
//    while (s.contains("()")) {
//        if(!s.contains("()")) break;
//        s = s.replaceAll("\\(\\)", "");
//    }
//    if (s.length() > 0 ) return false;
//    return true;

    public static void main(String[] args) {
        System.out.println(solution(")()("));
    }
}
