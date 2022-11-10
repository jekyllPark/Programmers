package lv0.day5;

import java.util.Arrays;

public class 직사각형_넓이_구하기 {
    /*
     * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
     * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
     * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
     * */
    public int solution(int[][] dots) {
        System.out.println("dots.length = " + dots.length);
        int[] xDots = new int[dots.length];
        int[] yDots = new int[dots.length];

        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[0].length; j++) {
                xDots[i] = dots[i][0];
                yDots[i] = dots[i][1];
            }
        }

        System.out.println("Arrays.toString(xDots) = " + Arrays.toString(xDots));
        System.out.println("Arrays.toString(yDots) = " + Arrays.toString(yDots));

        Arrays.sort(xDots);
        Arrays.sort(yDots);

        System.out.println("Arrays.toString(xDots) = " + Arrays.toString(xDots));
        System.out.println("Arrays.toString(yDots) = " + Arrays.toString(yDots));

        int xMax = xDots[xDots.length - 1] - xDots[0];
        System.out.println("x의 제일 큰 값 : " + xDots[xDots.length - 1] + " x의 제일 작은 값 : " + xDots[0]);
        int yMax = yDots[yDots.length - 1] - yDots[0];
        System.out.println("y의 제일 큰 값 : " + yDots[yDots.length - 1] + " y의 제일 작은 값 : " + yDots[0]);

        return xMax * yMax;
    }

    public static void main(String[] args) {
        직사각형_넓이_구하기 직사각형_넓이_구하기 = new 직사각형_넓이_구하기();
//        int solution = 직사각형_넓이_구하기.solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}});
        int solution = 직사각형_넓이_구하기.solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}});
        System.out.println("solution = " + solution);
    }
}
