package simulation.빙고;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2578 {

  static int[][] map = new int[5][5]; // 빙고판
  static int num; // 사회자의 숫자 발표 횟수
  static int count; // 빙고 갯수

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 빙고판 채우기
    for (int i = 0; i < 5; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    // 숫자를 부른다
    for (int i = 0; i < 5; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 5; j++) {
        num++;
        bingo(Integer.parseInt(st.nextToken()));
        bingoCheck();
        if (count >= 3) {
          System.out.println(num);
          return;
        }

      }
    }

  }

  // 사회자가 부른 숫자를 -1로 변화
  private static void bingo(int n) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (map[i][j] == n) {
          map[i][j] = -1;
        }
      }
    }
  }

  // 빙고 갯수 검사
  private static void bingoCheck() {
    count = 0;
    int row = 0; // 가로
    int col = 0; // 세로
    int xy = 0; // 우측 아래로 가는 대각선
    int yx = 0; // 좌측 아래로 가는 대각선
    int index = 0;
    for (int i = 0; i < 5; i++) {
      row = 0;
      col = 0;
      for (int j = 0; j < 5; j++) {
        row += map[i][j];
        col += map[j][i];

        if (i == j) {
          xy += map[i][j];

        }
        if (i == index && j == 4 - index) {
          yx += map[i][j];
          index++;
        }
      }
      if (row == -5) {
        count++;
      }
      if (col == -5) {
        count++;
      }
      if (xy == -5) {
        count++;
      }
      if (yx == -5) {
        count++;
      }
    }

  }

}
