package lv1.day8;

public class 시저_암호 {
    /*
     * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
     * 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
     * "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
     * */
    public String solution(String s, int n) {
        String answer = "";
        for (char c : s.toCharArray()) {
            if ((int) c >= 97 && (int) c <= 122) {
                if (c + n > 122) {
                    int remain = (c + n) - 122 - 1;
                    answer += (char) (97 + remain);
                } else {
                    answer += (char) (c + n);
                }
            } else if ((int) c >= 65 && (int) c <= 90) {
                if (c + n > 90) {
                    int remain = (c + n) - 90 - 1;
                    answer += (char) (65 + remain);
                } else {
                    answer += (char) (c + n);
                }
            } else if(c == ' ') {
                answer += " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        시저_암호 시저_암호 = new 시저_암호();
        String ab = 시저_암호.solution("Z", 1);
        System.out.println("ab = " + ab);
        System.out.println((int) 'Z');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((char) ('B' + 4));
    }
}
