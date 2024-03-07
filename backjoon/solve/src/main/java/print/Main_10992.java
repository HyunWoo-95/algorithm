package print;

import java.io.*;
public class Main_10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        br.close();
        for (int i = T; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                bw.write(' ');
            }
            bw.write("*");
            if ((T - i) > 0) {
                for (int k = 0; k < 2 * (T - i) - 1; k++) {
                    bw.write(' ');
                }
                bw.write('*');
            }
            bw.newLine();
        }
        for (int k = 0; k < 2 * T - 1; k++) {
            bw.write('*');
        }
        bw.flush();
    }
}

//        for (int i = 1; i <= T; i++) {
//            for (int j = T; j > i; j--) {
//                System.out.print(" ");
//            }
//            if (i == T) {
//                for (int k = 0; k < 2 * i - 1; k++) {
//                    System.out.print("*");
//                }
//            } else {
//                for (int k = 0; k < 2 * i - 1; k++) {
//                    if (k == 0 || k == 2 * i - 1 - 1) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

