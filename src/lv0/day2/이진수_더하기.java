package lv0.day2;

public class 이진수_더하기 {
    /*
    * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    * 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
    * */
    public String solution(String bin1, String bin2) {
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);
        String s = Integer.toBinaryString(a + b);
        return s;
    }

    public static void main(String[] args) {
        이진수_더하기 이진수_더하기 = new 이진수_더하기();
        이진수_더하기.solution("10", "11");
    }
}
