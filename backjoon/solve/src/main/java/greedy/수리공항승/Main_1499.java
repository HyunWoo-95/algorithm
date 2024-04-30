package greedy.수리공항승;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1499 {

  static int N;
  static int L;
  static int[] asPoint;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    N = Integer.parseInt(st.nextToken());
    L = Integer.parseInt(st.nextToken());
    asPoint = new int[N];
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      asPoint[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(asPoint);
    int range = (int) (asPoint[0] - 0.5 + L);
   int min = 1;

    for (int i = 1; i < asPoint.length ; i++) {
      if (range < (int) (asPoint[i] - 0.5)) {
        range = (int) (asPoint[i] - 0.5 + L);
        min++;
      }
    }
    System.out.println(min);
  }
}
