package lv1.day9;

import java.time.LocalDate;

public class _2016년 {
    /*
     * 2016년 1월 1일은 금요일입니다.
     * 2016년 a월 b일은 무슨 요일일까요?
     * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요.
     * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
     * 입니다.
     * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
     * */
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        return date.getDayOfWeek().toString().substring(0, 3);
    }

    public static void main(String[] args) {
        _2016년 년 = new _2016년();
        String solution = 년.solution(5, 24);
        System.out.println("solution = " + solution);
    }
}
