package lv0.day2;


public class A로_B_만들기 {
    /*
     * 문자열 before와 after가 매개변수로 주어질 때,
     * before의 순서를 바꾸어 after를 만들 수 있으면 1을,
     * 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
     *
     * */
    public int solution(String before, String after) {
        int bSum = 0;
        int aSum = 0;
        for (char b : before.toCharArray()) {
            bSum += b - '0';
        }
        for (char a : after.toCharArray()) {
            aSum += a - '0';

        }
        return aSum == bSum ? 1 : 0;

//        char[] a = before.toCharArray();
//        char[] b = after.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return new String(a).equals(new String(b)) ? 1 :0;
    }

    public static void main(String[] args) {
        A로_B_만들기 a로_b_만들기 = new A로_B_만들기();
        int solution = a로_b_만들기.solution("olleh", "hello");
        System.out.println("solution = " + solution);
    }
}
