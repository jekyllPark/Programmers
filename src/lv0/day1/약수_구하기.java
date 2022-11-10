package lv0.day1;

import java.util.ArrayList;

public class 약수_구하기 {
    /*
    * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    * */
    public int[] solution(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                temp.add(i);
            }
        }
        int[] answer = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        약수_구하기 약수_구하기 = new 약수_구하기();
        int[] solution = 약수_구하기.solution(29);
        for (int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
