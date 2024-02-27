package print;

import java.util.Scanner;
public class main_10953 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for (int i = 0; i < tc; i++){
      String[] numbers = sc.next().split(",");
      int a = Integer.parseInt(numbers[0]);
      int b = Integer.parseInt(numbers[1]);
      System.out.println(a+b);
    }
  }
}
