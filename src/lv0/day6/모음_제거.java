package lv0.day6;

public class 모음_제거 {
    /*
    * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    * */
    public String solution(String my_string) {
        String answer = my_string.replaceAll("a","")
                .replaceAll("e","")
                .replaceAll("i","")
                .replaceAll("o","")
                .replaceAll("u","");
        return answer;
    }

    public static void main(String[] args) {
        모음_제거 모음_제거 = new 모음_제거();
        String bus = 모음_제거.solution("nice to meet you");
        System.out.println("bus = " + bus);
    }
}
