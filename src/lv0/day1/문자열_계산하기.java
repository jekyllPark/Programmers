package lv0.day1;

import java.util.ArrayList;

public class 문자열_계산하기 {
    /*
    my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
    * */
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split(" ");
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            System.out.println("s = " + split[i]);
            if (split[i].equals("-")) {
                temp.add(Integer.parseInt(split[i+1]) * -1);
            } else if (split[i].equals("+")) {
                temp.add(Integer.parseInt(split[i+1]) * 1);
            } else {
                if (i == 0) {
                    temp.add(Integer.parseInt(split[i]));
                }
            }
        }

        temp.forEach(System.out::println);

        for(int i = 0; i < temp.size(); i++) {
            System.out.println("temp.get(i) = " + temp.get(i));
            answer += temp.get(i);
            System.out.println("answer = " + answer);
        }

        return answer;
//        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        문자열_계산하기 문자열_계산하기 = new 문자열_계산하기();
        int solution = 문자열_계산하기.solution("3 - 4 + 5");
        System.out.println("solution = " + solution);
    }
}
