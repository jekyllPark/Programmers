package lv0.day5;

import java.util.Arrays;

public class 배열_원소의_길이 {
    /*
    * 문자열 배열 strlist가 매개변수로 주어집니다.
    * strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
    * */
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(v -> v.length()).toArray();
    }

    public static void main(String[] args) {
        배열_원소의_길이 배열_원소의_길이 = new 배열_원소의_길이();
        int[] solution = 배열_원소의_길이.solution(new String[]{"We", "are", "the", "world!"});
        System.out.println(Arrays.toString(solution));
    }
}
