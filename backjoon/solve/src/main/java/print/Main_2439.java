package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_2439 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    char b = '*';

    for (int i = 1; i <= t; i++) {
      for (int j = 1; j <= t - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(b);
      }
      System.out.println();
    }
  }
}
