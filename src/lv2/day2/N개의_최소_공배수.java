package lv2.day2;

public class N개의_최소_공배수 {
    /*
     * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
     * 예를 들어 2와 7의 최소공배수는 14가 됩니다.
     * 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
     * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
     * */
    public static int solution(int[] arr) {
        int answer = 0;
        if (arr.length == 1) return arr[0];
        int g = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / g;

        if (arr.length > 2) {
            for (int i = 0; i < arr.length; i++) {
                g = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / g;
            }
        }
        return answer;
    }

    /** 최대 공약수 */
    public static int gcd(int a, int b) {
        int r = a % b;
        if (r == 0) return b;
        else return gcd(b, r);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
    }
}
