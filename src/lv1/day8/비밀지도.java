package lv1.day8;

import java.util.Arrays;

public class 비밀지도 {
    /*
     * 비밀지도
     * 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
     * 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
     * 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
     * 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
     * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
     * 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
     * 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
     * "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
     * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
     * */
    private String[] toBinaryArr(int n, int[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String binary = Integer.toBinaryString(arr[i]);
            int shortage = n - binary.length();
            if (binary.length() < n) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < shortage; j++) {
                    sb.append("0");
                }
                sb.append(binary);
                result[i] = "";
                result[i] += sb.toString();
            } else {
                result[i] = binary;
            }
        }
        return result;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] binaryArr1 = toBinaryArr(n, arr1);
        String[] binaryArr2 = toBinaryArr(n, arr2);
        System.out.println(Arrays.toString(binaryArr1));
        System.out.println(Arrays.toString(binaryArr2));
        String[] mapArr = new String[binaryArr1.length];
        for (int i = 0; i < binaryArr1.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < binaryArr1[i].split("").length; j++) {
                System.out.println("binaryArr1 = " + binaryArr1[i].split("")[j]);
                System.out.println("binaryArr2 = " + binaryArr2[i].split("")[j]);
                System.out.println("============================");
                if (binaryArr1[i].split("")[j].equals("1") || binaryArr2[i].split("")[j].equals("1")) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            System.out.println("sb = " + sb);
            mapArr[i] = sb.toString();
        }
        return mapArr;
    }

    public static void main(String[] args) {
        비밀지도 비밀지도 = new 비밀지도();
        String[] solution = 비밀지도.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10});
        System.out.println(Arrays.toString(solution));
    }
}
