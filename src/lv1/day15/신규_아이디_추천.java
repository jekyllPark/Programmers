package lv1.day15;

import java.util.*;
import java.util.regex.Matcher;

public class 신규_아이디_추천 {
    /*
     * 카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어,
     * 카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다.
     * "네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때,
     * 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
     * 다음은 카카오 아이디의 규칙입니다.
     * 아이디의 길이는 3자 이상 15자 이하여야 합니다.
     * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
     * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
     * "네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가
     * 카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.
     * */
    public String solution(String new_id) {
        String answer = "";
        System.out.println(new_id);
        String toLowerCase = new_id.toLowerCase(Locale.ROOT);
        System.out.println("phase1 = " + toLowerCase); /** ...!@bat#*..y.abcdefghijklm */
        answer = toLowerCase;

        String regex = toLowerCase.replaceAll("[^0-9a-z-_.]", ""); /** ...bat..y.abcdefghijklm */
        System.out.println("phase2 = " + regex);
        answer = regex;

        StringBuilder phase3 = new StringBuilder();
        char[] chars = regex.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                if (i < chars.length - 1) {
                    if (chars[i + 1] == '.') {
                        continue;
                    } else {
                        phase3.append(chars[i]);
                    }
                }
            } else {
                phase3.append(chars[i]);
            }
        }

        System.out.println("phase3 = " + phase3); /** .bat.y.abcdefghijklm */

        answer = phase3.toString();

        char[] phase4 = String.valueOf(phase3).toCharArray();
        List<Character> temp = new ArrayList<>();
        for (int i = 0; i < phase4.length; i++) {
            temp.add(phase4[i]);
        }

        d(temp);

        StringBuilder phase4Sb = new StringBuilder();
        temp.forEach(v -> phase4Sb.append(v));
        answer = phase4Sb.toString();
        System.out.println("phase4 = " + phase4Sb);



        while (true) {
            if (temp.size() > 15) {
                temp.remove(temp.size() - 1);
                d(temp);
            }
            if (temp.size() <= 15) {
                StringBuilder phase6Sb = new StringBuilder();
                temp.forEach(v -> phase6Sb.append(v));
                answer = phase6Sb.toString();
                System.out.println("phase6 = " + phase6Sb);
                break;
            }
        }

        while (true) {
            if (temp.size() < 3) {
                temp.add(temp.get(temp.size() - 1));
            } else {
                StringBuilder phase7Sb = new StringBuilder();
                temp.forEach(v -> phase7Sb.append(v));
                answer = phase7Sb.toString();
                System.out.println("phase7 = " + phase7Sb);
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        temp.forEach(v -> result.append(v));
        return answer;
    }

    private void d(List<Character> temp) {
        String answer;
        while (true) {
            if (temp.size() == 0) {
                temp.add('a');
                StringBuilder phase5Sb = new StringBuilder();
                temp.forEach(v -> phase5Sb.append(v));
                answer = phase5Sb.toString();
                System.out.println("phase5 = " + phase5Sb);
            }
            if (temp.get(0) == '.') {
                temp.remove(0);
            }
            if (temp.get(temp.size() - 1) == '.') {
                temp.remove(temp.size() - 1);
            }
            if (temp.get(0) != '.' && temp.get(temp.size() - 1) != '.') {
                break;
            }
        }
    }

    public static void main(String[] args) {
        신규_아이디_추천 신규_아이디_추천 = new 신규_아이디_추천();
        String solution = 신규_아이디_추천.solution("123_.def");
        System.out.println("solution = " + solution);
    }
}


/*
*
*
* regex로만 처리한 답안 있길래 카피함..
class Solution {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
}
*
*
* */