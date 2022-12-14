package lv2.day1;

import java.util.Arrays;

public class 카펫 {
    /*
     * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
     * carpet.png
     * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만,
     * 전체 카펫의 크기는 기억하지 못했습니다.
     * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
     * 제한사항
     * 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
     * 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
     * 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
     * */
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int allGridCnt = brown + yellow;

        for (int i = 3; i < allGridCnt; i++) {
            int j = allGridCnt / i;
            System.out.println("j = " + j);
            System.out.println("i = " + i);
            if (allGridCnt % i == 0 && j >= 3) {
                int 가로 = Math.max(i, j);
                System.out.println("가로 = " + 가로);
                int 세로 = Math.min(i, j);
                System.out.println("세로 = " + 세로);
                int center = (가로 - 2) * (세로 - 2);
                System.out.println("center = " + center);
                if(center == yellow) {
                    answer[0] = 가로;
                    answer[1] = 세로;
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24, 24)));
    }
}
