package greedy.최소회의실;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_19598 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int N = Integer.parseInt(br.readLine());
    PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[0] == o2[0]) {
          return o1[1] - o2[1];
        }
        return o1[0] - o2[0];
      }
    });
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      queue.add(new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
    }
    PriorityQueue<Integer> room = new PriorityQueue<>();
    room.add(queue.poll()[1]);

    while (!queue.isEmpty()) {
      int time[] = queue.poll();
      if (room.peek() <= time[0]) {
        room.poll();
      }
      room.add(time[1]);
    }
    System.out.println(room.size());
  }
}