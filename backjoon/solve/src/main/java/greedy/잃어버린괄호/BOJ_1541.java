package greedy.잃어버린괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1541 {

  static int answer = 0;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String example = br.readLine();
    String[] str = example.split("-");

    for (int i = 0; i<str.length; i++){
      int temp = mySum(str[i]);
      if (i == 0) answer = answer+ temp;
      else answer = answer - temp;
    }
    System.out.println(answer);
  }
  /**
   *  결과 변수
   *  입력값을 "-" 기준으로 split
   *  나눠진 데이터 개수만큼 반복하기
   *  mySym 함수 실행
   *  현재 들어온 데이터를 "+" 기준으로 split
   *  스트링 값을 Integer값으로 형변환
   *  if 가장 앞 데이터일 경우 answer에 더하고 아니라면 answer에서 빼기
    */
  private static int mySum(String s) {
    int sum = 0;
    String[] temp = s.split("[+]");
    for (int i = 0; i < temp.length; i++){
      sum = sum + Integer.parseInt(temp[i]);
    }

    return sum ;
  }

}
