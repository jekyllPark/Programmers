package lv0.day1;

public class 배열의_유사도 {
    /*
     * 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
     * */
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String ss1 : s1) {
            for (String ss2 : s2) {
                if (ss2.equals(ss1)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        배열의_유사도 배열의_유사도 = new 배열의_유사도();
        int solution = 배열의_유사도.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
        System.out.println("solution = " + solution);
    }
}
