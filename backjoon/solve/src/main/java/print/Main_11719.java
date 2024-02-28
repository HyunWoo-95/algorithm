package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main_11719 {

  public static void main(String[] args) throws IOException {
//    Scanner sc = new Scanner(System.in);
//    while (sc.hasNext()){
//      String a = sc.nextLine();
//      System.out.println(a);
//    }
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while ((s= br.readLine())!=null){
      System.out.println(s);
    }
    br.close();
  }
}
