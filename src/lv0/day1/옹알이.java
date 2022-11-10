package lv0.day1;

public class 옹알이 {
    /**
     * 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
     * 조카는 아직 "aya", "ye", "woo", "ma"
     * 네 가지 발음과 네 가지 발음이 조합된 발음밖에 하지 못합니다.
     * 문자열 배열 babbling이 매개변수로 주어질 때,
     * 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
     */
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        String[] cant = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String b : babbling) {
            String tmp = b;
            for (String ct : cant) {
                tmp = tmp.replace(ct, "X");
            }
            for (String c : can) {
                tmp = tmp.replace(c, "O");
            }
            if(tmp.contains("O")) {
                for(int i = 0; i < tmp.length(); i++) {
                    tmp = tmp.replace("O", "");
                }
                if(tmp.length() == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public int solutionByOther(String[] babbling) {
        int answer = 0;
        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }
            String result = s.replaceAll("aya", "").replaceAll("ye", "").replaceAll("woo", "").replaceAll("ma", "");

            if (result.length() == 0) {
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        옹알이 옹알이 = new 옹알이();
        int solution = 옹알이.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        int solution2 = 옹알이.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println("solution = " + solution);
        System.out.println("====================================");
        System.out.println("solution2 = " + solution2);
    }
}

