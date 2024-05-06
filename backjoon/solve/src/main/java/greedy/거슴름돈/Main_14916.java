package greedy.거슴름돈;

import java.util.Scanner;

public class Main_14916 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int res = 0;

    while (n > 0) {
      if (n % 5 == 0) {
        res = n / 5 + res;
        break;
      } else  {
        n -= 2;
        res++;
      }

    }
    if (n < 0) {
      System.out.println(-1);
    } else {
      System.out.println(res);
    }
  }
}
