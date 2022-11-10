package lv0.day7;

public class 점의_위치_구하기 {
    /*
    * 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
    * x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
    x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
    x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
    x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
    x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다. 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.
    * */
    public int solution(int[] dot) {
        int answer = 0;
        boolean isXPositive;
        boolean isYPositive;

        if (dot[0] >= 0) isXPositive = true;
        else isXPositive = false;

        if (dot[1] >= 0) isYPositive = true;
        else isYPositive = false;

        if (isXPositive && isYPositive) {
            answer = 1;
        } else if (!isXPositive && isYPositive) {
            answer = 2;
        } else if (!isXPositive) {
            answer = 3;
        } else if (isXPositive){
            answer = 4;
        }

        return answer;
    }

    public static void main(String[] args) {
        점의_위치_구하기 점의_위치_구하기 = new 점의_위치_구하기();
        int solution = 점의_위치_구하기.solution(new int[]{-500, 500});
        System.out.println("solution = " + solution);
    }
}
