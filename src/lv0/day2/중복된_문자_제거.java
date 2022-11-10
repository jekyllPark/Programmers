package lv0.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class 중복된_문자_제거 {
    /*
    문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
    * */
    public String solution(String my_string) {
        ArrayList<String> temp = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            temp.add(String.valueOf(chars[i]));
            if (map.get(String.valueOf(chars[i])) == null) {
                map.put(String.valueOf(chars[i]), 1);
            } else {
                map.put(String.valueOf(chars[i]), Integer.parseInt(String.valueOf(map.get(String.valueOf(chars[i])))) + 1);
            }
        }
        Collections.reverse(temp);
        map.entrySet().stream().forEach(System.out::println);
        StringBuilder sb = new StringBuilder();
        map.entrySet().stream().forEach(v -> {
            for (Iterator<String> iterator = temp.iterator(); iterator.hasNext(); ) {
                String val = iterator.next();
                if (v.getKey().equals(val) && v.getValue() > 1) {
                    map.put(v.getKey(), v.getValue()-1);
                    iterator.remove();
                }
            }
        });
        Collections.reverse(temp);
        temp.forEach(v -> sb.append(v));
        return sb.toString();

//        return my_string.chars()
//                .mapToObj(Character::toString)
//                .distinct()
//                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        중복된_문자_제거 중복된_문자_제거 = new 중복된_문자_제거();
        String people = 중복된_문자_제거.solution("We are the world");
        System.out.println("people = " + people);
    }
}
