package lv0.day7;

public class 문자_반복_출력하기 {
    /*
    * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
    * */
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(String s : my_string.split("")) {
            for (int i = 0; i < n; i++) {
                sb.append(s);
            }
        }
        return sb.toString();
    }
}
