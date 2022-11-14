package lv1.day9;

import java.math.BigInteger;

public class 숫자_문자열과_영단어 {
    /*
    * 네오와 프로도가 숫자놀이를 하고 있습니다.
    * 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
    * 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
    * 1478 → "one4seveneight"
    * 234567 → "23four5six7"
    * 10203 → "1zerotwozero3"
    * 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나,
    * 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
    * s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
    * 참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
    * */
    public int solution(String s) {
        return Integer.parseInt(
                s.replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
                        .replaceAll("zero", "0")
        );
    }

    public static void main(String[] args) {
        숫자_문자열과_영단어 숫자_문자열과_영단어 = new 숫자_문자열과_영단어();
        int one4seveneight = 숫자_문자열과_영단어.solution("500000000000000000000000000");
        System.out.println("one4seveneight = " + one4seveneight);
    }
}
