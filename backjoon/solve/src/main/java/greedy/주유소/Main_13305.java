package greedy.주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13305 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()); // 도시의 수
    long[] dist = new long[n - 1]; // 옆도시로 넘어갈때마다의 거리
    long[] cost = new long[n];  //  각 도시의 주유비
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n - 1; i++) {
      dist[i] = Long.parseLong(st.nextToken());
    }
    st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < n; i++) {
      cost[i] = Long.parseLong(st.nextToken());
    }
    long sum = 0;
    long minCost = cost[0]; // 이전까지 도시에서의 최소 비용

    for (int i = 0; i < n - 1; i++) {
      // 현재 주유소가 이전 주유소의 비용보다 저렴할시 최소비용 갱신
      if (cost[i] < minCost) {
        minCost = cost[i];
      }
      sum += (minCost * dist[i]);
    }
    System.out.println(sum);
  }

}
