package lv0.day1;

public class 제곱수_판별하기 {
    /*
    어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
    정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
    * */
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        return sqrt == Integer.valueOf((int) sqrt) ? 1 : 2;
    }

    public static void main(String[] args) {
        제곱수_판별하기 제곱수_판별하기 = new 제곱수_판별하기();
        int solution = 제곱수_판별하기.solution(976);
        System.out.println("solution = " + solution);
    }
}
