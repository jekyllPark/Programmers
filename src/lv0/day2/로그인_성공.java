package lv0.day2;

public class 로그인_성공 {
    /*
     * 머쓱이는 프로그래머스에 로그인하려고 합니다.
     * 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
     * 다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.
     * 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
     * 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
     * */
    public String solution(String[] id_pw, String[][] db) {
        for (int i = 0; i < db.length; i++) {
            for (int j = 0; j < db[i].length; j++) {
                if (id_pw[0].equals(db[i][0])) {
                    if (id_pw[1].equals(db[i][1])) {
                        return "login";
                    } else {
                        return "wrong pw";
                    }
                } else {
                    continue;
                }
            }
        }
        return "fail";
    }

    public static void main(String[] args) {
        로그인_성공 로그인_성공 = new 로그인_성공();
        String solution = 로그인_성공.solution(
                new String[]{"programmer01", "15789"}
                , new String[][]{
                        {"programmer02", "111111"}
                        , {"programmer00", "134"}
                        , {"programmer01", "1145"}
                        , {"programmer11", "114555"}
                }
                );
        System.out.println("solution = " + solution);
    }
}
