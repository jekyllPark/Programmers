package lv0.day7;

public class 문자열_뒤집기 {
    /*
    * 문자열 my_string이 매개변수로 주어집니다.
    * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
    * */
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] split = my_string.split("");
        for (int i = my_string.length() - 1; i >= 0; i--) {
            sb.append(split[i]);
        }
        return sb.toString();
//        StringBuilder sb = new StringBuilder();
//        sb.append(my_string);
//        sb.reverse();
//
//        return sb.toString();
    }

    public static void main(String[] args) {
        문자열_뒤집기 문자열_뒤집기 = new 문자열_뒤집기();
        String jaron = 문자열_뒤집기.solution("jaron");
        System.out.println("jaron = " + jaron);
    }
}
