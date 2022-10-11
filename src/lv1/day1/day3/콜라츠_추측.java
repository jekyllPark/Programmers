package lv1.day1.day3;

public class 콜라츠_추측 {
    /**
     * 1937년 Collatz란 사람에 의해 제기된 이 추측은,
     * 주어진 수가 1이 될 때까지 다음 작업을 반복하면,
     * 모든 수를 1로 만들 수 있다는 추측입니다.
     * 작업은 다음과 같습니다.
     * 예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다.
     * 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요.
     * 단, 주어진 수가 1인 경우에는 0을,
     * 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
     */

    static class Solution {
        public int solution(long num) {
            int cnt = 0;
            while (num != 1) {
                if (num % 2 == 0) { 
                     num /= 2;
                } else if (num % 2 != 0) {
                    num = 3 * num + 1;
                }
                cnt++;
                if(cnt == 500) {
                    cnt = -1;
                    break;
                }
            }
            return cnt;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(6);
        System.out.println("solution1 = " + solution1);
    }
}
