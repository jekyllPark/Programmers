package lv0.day3;

import java.util.ArrayList;

public class 평행 {
    /*
    * 점 네 개의 좌표를 담은 이차원 배열  dots가 다음과 같이 매개변수로 주어집니다.
    [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
    주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 return 하도록 solution 함수를 완성해보세요.
    * */
    public int solution(int[][] dots) {
        ArrayList<Double> temp = new ArrayList<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                if((dots[i][1] - dots[j][1]) != 0 && (dots[i][0] - dots[j][0]) != 0){
                    double lean = (double)(dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                    if(temp.contains(lean)) {
                        return 1;
                    }
                    temp.add(lean);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        평행 평행 = new 평행();
//        int solution = 평행.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}});
        int solution = 평행.solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}});
        System.out.println("solution = " + solution);
    }
}
