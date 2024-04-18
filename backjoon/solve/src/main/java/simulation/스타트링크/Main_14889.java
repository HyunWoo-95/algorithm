package simulation.스타트링크;

import java.util.Scanner;

public class Main_14889 {
    static int N;
    static int[][] member;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        member = new int[N][N];
        visit = new boolean[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                member[i][j] = sc.nextInt();
            }
        }
        team(0, 0);
        System.out.println(Min);
    }

    static void team(int idx, int count) {

        if (count == N / 2) {
            diff();
            return;
        }
        for (int i = idx; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                team(i + 1, count + 1);
                visit[i] = false;
            }
        }
    }

    static void diff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {

                if (visit[i] == true && visit[j] == true) {
                    start += member[i][j];
                    start += member[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    link += member[i][j];
                    link += member[j][i];
                }
            }
        }
        int val = Math.abs(start - link);

        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }
        Min = Math.min( Min,val);
    }

}
