package lv1.day1;

public class 평균구하기 {
    public long solution(int n) {
        long answer = 0;
        Double sqrt = Math.sqrt(n);
        System.out.println("sqrt = " + sqrt);

        System.out.println(sqrt.intValue());
        if(sqrt == sqrt.intValue()){
            return (long)Math.pow(sqrt + 1, 2);
        } else return -1;
    }

    public static void main(String[] args) {
        평균구하기 test = new 평균구하기();
        long solution = test.solution(3);
        System.out.println("solution = " + solution);
    }
}
