package lv0.day7;

import java.util.Arrays;

public class 머쓱이보다_키_큰_사람 {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(v-> height < v).count();
    }

    public static void main(String[] args) {
        머쓱이보다_키_큰_사람 머쓱이보다_키_큰_사람 = new 머쓱이보다_키_큰_사람();
        int solution = 머쓱이보다_키_큰_사람.solution(new int[]{149, 180, 192, 170}, 167);
        System.out.println("solution = " + solution);
    }
}
