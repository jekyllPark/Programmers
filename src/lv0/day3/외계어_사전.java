package lv0.day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class 외계어_사전 {
    /*
    * PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
    * 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
    * spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
    * 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
    * */
    public int solution(String[] spell, String[] dic) {
        for (int i = 0; i < dic.length; i++) {
            List<String> collect = Arrays.stream(spell).collect(Collectors.toList());
            System.out.println("bf collect = " + collect);
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    map.put(spell[j], map.getOrDefault(spell[j], 0)+1);
                }
            }
            System.out.println("map = " + map);

            map.entrySet().forEach(v->{
                System.out.println("v = " + v);
                collect.remove(v.getKey());
            });
            if(collect.size() == 0) return 1;
            System.out.println("af collect = " + collect);
            System.out.println(" ================================== ");
        }
        return 2;
    }

    public static void main(String[] args) {
        외계어_사전 외계어_사전 = new 외계어_사전();
//        int solution = 외계어_사전.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
        int solution = 외계어_사전.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
        System.out.println("solution = " + solution);
    }
}
