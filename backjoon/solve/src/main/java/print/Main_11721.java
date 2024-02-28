package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_11721 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      System.out.print(s.charAt(i));
      count++;
      if (count == 10) {
        System.out.println();
        count = 0;
      }
    }
    br.close();
  }
}
