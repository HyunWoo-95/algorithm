package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (T - i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            } // 상층부 완성
            System.out.println();
        }
        for (int a = T - 1; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            for (int c = 1; c <= 2 * (T - a); c++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= a; m++) {
                System.out.print("*");
            } // 상층부
            System.out.println();
        }
    }
}
