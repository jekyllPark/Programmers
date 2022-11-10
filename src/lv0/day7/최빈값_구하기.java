package lv0.day7;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class 최빈값_구하기 {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        AtomicInteger frequentNum = new AtomicInteger();
        AtomicInteger key = new AtomicInteger();
        map.entrySet().forEach(v -> {
            if (v.getValue() > frequentNum.get()) {
                frequentNum.set(v.getValue());
                key.set(v.getKey());
            }
        });
        AtomicInteger cnt = new AtomicInteger();
        map.entrySet().forEach(v -> {
            if (v.getValue() == frequentNum.get()) {
                cnt.getAndIncrement();
            }
        });
        return cnt.get() > 1 ? -1 : key.get();
    }

    public static void main(String[] args) {
        최빈값_구하기 최빈값_구하기 = new 최빈값_구하기();
        int solution = 최빈값_구하기.solution(new int[]{1, 1, 2, 2});
        System.out.println("solution = " + solution);
    }
}
