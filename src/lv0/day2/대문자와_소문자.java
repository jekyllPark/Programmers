package lv0.day2;

public class 대문자와_소문자 {
    /*
    * 문자열 my_string이 매개변수로 주어질 때,
    * 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
    * */
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        System.out.println("(int) 'z' = " + (int) 'z');
        for(char c : my_string.toCharArray()) {
            if((int) c >= 65 && (int) c < 97) {
                sb.append(String.valueOf(c).toLowerCase());
            } else {
                sb.append(String.valueOf(c).toUpperCase());
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        대문자와_소문자 대문자와_소문자 = new 대문자와_소문자();
        String hELLO = 대문자와_소문자.solution("abCdEfghIJ");
        System.out.println("hELLO = " + hELLO);
    }
}
