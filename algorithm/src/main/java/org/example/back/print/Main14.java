package org.example.back.print;

import java.util.Scanner;
public class Main14 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int x;
        for (int i = 1; i<=9 ; i++) {
            x = n*i;
            System.out.println(n+ "*" +i+ "=" +x);
        }
    }
}
