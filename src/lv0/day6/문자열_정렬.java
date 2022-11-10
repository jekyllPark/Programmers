package lv0.day6;

import java.util.Arrays;

public class 문자열_정렬 {
    /*
     * 문자열 my_string이 매개변수로 주어질 때,
     * my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
     * */
    public int[] solution(String my_string) {
        int[] ints = my_string.chars().mapToObj(s -> (char) s).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).toArray();
        Arrays.sort(ints);
        return ints;
    }

    public static void main(String[] args) {
        문자열_정렬 문자열_정렬 = new 문자열_정렬();
        int[] hi12392s = 문자열_정렬.solution("hi12392");
        System.out.println(Arrays.toString(hi12392s));
    }
}
