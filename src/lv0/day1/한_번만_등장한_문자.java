package lv0.day1;

import java.util.Arrays;
import java.util.HashMap;

public class 한_번만_등장한_문자 {
    /*
     * 문자열 s가 매개변수로 주어집니다.
     * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
     * */
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(String.valueOf(chars[i])) == null) {
                map.put(String.valueOf(chars[i]), 1);
            } else {
                map.put(String.valueOf(chars[i]), Integer.parseInt(String.valueOf(map.get(String.valueOf(chars[i]))))+1);
            }
        }

        StringBuilder sb = new StringBuilder();
        Object[] objects = map.entrySet().stream().filter(v -> v.getValue() == 1).map(v-> v.getKey()).toArray();
        Arrays.sort(objects);
        for(Object o : objects) {
            sb.append(o);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        한_번만_등장한_문자 한_번만_등장한_문자 = new 한_번만_등장한_문자();
        String hello = 한_번만_등장한_문자.solution("hello");
        System.out.println("hello = " + hello);
    }
}
