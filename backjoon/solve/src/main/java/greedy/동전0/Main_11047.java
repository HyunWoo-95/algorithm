package greedy.동전0;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_11047 {

  static int coin; // 코인종류의 수
  static int MONEY;
  static int[] types;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    coin = Integer.parseInt(st.nextToken());
    MONEY = Integer.parseInt(st.nextToken()); // 돈

    int cnt = 0;
    types = new int[coin];

    for (int i = 0; i < coin; i++) {
      types[i] = Integer.parseInt(br.readLine());
    }

    for (int i = coin - 1; i >= 0; i--) {
      if (MONEY >= types[i]) {
        cnt += MONEY / types[i];
        MONEY = MONEY % types[i];
      }
    }
    System.out.println(cnt);

  }

}
