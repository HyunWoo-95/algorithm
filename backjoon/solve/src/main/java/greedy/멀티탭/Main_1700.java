package greedy.멀티탭;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
 // 다른 방법도 보기
public class Main_1700 {

  static int N;
  static int T; // 도구들

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    N = Integer.parseInt(st.nextToken());
    T = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int[] P = new int[T];
    for (int i = 0; i < T; i++) {
      P[i] = Integer.parseInt(st.nextToken());
    }
    boolean[] use = new boolean[101];
    int put = 0;
    int res = 0;
    for (int i = 0; i < T; i++) {
      int temp = P[i];

      if (!use[temp]) {
        if (put < N) {
          use[temp] = true;
          put++;
        } else {
          ArrayList<Integer> arrayList = new ArrayList<>();
          for (int j = i; j < T; j++) {
            if (use[P[j]] && !arrayList.contains(P[j])) {
              arrayList.add(P[j]);
            }
          }
          if (arrayList.size() != N) {
            for (int j = 0; j < use.length; j++) {
              if (use[j] && !arrayList.contains(j)) {
                use[j] = false;
                break;
              }
            }
          } else {
            int remove = arrayList.get(arrayList.size() - 1);
            use[remove] = false;
          }
          use[temp] = true;
          res++;
        }
      }
    }
    bw.write(res + "\n");
    bw.flush();
    bw.close();
    br.close();
  }

}
