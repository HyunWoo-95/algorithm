package org.example.back.print;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();
        for (int i = 0; i < t; i++){
            int a, b;
            a = scr.nextInt();
            b = scr.nextInt();
            System.out.println(a+b);
        }
    }
}
