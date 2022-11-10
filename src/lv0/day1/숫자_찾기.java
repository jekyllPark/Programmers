package lv0.day1;

public class 숫자_찾기 {
    /*
     * 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
     * */
    public int solution(int num, int k) {
        int answer = 0;

        int length = String.valueOf(num).length();
        char[] chars = String.valueOf(num).toCharArray();
        for (char c : chars) {
            answer++;
            if ((c - 48) == k) {
                break;
            }

            if ((c - 48) != k && answer == length) {
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        숫자_찾기 숫자_찾기 = new 숫자_찾기();
        int solution = 숫자_찾기.solution(29183, 1);
        System.out.println("solution = " + solution);
    }
}
