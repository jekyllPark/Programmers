package lv0.day6;


public class 합성수_찾기 {
    /*
     * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
     * 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (isMixNum(i)) {
                answer++;
            }
        }
        return answer;
//        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }

    public boolean isMixNum(int num) {
        int cnt = 0;
        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                 cnt++;
            }
        }
        return cnt >= 2 ? true : false;
    }

    public static void main(String[] args) {
        합성수_찾기 합성수_찾기 = new 합성수_찾기();
        int solution = 합성수_찾기.solution(15);
        System.out.println("solution = " + solution);
    }
}
