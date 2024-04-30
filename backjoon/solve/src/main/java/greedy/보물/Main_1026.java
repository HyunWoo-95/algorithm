package greedy.보물;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1026 {

  static int N;
  static Integer[] A;
  static Integer[] B;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());

    int s = 0;
    A = new Integer[N];
    B = new Integer[N];
    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(st1.nextToken());
    }
    Arrays.sort(A); // 오름차순으로 정렬
    for (int j = 0; j < N; j++) {
      B[j] = Integer.parseInt(st2.nextToken());
    }
    Arrays.sort(B, Comparator.reverseOrder());

    for (int i = 0; i < N; i++) {
      s += A[i] * B[i];
    }
    System.out.println(s);
  }


}
