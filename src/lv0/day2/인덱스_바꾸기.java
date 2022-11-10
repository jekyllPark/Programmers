package lv0.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 인덱스_바꾸기 {
    /*
    * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
    * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
    * */
    public String solution(String my_string, int num1, int num2) {
//        char[] chars = my_string.toCharArray();
//        char temp = chars[num1];
//        chars[num1] = chars[num2];
//        chars[num2] = temp;
//
//        StringBuilder sb = new StringBuilder();
//        for(char c : chars) {
//            sb.append(c);
//        }
//
//        return String.valueOf(sb);
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        System.out.println("my_string = " + my_string.split(""));

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }

    public static void main(String[] args) {
        인덱스_바꾸기 인덱스_바꾸기 = new 인덱스_바꾸기();
        String hello = 인덱스_바꾸기.solution("hello", 1, 2);
        System.out.println("hello = " + hello);
    }
}
