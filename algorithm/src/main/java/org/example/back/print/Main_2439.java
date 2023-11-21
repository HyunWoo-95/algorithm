package org.example.back.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        char b = '*';

        for(int i = 1; i <= a; i++){
            for(int j =1; j <= a-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
