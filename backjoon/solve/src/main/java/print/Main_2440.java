package print;

import static java.lang.System.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_2440 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    int T = Integer.parseInt(br.readLine());
    br.close();
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= T; i++) { // 행 5줄 출력
      for (int j = T; j >= i; j--) { // 1행에 T만큼찍고 줄바꿈 시마다 j를 1개씩 감소
        sb.append("*");
      }
      sb.append('\n');
    }
    out.print(sb);
  }
}
