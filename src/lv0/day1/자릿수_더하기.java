package lv0.day1;

public class 자릿수_더하기 {
    /*
    정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
    * */
    public int solution(int n) {
        int answer = 0;
        char[] chars = String.valueOf(n).toCharArray();
        for(char c : chars) {
            answer += c - 48;
        }
        return answer;
    }

    public static void main(String[] args) {
        자릿수_더하기 자릿수_더하기 = new 자릿수_더하기();
        int solution = 자릿수_더하기.solution(930211);
        System.out.println("solution = " + solution);
    }
}
