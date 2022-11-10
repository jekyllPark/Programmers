package lv0.day7;

public class 짝수_홀수_개수 {
    /*
    * 정수가 담긴 리스트 num_list가 주어질 때,
    * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    * */
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int oddCnt = 0;
        int evenCnt = 0;
        for(int num : num_list) {
            if(num % 2 == 0) {
                oddCnt++;
            } else {
                evenCnt++;
            }
        }
        answer[0] = oddCnt;
        answer[1] = evenCnt;
        return answer;
//        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
}
