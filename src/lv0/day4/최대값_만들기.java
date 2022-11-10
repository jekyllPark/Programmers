package lv0.day4;

public class 최대값_만들기 {
    /*
     * 정수 배열 numbers가 매개변수로 주어집니다.
     * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i != j){
                    int multiple = numbers[i] * numbers[j];
                    System.out.println("multiple = " + multiple);
                    if (max < multiple) {
                        max = multiple;
                    }
                }
            }
        }
        System.out.println("max = " + max);
        return max;
    }

    public static void main(String[] args) {
        최대값_만들기 최대값_만들기 = new 최대값_만들기();
//        int solution = 최대값_만들기.solution(new int[]{1, 2, -3, 4, -5});
        int solution = 최대값_만들기.solution(new int[]{10, 20, 30, 5, 5, 20, 5});
        System.out.println("solution = " + solution);

    }
}
