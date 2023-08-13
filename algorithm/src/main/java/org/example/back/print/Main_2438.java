package org.example.back.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();
        char b = '*';
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(b);
            }
            System.out.println();

        }
    }
}
