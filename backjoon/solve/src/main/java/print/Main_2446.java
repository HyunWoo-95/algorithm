package print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main_2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * T - (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < T - 1; i++) {
            for (int j = 1; j < T - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 3 + (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
