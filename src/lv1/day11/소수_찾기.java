package lv1.day11;

public class 소수_찾기 {
    /*
     * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
     * 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
     * (1은 소수가 아닙니다.)
     * */
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(isPrime(i)) {
                System.out.println("i = " + i);
                answer++;
            }
        }
        return answer;
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2 ? true : false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        소수_찾기 소수_찾기 = new 소수_찾기();
        int solution = 소수_찾기.solution(10);
        System.out.println("solution = " + solution);
    }
}
