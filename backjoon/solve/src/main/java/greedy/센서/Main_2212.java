package greedy.센서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
// 큐 자료구조를 사용하지 않는 방법으로 다시 풀기
public class Main_2212 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int K = Integer.parseInt(br.readLine());

    int[] intArr = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      intArr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(intArr);
    Queue<Integer> q = new PriorityQueue<>();
    for (int i = 0; i < N - 1; i++) {
      q.offer(intArr[i + 1] - intArr[i]);
    }
    int res = 0;
    for (int i = 0; i < N - K; i++) {
      res += q.poll();
    }
    System.out.println(res);
  }
}
