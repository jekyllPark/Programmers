package lv0.day1;

public class 다음에_올_숫자 {
    /*
     * 등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
     * 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
     * */
    public int solution(int[] common) {
        boolean 공차 = common[2] - common[1] == common[1] - common[0];
        return 공차 ? common[common.length - 1] + common[1] - common[0] : common[common.length - 1] * (common[1] / common[0]);
    }

    public static void main(String[] args) {
        다음에_올_숫자 다음에_올_숫자 = new 다음에_올_숫자();
        int solution = 다음에_올_숫자.solution(new int[]{1, 2, 3, 4});
        System.out.println("solution = " + solution);
        int solution2 = 다음에_올_숫자.solution(new int[]{2, 4, 8});
        System.out.println("solution = " + solution2);
        int solution3 = 다음에_올_숫자.solution(new int[]{-2, -4, -8});
        System.out.println("solution = " + solution3);
        int solution4 = 다음에_올_숫자.solution(new int[]{-1, -2, -3});
        System.out.println("solution = " + solution4);
    }
}
