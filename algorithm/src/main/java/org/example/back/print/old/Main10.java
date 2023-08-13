package org.example.back.print.old;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = b % 10; // 5
        int d = (b % 100) / 10; //8
        int e = b / 100;
        int result = a * b;
        System.out.println(c * a);
        System.out.println(d * a);
        System.out.println(e * a);
        System.out.println(result);
    }
}
