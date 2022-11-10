package lv0.day7;

public class 짝수의_합 {
    /*
     * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
     * */
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        짝수의_합 짝수의_합 = new 짝수의_합();
        int solution = 짝수의_합.solution(10);
        System.out.println("solution = " + solution);
    }
}
