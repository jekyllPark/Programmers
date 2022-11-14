package lv1.day8;

public class _3진법_뒤집기 {
    /*
     * 자연수 n이 매개변수로 주어집니다.
     * n을 3진법 상에서 앞뒤로 뒤집은 후,
     * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int n) {
        String temp = "";
        while (n != 0) {
            temp += (n % 3);
            n /= 3;
        }
        return Integer.parseInt(temp, 3);
    }

    public static void main(String[] args) {
        _3진법_뒤집기 진법_뒤집기 = new _3진법_뒤집기();
        int solution = 진법_뒤집기.solution(45);
        System.out.println("solution = " + solution);
    }
}
