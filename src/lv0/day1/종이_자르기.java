package lv0.day1;

public class 종이_자르기 {
    /*
     * 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
     * */
    public int solution(int M, int N) {
        return (M * N) - 1;
    }
}
