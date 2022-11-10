package lv0.day7;

import java.math.BigInteger;

public class 구슬을_나누는_경우의_수 {
    /*
     * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
     * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
     * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
     * */
    public BigInteger solution(int balls, int share) {
        BigInteger answer = factorial(balls).divide(factorial(balls - share).multiply(factorial(share)));
        return answer;
    }

    public BigInteger factorial(int n) {
        return n <= 1 ? BigInteger.ONE : factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

    public static void main(String[] args) {
        구슬을_나누는_경우의_수 구슬을_나누는_경우의_수 = new 구슬을_나누는_경우의_수();
        BigInteger solution = 구슬을_나누는_경우의_수.solution(30, 30);
        System.out.println("solution = " + solution);
    }
}
