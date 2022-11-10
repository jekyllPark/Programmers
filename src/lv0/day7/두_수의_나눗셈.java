package lv0.day7;

public class 두_수의_나눗셈 {
    public int solution(int num1, int num2) {
        return (int) ((double) num1/num2 * 1000);
    }

    public static void main(String[] args) {
        두_수의_나눗셈 두_수의_나눗셈 = new 두_수의_나눗셈();
        int solution = 두_수의_나눗셈.solution(1, 16);
        System.out.println("solution = " + solution);
    }
}
