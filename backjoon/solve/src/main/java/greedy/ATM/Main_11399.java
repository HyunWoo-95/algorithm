package greedy.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_11399 {

  static int n;
  static int[] times;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    times = new int[n];
    for (int i = 0; i < n; i++) {
      times[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(times);
    int res = 0;
    int prev = 0;
    for (int i = 0; i < n; i++) {
      prev += times[i];

      res += prev;


    }
    System.out.println(res);
  }

}
