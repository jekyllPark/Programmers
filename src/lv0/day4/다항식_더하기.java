package lv0.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class 다항식_더하기 {
    /*
     * 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
     * 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
     * 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
     * 같은 식이라면 가장 짧은 수식을 return 합니다.
     * */
    public String solution(String polynomial) {
        String answer = "";
        Queue<String> q = new LinkedList<>();
        for (String c : polynomial.replaceAll(" ", "").split("\\+")) {
            q.add(c);
        }
        AtomicInteger xSum = new AtomicInteger();
        AtomicInteger iSum = new AtomicInteger();

        q.stream().forEach(v-> {
            if(v.contains("x")) {
                if(v.length() > 1){
                    xSum.addAndGet(Integer.parseInt(v.substring(0, v.indexOf('x'))));
                } else {
                    xSum.getAndIncrement();
                }
            } else {
                iSum.addAndGet(Integer.parseInt(v));
            }
        });

        System.out.println("xSum = " + xSum);
        System.out.println("iSum = " + iSum);
        System.out.println("q = " + q);

        if(xSum.get() != 0) {
            if(iSum.get() != 0) {
                answer = (xSum.get() != 1 ? xSum+"" : "") + "x + " + iSum ;
            } else {
                answer = (xSum.get() != 1 ? xSum+"" : "") + "x";
            }
        } else {
            answer = iSum + "";
        }

        return answer;
    }

    public static void main(String[] args) {
        다항식_더하기 다항식_더하기 = new 다항식_더하기();
        String solution = 다항식_더하기.solution("2 + 10 + x");
        System.out.println("solution = " + solution);
    }
}
