package lv0.day1;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class OX퀴즈 {
    /*
    덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
    * */
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < answer.length; i++) {
            String[] split = quiz[i].replaceAll("- ", "-").replaceAll(" ", "").split(" ");
            for (int j = 0; j < split.length; j++) {
                String left = split[j].substring(0, split[j].indexOf("="));
                String right = split[j].substring(split[j].indexOf("=") + 1);

                int leftInt = 0;
                int rightInt = 0;
                String[] split1 = left.split("\\+");
                for (String s1 : split1) {
                    if (s1.startsWith("-")) {
                        String substring = left.substring(1);
                        if (substring.contains("+")) {
                            leftInt = Integer.parseInt(split1[0]) * -1;
                            rightInt = Integer.parseInt(split1[1]);
                        } else {
                            String[] split2 = substring.split("-");
                            leftInt = Integer.parseInt(split2[0]) * -1;
                            rightInt = Integer.parseInt(split2[1]) * -1;
                        }
                    } else {
                        if (s1.contains("-")) {
                            String[] split2 = s1.split("-");
                            leftInt = Integer.parseInt(split2[0]);
                            rightInt = Integer.parseInt(split2[1]) * -1;
                        } else {
                            leftInt = Integer.parseInt(split1[0]);
                            rightInt = Integer.parseInt(split1[1]);
                        }
                    }
                }
                System.out.println(leftInt + " + " + rightInt + " = " + Integer.parseInt(right));
                if (leftInt + rightInt == Integer.parseInt(right)) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }

    public String[] solutionV2(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            Queue<String> q = new LinkedList<>(Arrays.stream(quiz[i].split(" ")).collect(Collectors.toList()));
            int result = 0;
            while (!q.isEmpty()) {
                String s = q.poll();
                if (s.equals("-")) result -= Integer.parseInt(q.poll());
                else if (s.equals("+")) result += Integer.parseInt(q.poll());
                else if (s.equals("=")) {
                    answer[i] = (result == Integer.parseInt(q.poll())) ? "O" : "X";
                }
                else result = Integer.parseInt(s);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        OX퀴즈 ox퀴즈 = new OX퀴즈();
//        String[] solution = ox퀴즈.solution(new String[]{"1 - 2 = -1", "1 + 2 = 3", "-190 + 6 = 13", "-5 - 664 = 71", "5 - 157 = 63", "3 - 1 = 2", "0 - 0 = 0", "9999 + 10001 = 20000", "1 - 0 = 1"});
//        for (String s : solution) {
//            System.out.println(s);
//        }

        OX퀴즈 ox퀴즈 = new OX퀴즈();
        String[] answer = ox퀴즈.solutionV2(new String[]{"1 - 2 = -1", "1 + 2 = 3", "-190 + 6 = 13", "-5 - 664 = 71", "5 - 157 = 63", "3 - 1 = 2", "0 - 0 = 0", "9999 + 10001 = 20000", "1 - 0 = 1"});

        System.out.println(Arrays.toString(answer));
    }

}
