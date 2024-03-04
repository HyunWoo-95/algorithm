package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2438 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    char b = '*';
    for (int i = 1; i <= t; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(b);
      }
      System.out.println();
    }
  }
}
