package lv0.day2;

public class 치킨_쿠폰 {
    /*
     * 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
     * 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
     * 시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
     * */
    public int solution(int chicken) {
        int coupon = 0;
        int remain = 0;
        while (chicken != 0) {
            if (chicken % 10 != 0) {
                remain += chicken % 10;
            }
            chicken /= 10;
            coupon += chicken;
        }

        System.out.println("remain = " + remain);
        System.out.println("coupon = " + coupon);
        System.out.println("remain % 10 + remain = " + (remain % 10 + remain / 10) / 10);

        return coupon + ((remain % 10 + remain / 10) >= 10 ? (remain / 10) + (remain % 10 + remain / 10) / 10 : (remain / 10));
    }

    public static void main(String[] args) {
        치킨_쿠폰 치킨_쿠폰 = new 치킨_쿠폰();
        int solution = 치킨_쿠폰.solution(1999);
        System.out.println("solution = " + solution);
    }
}
