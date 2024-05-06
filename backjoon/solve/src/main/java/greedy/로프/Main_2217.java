package greedy.로프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main_2217 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Integer[] weight = new Integer[N]; // 각 로프마다의 중량
    int avg = 0;
    for (int i = 0; i < N; i++) {
      weight[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(weight, Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      avg = Math.max(avg, weight[i] * (i + 1));
    }
    System.out.println(avg);
  }

}
