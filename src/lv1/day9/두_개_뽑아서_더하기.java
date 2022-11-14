package lv1.day9;

import java.util.Arrays;
import java.util.HashSet;

public class 두_개_뽑아서_더하기 {
    /*
     * 정수 배열 numbers가 주어집니다.
     * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
     * 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
     * */
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("numbers[i]+numbers[j] = " + numbers[i] + numbers[j]);
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(v -> v).toArray();
    }

    public static void main(String[] args) {
        두_개_뽑아서_더하기 두_개_뽑아서_더하기 = new 두_개_뽑아서_더하기();
        int[] solution = 두_개_뽑아서_더하기.solution(new int[]{2, 0, 2, 7});
        System.out.println(Arrays.toString(solution));
    }
}
