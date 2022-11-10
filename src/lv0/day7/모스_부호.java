package lv0.day7;

public class 모스_부호 {
    /*
     * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
     * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
     * 문자열 letter가 매개변수로 주어질 때,
     * letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
     * */
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        for (String l : letter.split(" ")) {
            if(l.equals(".-")) sb.append("a");
            if(l.equals("-...")) sb.append("b");
            if(l.equals("-.-.")) sb.append("c");
            if(l.equals("-..")) sb.append("d");
            if(l.equals(".")) sb.append("e");
            if(l.equals("..-.")) sb.append("f");
            if(l.equals("--.")) sb.append("g");
            if(l.equals("....")) sb.append("h");
            if(l.equals("..")) sb.append("i");
            if(l.equals(".---")) sb.append("j");
            if(l.equals("-.-")) sb.append("k");
            if(l.equals(".-..")) sb.append("l");
            if(l.equals("--")) sb.append("m");
            if(l.equals("-.")) sb.append("n");
            if(l.equals("---")) sb.append("o");
            if(l.equals(".--.")) sb.append("p");
            if(l.equals("--.-")) sb.append("q");
            if(l.equals(".-.")) sb.append("r");
            if(l.equals("...")) sb.append("s");
            if(l.equals("-")) sb.append("t");
            if(l.equals("..-")) sb.append("u");
            if(l.equals("...-")) sb.append("v");
            if(l.equals(".--")) sb.append("w");
            if(l.equals("-..-")) sb.append("x");
            if(l.equals("-.--")) sb.append("y");
            if(l.equals("--..")) sb.append("z");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        모스_부호 모스_부호 = new 모스_부호();
        String solution = 모스_부호.solution(".--. -.-- - .... --- -.");
        System.out.println("solution = " + solution);
    }
}
