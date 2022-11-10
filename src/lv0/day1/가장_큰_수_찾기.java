package lv0.day1;

public class 가장_큰_수_찾기 {
    /*
    * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    * */
    public int[] solution(int[] array) {
        int[] answer = new int[1];

        int max = 0;
        int cnt = 0;
        for(int a : array) {
            if(max < a){
                max = a;
            }
        }
        System.out.println("max = " + max);

        for(int a : array) {
            if(a == max) {
                break;
            }
            cnt++;
        }

        answer = new int[] {max, cnt};

        return answer;

//        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//        int max = list.stream().max(Integer::compareTo).orElse(0);
//        int index = list.indexOf(max);
//        return new int[] {max, index};
    }

    public static void main(String[] args) {
        가장_큰_수_찾기 가장_큰_수_찾기 = new 가장_큰_수_찾기();
        int[] solution = 가장_큰_수_찾기.solution(new int[]{1, 8, 3});
        for(int s : solution) {
            System.out.println("s = " + s);
        }
    }
}
