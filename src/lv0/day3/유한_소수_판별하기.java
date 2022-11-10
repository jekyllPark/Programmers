package lv0.day3;

public class 유한_소수_판별하기 {
    /*
    * 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
    * 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
    * 유한소수가 되기 위한 분수의 조건은 다음과 같습니다. 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
    * 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을,
    * 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
    * */
    public int solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        while(min != 0) { //gcd (최대 공약수 구하는 법) cf. 최소 공배수는 두 수의 곱 / 최대 공약수
            int r = max % min;
            max = min;
            min = r;
        }
        int c = b/max; //분모를 최대 공약수로 약분하면 기약분수
        if(c % 2 == 0 || c % 5 == 0 || c == 1){ // 유한소수는 분모의 소인수가 2 또는 5, 하지만 3으로는 나누어 떨어지면 안됨, 또한 정수도 유한소수이기에 1도 유한소수
            if(c % 3 != 0) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        유한_소수_판별하기 유한_소수_판별하기 = new 유한_소수_판별하기();
        int solution = 유한_소수_판별하기.solution(3500, 500);
        System.out.println("solution = " + solution);
    }
}
