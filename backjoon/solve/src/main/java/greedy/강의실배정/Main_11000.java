package greedy.강의실배정;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_11000 {
  static int N;
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    /*
    time[][0] 은 시작지점을 의미
    time[][1] 은 시작지점을 의미
     */
    int[][] time = new int[N][2];
    for (int i = 0; i < N; i++) {
      time[i][0] = sc.nextInt();
      time[i][1] = sc.nextInt();
    }
    Arrays.sort(time, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        // 종료 시간이 같을 경우 시작시간이 빠른 순으로 정렬
        if (o1[0] == o2[0]) {
          return o1[1] - o2[1];
        }
        return o1[0] - o2[0];
      }
    });
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(time[0][1]);
    for (int i = 1; i < N; i++) {
      if (pq.peek() <=time[i][0]) pq.poll();
      pq.add(time[i][1]);
    }
    System.out.println(pq.size());
  }
}
