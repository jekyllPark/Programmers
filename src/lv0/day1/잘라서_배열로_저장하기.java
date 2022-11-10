package lv0.day1;

public class 잘라서_배열로_저장하기 {
    /*
     * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
     * */
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int length = my_str.length() % n > 0 ? my_str.length() / n + 1 : my_str.length() / n;
        answer = new String[length];

        answer[0] = my_str.substring(0, n);
        int tmp = n;
        for (int i = 1; i < length; i++) {
            System.out.println("tmp = " + tmp);
            answer[i] = tmp + n > my_str.length() ? my_str.substring(tmp) : my_str.substring(tmp, tmp + n);
            tmp += n;
        }
        return answer;
    }

    public static void main(String[] args) {
        잘라서_배열로_저장하기 잘라서_배열로_저장하기 = new 잘라서_배열로_저장하기();
        String[] abc1Addfggg4556bs = 잘라서_배열로_저장하기.solution("abc1Addfggg4556b", 6);
        for(String a : abc1Addfggg4556bs) {
            System.out.println("a = " + a);
        }
    }
}
