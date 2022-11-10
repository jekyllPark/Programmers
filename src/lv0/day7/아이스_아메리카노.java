package lv0.day7;

import java.util.Arrays;

public class 아이스_아메리카노 {
    /*
    * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
    * 아이스 아메리카노는 한잔에 5,500원입니다.
    * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    * */
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cost = 5500;
        int cnt = 0;
        int remain = 0;
        while(money >= cost){
            cnt++;
            money -= cost;
            remain = money;
        }
        if(cost > money) {
            remain = money;
        }
        answer[0] = cnt;
        answer[1] = remain;
        return answer;
//        return new int[] { money / 5500, money % 5500 };
    }

    public static void main(String[] args) {
        아이스_아메리카노 아이스_아메리카노 = new 아이스_아메리카노();
        int[] solution = 아이스_아메리카노.solution(1000);
        System.out.println(Arrays.toString(solution));
    }
}
