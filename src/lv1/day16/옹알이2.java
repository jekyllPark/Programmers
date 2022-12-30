package lv1.day16;

public class 옹알이2 {
    /*
     * 머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
     * 조카는 아직 "aya", "ye", "woo", "ma"
     * 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고
     * 연속해서 같은 발음을 하는 것을 어려워합니다.
     * 문자열 배열 babbling이 매개변수로 주어질 때,
     * 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
     * */
    public static int solution(String[] babbling) {
        String[] keyword = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String babble : babbling) {
            babble = replaceKeyword(keyword, babble);

            if (babble.matches("^[0-9]*$") && isContinuity(babble)) {
                answer++;
            }
        }

        return answer;
    }

    private static String replaceKeyword(String[] keyword, String babble) {
        for (int i = 0; i < keyword.length; i++) {
            babble = babble.replaceAll(keyword[i], String.valueOf(i));
        }
        return babble;
    }

    private static boolean isContinuity(String babble) {
        for (int i = 0; i < babble.length() - 1; i++) {
            if (babble.charAt(i) == babble.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        옹알이2 옹알이2 = new 옹알이2();
        int solution = 옹알이2.solution(new String[]{"ayayewooma", "uuu", "yeye", "yemawoo", "ayaayaa", "ye", "myea", "mamaye", "maayama"});
        System.out.println("solution = " + solution);
    }
}
