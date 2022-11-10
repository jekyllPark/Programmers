package lv0.day1;

public class 연속된_수의_합 {
    /**
     * 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
     * 두 정수 num과 total이 주어집니다.
     * 연속된 수 num개를 더한 값이 total이 될 때,
     * 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
     */
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = num * (num + 1) / 2;
        int offset = (total - sum) / num;
        for (int i = 1; i <= num; i++) {
            answer[i - 1] = i + offset;
        }
        return answer;
    }

    public static void main(String[] args) {
        연속된_수의_합 연속된_수의_합 = new 연속된_수의_합();
        int[] solution = 연속된_수의_합.solution(3, 15);
        for (int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
