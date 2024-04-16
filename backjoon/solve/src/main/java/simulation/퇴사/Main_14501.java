package simulation.퇴사;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14501 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int n = Integer.parseInt(br.readLine());
    int[] day = new int[n + 1];
    int[] pay = new int[n + 1];
    int[] DP = new int[n + 1];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      day[i] = Integer.parseInt(st.nextToken());
      pay[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < n; i++) {
      if (i + day[i] <= n) {
        DP[i + day[i]] = Math.max(DP[i + day[i]], DP[i] + pay[i]);
      }
      DP[i + 1] = Math.max(DP[i + 1], DP[i]);
    }
    System.out.println(DP[n]);
  }

}
