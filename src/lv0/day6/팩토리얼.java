package lv0.day6;

public class 팩토리얼 {
    /*
     * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
     * 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
     * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= 10 ; i++) {
            if( n >= factorial(i)) {
                answer = i;
                continue;
            } else {
                break;
            }
        }
        return answer;
    }

    public int factorial(int n) {
        if (n <= 1) return n;
        return factorial(n - 1) * n;
    }

    public static void main(String[] args) {
        팩토리얼 팩토리얼 = new 팩토리얼();
//        int factorial = 팩토리얼.factorial(7);
//        System.out.println("factorial = " + factorial);
        int solution = 팩토리얼.solution(5000);
        System.out.println("solution = " + solution);
    }
}
