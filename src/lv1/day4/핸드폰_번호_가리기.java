package lv1.day4;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        char[] array = phone_number.toCharArray();
        for (int i = 0; i < array.length - 4; i++) {
            array[i] = '*';
        }
        return String.valueOf(array);
    }
}
