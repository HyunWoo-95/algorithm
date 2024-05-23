package greedy.동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoJ_11047 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int n = Integer.parseInt(st.nextToken()); // 동전 종류
    int k = Integer.parseInt(st.nextToken()); // 금액
    int[] coin = new int[n]; // 동전의 금액
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      coin[i] = Integer.parseInt(br.readLine());
    }
// 그리디 알고리즘 사용 > 최대한 큰 동전 사용하기
    for (int i = n - 1; i >= 0; i--) {
      if (k >=coin[i]) {
        cnt += k / coin[i];
        k = k % coin[i];
      }
    }
    System.out.println(cnt);
  }

}
