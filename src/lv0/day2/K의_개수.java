package lv0.day2;

public class K의_개수 {
    /*
    * 1부터 13까지의 수에서,
    * 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
    * 정수 i, j, k가 매개변수로 주어질 때,
    * i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
    * */
    public int solution(int i, int j, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for(int idx = i; idx <= j; idx++) {
            sb.append(idx);
        }

        for(char c : String.valueOf(sb).toCharArray()) {
            if(String.valueOf(c).equals(String.valueOf(k))) {
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        K의_개수 k의_개수 = new K의_개수();
        int solution = k의_개수.solution(1, 13, 1);
        System.out.println("solution = " + solution);
    }
}
