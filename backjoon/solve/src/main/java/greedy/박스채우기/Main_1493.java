package greedy.박스채우기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_1493 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int L = Integer.parseInt(st.nextToken());
    int W = Integer.parseInt(st.nextToken());
    int H = Integer.parseInt(st.nextToken());

    int N = Integer.parseInt(br.readLine());

    int[] cube = new int[N];
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int t = Integer.parseInt(st.nextToken()); // 큐브 종류
      int f = Integer.parseInt(st.nextToken());  // 개수

      cube[t] = f;
    }
    long before = 0; // 이전에 사용된 큐브 수
    long res = 0;

    for (int i = N - 1; i >= 0; i--) {
      before <<= 3;

      long possibleCube = (long) (L >> i) * (W >> i) * (H >> i) - before;
      long newCube = Math.min((long) cube[i], possibleCube);

      before += newCube;
      res += newCube;
    }
    if (before == (long) L * W * H) { // 위에서 계산한 before가 실제 박스의 부피와 같아야 함.
      bw.write(res + "\n");
    } else { // 같지 않으면, 주어진 큐브로는 박스를 구성할 수 없다.
      bw.write("-1\n");
    }

    bw.flush();
    bw.close();
    br.close();
  }

}
