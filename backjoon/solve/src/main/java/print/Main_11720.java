package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_11720 {
  public static void main(String[] args) throws IOException {
    //  각 문자의 아스키코드 값을 저장하므로 반드시 '0' 또는 48 을 빼주어야 한다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int result = 0;
    for (int i = 0; i<n; i++){
      result += br.read()-48;
    }
    System.out.println(result);
    br.close();
    }
}
