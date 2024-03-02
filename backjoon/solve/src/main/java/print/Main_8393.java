package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_8393 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    br.close();
    int result = 0;
    for (int i = 1; i<=t; i++){
      result += i;
    }
    System.out.println(result);
  }
}
