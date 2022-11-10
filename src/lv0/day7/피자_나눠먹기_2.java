package lv0.day7;

public class 피자_나눠먹기_2 {
    /*
     * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
     * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
     * n명이 주문한 피자를 남기지 않고
     * 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     * */
    public int solution(int n) {
        int pizza = 6;
        while (pizza % n != 0) {
            pizza += 6;
        }
        return pizza / 6;
    }

    public static void main(String[] args) {
        피자_나눠먹기_2 피자_나눠먹기_2 = new 피자_나눠먹기_2();
        int solution = 피자_나눠먹기_2.solution(4);
        System.out.println("solution = " + solution);
    }
}
