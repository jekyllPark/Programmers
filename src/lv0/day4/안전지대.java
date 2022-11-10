package lv0.day4;

import java.util.Arrays;
//다시풀기
public class 안전지대 {
    /*
    *  다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
        image.png
        지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
        지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
    * */
    public int solution(int[][] board) {
        int answer = 0;
        int boomExplosionRange = 1;
        int[][] copyBoard = new int[board.length][board[0].length];

        int tempIndex = 0;
        for (int[] rows : board) {
            copyBoard[tempIndex] = Arrays.copyOf(rows, board[tempIndex].length);
            tempIndex++;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];

                if(val == 0) continue;

                makeBoomArea(i, j, boomExplosionRange,copyBoard);
            }
        }

        for (int[] ints : copyBoard) {
            for (int anInt : ints) {
                if(anInt == 0)
                    answer++;
            }
        }

        return answer;
    }

    private void makeBoomArea(int row, int col, int boomExplosionRange, int[][] board) {
        for (int r = row - boomExplosionRange; r <= row + boomExplosionRange ; r++) {
            if(r < 0 || r >= board.length) continue;

            for (int c = col - boomExplosionRange; c <= col + boomExplosionRange; c++) {
                if(c < 0 || c >= board[0].length) continue;

                board[r][c] = 1;
            }
        }
    }


    public static void main(String[] args) {
        안전지대 안전지대 = new 안전지대();
        int solution = 안전지대.solution(new int[][]{{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}});
        System.out.println("solution = " + solution);
    }
}
