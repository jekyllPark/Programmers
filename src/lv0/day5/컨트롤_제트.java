package lv0.day5;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class 컨트롤_제트 {
    /*
     * 숫자들이 공백으로 구분된 문자열이 주어집니다.
     * 문자열에 있는 숫자를 차례대로 더하려고 합니다.
     * 이 때 “Z”가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
     * 숫자와 “Z”로 이루어진 문자열 s가 주어질 때,
     * 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
     * */
    public int solution(String s) {
        AtomicInteger answer = new AtomicInteger();
        String[] arr = s.split(" ");
//        Queue<String> q = new LinkedList<>();
//        for (String a : arr) {
//            q.add(a);
//        }
//        ArrayList<String> temp = new ArrayList<>();
//
//        while (!q.isEmpty()) {
//            System.out.println("q = " + q);
//            System.out.println("answer = " + answer);
//            String val = q.poll();
//            System.out.println("val = " + val);
//            if (!val.equals("Z")) {
//                answer.addAndGet(Integer.parseInt(val));
//                temp.add(val);
//            } else {
//                if (q.peek().equals("Z")) {
//                    answer.addAndGet(-Integer.parseInt(temp.get(temp.size() - 1)));
//                    temp.remove(temp.get(temp.size() - 1));
//                    System.out.println("temp = " + temp);
//                    while (!q.isEmpty()) {
//                        String val2 = q.poll();
//                        if (val2.equals("Z")) {
//                            answer.addAndGet(-Integer.parseInt(temp.get(temp.size() - 1)));
//                            temp.remove(temp.get(temp.size() - 1));
//                        } else {
//                            answer.addAndGet(Integer.parseInt(val2));
//                        }
//                    }
//                } else {
//                    answer.addAndGet(-Integer.parseInt(temp.get(temp.size() - 1)));
//                    temp.remove(temp.get(temp.size() - 1));
//                }
//            }
//        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
            if (arr[i].equals("Z")) {
                stack.pop();
                if (stack.size() >= 1) {
                    stack.pop();
                }
            }
        }


        stack.forEach(v -> answer.addAndGet(Integer.parseInt(v)));


        return answer.get();
    }

    public static void main(String[] args) {
        컨트롤_제트 컨트롤_제트 = new 컨트롤_제트();
        int solution = 컨트롤_제트.solution("1 -2 Z Z 3");
        System.out.println("solution = " + solution);
    }
}
