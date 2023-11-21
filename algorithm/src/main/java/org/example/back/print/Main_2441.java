package org.example.back.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 0; i <= a; i++) {
            for (int j = a-i; j <a; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < a; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
