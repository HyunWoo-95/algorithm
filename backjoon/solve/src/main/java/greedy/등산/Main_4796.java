package greedy.등산;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4796 {

  static int L; // 영업일
  static int P; // 연속일
  static int V; // 휴가 기간

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i = 1;
    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      L = Integer.parseInt(st.nextToken());
      P = Integer.parseInt(st.nextToken());
      V = Integer.parseInt(st.nextToken());
      if (L == 0 && P == 0 && V == 0) break;
      int total  = L * (V / P) + Math.min(L, V % P);
      System.out.println("Case " + i + ": " + total);
      i++;
    }
    }
  }
