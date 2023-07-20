package org.example.back.print;

import java.util.Scanner;
public class Main07 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();
        for (int i = 1; i<=t; i++){
            int a, b;
            a =scr.nextInt();
            b = scr.nextInt();
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }
    }
}
