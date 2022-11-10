package lv0.day3;

import java.util.Arrays;

public class 삼각형의_완성조건_2 {
    /*
    * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
    가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
    * */
    public int solution(int[] sides) {
        int aSum = 0; //가장 긴 변이 sides 안에 있을 때
        int bSum = 0; //가장 긴 변이 그 외의 숫자일 때

        Arrays.sort(sides);

        System.out.println(Arrays.toString(sides));

        // # A case
        for (int i = 1; i <= sides[1]; i++) {
            if (sides[0] + i > sides[1]) {
                System.out.println("i = " + i);
                aSum++;
            }
        }

        System.out.println(" ======================================== ");

        // # B case
        for (int i = sides[1]; i < (sides[0] + sides[1]); i++) {
            if (i > sides[1]) {
                System.out.println("i = " + i);
                bSum++;
            }
        }


        int total = aSum + bSum;
        return total;
    }

    public static void main(String[] args) {
        삼각형의_완성조건_2 삼각형의_완성조건_2 = new 삼각형의_완성조건_2();
        int solution = 삼각형의_완성조건_2.solution(new int[]{11, 7});
        System.out.println("solution = " + solution);
    }
}
