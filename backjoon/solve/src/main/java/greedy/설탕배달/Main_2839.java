package greedy.설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2839 {

  static int N; // 배달해야할 설탕의 수

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    br.close();
    int cnt = 0;
    while (N > 0) {
      if (N % 5 == 0) {
        cnt += N / 5;
        break;
      } else {
        N -= 3;
        cnt++;
      }
      if (N < 0) {
        cnt = -1;
      }
    }
    System.out.println(cnt);
  }
}
