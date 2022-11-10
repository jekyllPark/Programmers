package lv0.day2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 특이한_정렬 {
    /*
     * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
     * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
     * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터
     * 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * */
    public Integer[] solution(int[] numlist, int n) {
        int[] answer = {};

        List<Integer> temp = IntStream.of(numlist).boxed().collect(Collectors.toList());

        temp.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int o1Abs = Math.abs(o1 - n);
                int o2Abs = Math.abs(o2 - n);

                System.out.println("o1Abs = " + o1Abs);
                System.out.println("o2Abs = " + o2Abs);

                if (o1Abs == o2Abs) {
                    if (o1 > o2) return -1;
                    else return 1;
                } else {
                    return o1Abs - o2Abs;
                }
            }
        });

        return temp.toArray(new Integer[0]);

//        return Arrays.stream(numList)
//                .boxed()
//                .sorted((a, b) -> Math.abs(a - n) == Math.abs(b - n) ? b.compareTo(a) : Integer.compare(Math.abs(a - n), Math.abs(b - n)))
//                .mapToInt(Integer::intValue)
//                .toArray();
    }

    public static void main(String[] args) {
        특이한_정렬 특이한_정렬 = new 특이한_정렬();
        Integer[] solution = 특이한_정렬.solution(new int[]{1, 2, 3, 4, 5, 6}, 4);
        for(int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
