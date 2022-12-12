package lv1.day11;

public class 소수_만들기 {
    /*
     * 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
     * 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
     * nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때
     * 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    if (isPrime(temp)) {
                        answer++;
                    }
                }
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
        소수_만들기 소수_만들기 = new 소수_만들기();
        int solution = 소수_만들기.solution(new int[]{1, 2, 7, 6, 4});
        System.out.println("solution = " + solution);
    }
}
