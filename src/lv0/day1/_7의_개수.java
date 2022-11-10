package lv0.day1;

public class _7의_개수 {
    /*
     * 머쓱이는 행운의 숫자 7을 가장 좋아합니다.
     * 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
     * */

    public int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int a : array) {
            sb.append(a);
        }
        char[] chars = sb.toString().toCharArray();
        for (char c : chars) {
            if (c == '7') {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _7의_개수 의_개수 = new _7의_개수();
        int solution = 의_개수.solution(new int[]{7, 77, 17});
        System.out.println("solution = " + solution);
    }
}
